package it.ilucas.models;

import org.springframework.http.HttpStatus;

import it.ilucas.beans.ServerBean;

public class ServerStatusModel {
	private ServerBean server;
	private HttpStatus status;
	
	public ServerBean getServer() {
		return server;
	}
	public void setServer(ServerBean server) {
		this.server = server;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public ServerStatusModel(ServerBean server, HttpStatus status) {
		super();
		this.server = server;
		this.status = status;
	}

}
