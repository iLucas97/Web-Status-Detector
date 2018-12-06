package it.ilucas.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.ilucas.beans.ServerBean;
import it.ilucas.beans.ServerBeanBuilder;
import it.ilucas.checker.ServerChecker;
import it.ilucas.checker.ServerCheckerImpl;
import it.ilucas.checker.ServersSingleton;
import it.ilucas.checker.UriDetect;
import it.ilucas.models.ServerStatusModel;
import it.ilucas.models.ServerStatusModelBuilder;
import it.ilucas.utils.Constants;
import it.ilucas.utils.Utils;

@RestController
public class ServerCheckerController {
	private ServerChecker checker = new ServerCheckerImpl();

	@CrossOrigin(origins = "*")
	@RequestMapping(Constants.working_path + "/test")
	public ServerStatusModel addTest() {
		return checker.check(new ServerBeanBuilder().build(), "");
	}
    
    
    @CrossOrigin(origins = "*")
	@RequestMapping(Constants.working_path + "/add")
	public ServerStatusModel add(@RequestParam(value = "protocol", defaultValue = "http") String protocol,
			@RequestParam(value = "domain", defaultValue = "ilucas.it") String domain,
			@RequestParam(value = "port", defaultValue = "80") String port, 
			@RequestParam(value = "name", defaultValue = "iLucas Server") String name ) {
		ServerBean server = new ServerBeanBuilder()
						.setProtocol(protocol)
						.setDomain(domain)
						.setPort(port)
						.setName(name)
						.build();
		
		return checker.check(server, "");
    }
    @CrossOrigin(origins = "*")
 	@RequestMapping(Constants.working_path + "/add/fromText")
    public List<ServerStatusModel> addFromText(@RequestParam(value = "text") String text) {
    	UriDetect toDetect = new UriDetect(text);
    	List<ServerBean> beans = toDetect.broke();
    	List<ServerStatusModel>statusses = new ArrayList<>();
    	beans.forEach(server -> {
    		statusses.add(checker.check(server, ""));
    	});
    	
    	return statusses;
    }
    @CrossOrigin(origins = "*")
    @RequestMapping(Constants.working_path + "/check")
	public ServerStatusModel check(@RequestParam(value = "protocol", defaultValue = "http") String protocol,
			@RequestParam(value = "domain", defaultValue = "ilucas.it") String domain,
			@RequestParam(value = "port", defaultValue = "80") String port, 
			@RequestParam(value = "name", defaultValue = "iLucas Server") String name ) {
		return add(protocol, domain, port, name);
	}
}
