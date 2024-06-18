package com.surya.test.SpringTest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext applicationContext){
		return args -> {
			System.out.println("beans from application context");

			String[] beans = applicationContext.getBeanDefinitionNames();
			Arrays.sort(beans);

			for(String beanName:beans){
				System.out.println("current bean is:"+ beanName);
			}
		};
	}

}
