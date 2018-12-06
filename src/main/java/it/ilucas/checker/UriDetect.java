package it.ilucas.checker;

import java.util.ArrayList;
import java.util.List;

import com.linkedin.urls.Url;
import com.linkedin.urls.detection.UrlDetector;
import com.linkedin.urls.detection.UrlDetectorOptions;

import it.ilucas.beans.ServerBean;
import it.ilucas.beans.ServerBeanBuilder;

public class UriDetect {
	private String uriToBroke;
	private UrlDetector parser;
	public UriDetect(String uriToBroke) {
		super();
		this.setUriToBroke(uriToBroke);
		this.parser = new UrlDetector(uriToBroke, UrlDetectorOptions.Default);
	}
	public List<ServerBean> broke() {
		 
		List<ServerBean> serverBeans = new ArrayList<>();
	    List<Url> founds = parser.detect();
	    for(Url url: founds) {
	    	ServerBean server = new ServerBeanBuilder()
	    			.setName(url.getHost())
	    			.setDomain(url.getHost())
	    			.setPort(url.getPort() + "")
	    			.setProtocol(url.getScheme())
	    			.build();
	    serverBeans.add(server);
	    }
	    return serverBeans;
		//return new ServerBeanBuilder().build();
	}
	public String getUriToBroke() {
		return uriToBroke;
	}
	public void setUriToBroke(String uriToBroke) {
		this.uriToBroke = uriToBroke;
	}
}
