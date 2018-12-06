package it.ilucas.checker;

import java.util.ArrayList;
import java.util.List;

import it.ilucas.beans.ServerBean;

public class ServersSingleton {
	private List<ServerBean> servers = new ArrayList<ServerBean>();
	public void save(ServerBean server) {
		servers.add(server);
	}
	
	public List<ServerBean> getServers () {
		return servers;
	}
	
	private ServersSingleton() {};

}
