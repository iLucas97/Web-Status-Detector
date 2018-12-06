package it.ilucas.models;

import org.springframework.http.HttpStatus;

import it.ilucas.beans.ServerBean;

public class ServerStatusModelBuilder {
	private ServerBean server;
	private HttpStatus status = HttpStatus.I_AM_A_TEAPOT;
	public ServerStatusModelBuilder setServer(ServerBean server) {
		this.server = server;
		return this;
	}
	public ServerStatusModelBuilder setStatus(HttpStatus status) {
		this.status = status;
		return this;
	}
	public ServerStatusModel build() {
		return new ServerStatusModel(server, status);
	}
}
