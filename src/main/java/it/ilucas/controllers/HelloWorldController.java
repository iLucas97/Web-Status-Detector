package it.ilucas.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.ilucas.beans.HelloWorldBean;
import it.ilucas.utils.Constants;

@RestController
public class HelloWorldController {
	
    @CrossOrigin(origins = "*")
	@RequestMapping(Constants.working_path + "/hello")
    public HelloWorldBean hello(@RequestParam(value="name", defaultValue="sconosciuto") String name) {
        return new HelloWorldBean(name, "benvenuto");
	}
}
