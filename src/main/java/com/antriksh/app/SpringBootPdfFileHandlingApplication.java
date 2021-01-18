package com.antriksh.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPdfFileHandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPdfFileHandlingApplication.class, args);
		//new PdfFileWriting().writeUsingIText();
		new PdfFileReading().pdfReader();
		System.out.println("working fine");
	}

}
