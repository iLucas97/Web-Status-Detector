package it.ilucas.checker;

import it.ilucas.beans.ServerBean;
import it.ilucas.models.ServerStatusModel;

public interface ServerChecker {
	public ServerStatusModel check(ServerBean server, String path);
	public ServerStatusModel check(ServerBean server);
}
