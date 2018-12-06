package it.ilucas.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import it.ilucas.utils.Constants;

@SpringBootApplication
@ComponentScan({Constants.controllers_package, Constants.conf_package})
public class CheckStatusApp {

	public static void main(String[] args) {
        SpringApplication.run(CheckStatusApp.class, args);
	}

}
