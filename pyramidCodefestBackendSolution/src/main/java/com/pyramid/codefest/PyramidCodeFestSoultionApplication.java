package com.pyramid.codefest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PyramidCodeFestSoultionApplication {
	private static final Logger LOGGER = LogManager.getLogger(PyramidCodeFestSoultionApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PyramidCodeFestSoultionApplication.class, args);
		LOGGER.info("Server started");
	}

}
