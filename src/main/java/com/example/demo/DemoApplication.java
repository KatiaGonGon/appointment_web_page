package com.example.demo;


import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})

public class DemoApplication {
  
    
    public static void main(String[] args) {
    	SpringApplication app = new SpringApplication(DemoApplication.class);
    	//setDeveloperAppOptions(app);
    	//ConfigurableApplicationContext appContext =  app.run(args);
    	app.run(args);
    	//appContext.run(DemoApplication.class, args);
    }
    
	/*
	 * @GetMapping("/hello") public String hello(@RequestParam(value = "name",
	 * defaultValue = "World") String name) { return String.format("Hello %s!",
	 * name); }
	 */
  
}

