package it.ilucas.beans;

import it.ilucas.utils.Utils;

public class HelloWorldBean {
	
	
	private String name;
	private String text;
	private String complete_text;
	
	public HelloWorldBean(String name, String text) {
		super();
		this.name = name;
		this.text = text;
		if(Utils.isFilled(name))
			this.complete_text = text + " " + name;
	}

	public String getName() {
		return name;
	}

	public String getText() {
		return text;
	}

	public String getComplete_text() {
		return complete_text;
	}
	
	
}
