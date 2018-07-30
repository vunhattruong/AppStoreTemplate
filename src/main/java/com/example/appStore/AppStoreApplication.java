package com.example.appStore;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication
@EntityScan(basePackageClasses = {
	AppStoreApplication.class,
	Jsr310JpaConverters.class
})
public class AppStoreApplication {

	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC+7"));
	}

	public static void main(String[] args) {
		SpringApplication.run(AppStoreApplication.class, args);
	}
}
