package com.example.demo.config;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

@Component
public class ConfigServer implements WebServerFactoryCustomizer<ConfigurableWebServerFactory>{
	
	public void customize(ConfigurableWebServerFactory factory) {
		factory.setPort(8089); //this is the default port
	}
}
