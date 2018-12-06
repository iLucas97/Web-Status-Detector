package it.ilucas.utils;

public class MyUtils extends Utils {
	private static int servers_id = 0;
	
	public static String buildCompleteIP(String protocol, String domain, String port) {
		return protocol + "://" + domain + ":"+ port +"/";
	}
	public static int getId() {
		servers_id++;
		return servers_id;
	}
}
