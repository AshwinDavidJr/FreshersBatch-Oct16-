package com.BootTest.Training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonBeans {

	@Bean
	public LoadDatabase db()
	{
		return new LoadDatabase();
	}
}
