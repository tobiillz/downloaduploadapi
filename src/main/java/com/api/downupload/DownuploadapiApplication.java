package com.api.downupload;

import com.api.downupload.properties.FileUploadProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties({FileUploadProperties.class})

public class DownuploadapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DownuploadapiApplication.class, args);

		System.out.println("Hello");
	}

}
