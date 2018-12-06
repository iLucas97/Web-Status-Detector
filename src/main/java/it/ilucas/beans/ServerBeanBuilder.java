package it.ilucas.beans;

import it.ilucas.utils.MyUtils;

public class ServerBeanBuilder {
	private Integer id = MyUtils.getId();
	private String protocol = "http";
	private String domain = "www.ilucas.it";
	private String port = "80";
	private String name = "iLucas";
	
	
	public ServerBeanBuilder setProtocol(String protocol) {
		this.protocol = protocol;
		return this;
	}
	public ServerBeanBuilder setDomain(String domain) {
		this.domain = domain;
		return this;
	}
	public ServerBeanBuilder setPort(String port) {
		this.port = port;
		return this;
	}
	public ServerBeanBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public ServerBean build() {
		return new ServerBean(id, protocol, domain, port, MyUtils.buildCompleteIP(protocol, domain, port), name);
	}

}
