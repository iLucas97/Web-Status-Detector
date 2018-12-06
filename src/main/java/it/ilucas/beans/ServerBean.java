package it.ilucas.beans;

import it.ilucas.utils.MyUtils;
import it.ilucas.utils.Utils;

public class ServerBean {
	//ok
	private Integer id = -1;
	private String name;
	private String protocol;
	private String domain;
	private String port;
	private String complete_domain;

	public ServerBean(Integer id, String protocol, String domain, String port, String complete_domain, String name) {
		super();
		this.id = id;
		this.protocol = protocol;
		this.domain = domain;
		this.port = port;
		this.complete_domain = complete_domain;
		this.name = name;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getComplete_domain() {
		return (Utils.isFilled(complete_domain) ? complete_domain : MyUtils.buildCompleteIP(protocol, domain, port));
	}

}
