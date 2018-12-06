package it.ilucas.checker;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import it.ilucas.beans.ServerBean;
import it.ilucas.models.ServerStatusModel;
import it.ilucas.models.ServerStatusModelBuilder;

public class ServerCheckerImpl implements ServerChecker {
	 RestTemplate restTemplate = new RestTemplate();
	 private ServerStatusModel buildStatus ( ServerBean server, HttpStatus status) {
		 ServerStatusModel serverModel = new ServerStatusModelBuilder()
							 .setServer(server)
							 .setStatus(status)
							 .build();
		 return serverModel;
	 }
	 
	public ServerStatusModel check(ServerBean server, String path) {
		
		  ResponseEntity<String> forEntity;
		try {
			forEntity = restTemplate.getForEntity(server.getComplete_domain() + path, String.class);
			return buildStatus(server, forEntity.getStatusCode());
		} catch (Exception e) {
			
			return buildStatus(server, HttpStatus.CONFLICT);
		}
		  
		
	}

	public ServerStatusModel check(ServerBean server) {
		return check(server, "");
	}

}
