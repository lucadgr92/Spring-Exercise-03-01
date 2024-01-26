package com.develhope.Exercise0301;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercise0301Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercise0301Application.class, args);
	}

}
/*

	scrivi una applicazione web Spring Boot con le seguenti librerie:

		considera questo use case:
		1 student ---> n enrollments
		1 class ---> n enrollments
		avendo in mente gli usecase di cui sopra e usando le annotazioni, scrivi il codice per creare:
		la tabella students dove ogni studente avrà:
		primary key
		colonna lastName (not null)
		colonna firstName (not null)
		colonna email con valori univoci e not null
		la tabella classes dove ogni classe ha:
		primary key
		title (not null)
		description (not null)
		tabella enrollments per salvare collegamenti tra le tabelle students e classes:
		primary key
		2 foreign keys*/
