SCHEDULED PROCESS
------------------------------------------------------------------------------

Spring Boot app that shows how to schedule tasks using @Scheduled annotation.

Built with Java 11, Spring Boot 2, Gradle and Lombok.

------------------------------------------------------------------------------

The class ScheduledExample uses the annotation @EnableScheduling and contains
a method that uses the annotation @Scheduled.

This method runs every 5 seconds, taking this value from the properties file.

```

package com.example.demo.configuration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.java.Log;

@Component
@Log
@EnableScheduling
public class ScheduledExample {

	private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	@Scheduled(fixedRateString = "${invoiceProcess.fixedRate}", initialDelay = 1000)
	public void processing() {
		log.info("[ScheduledExample][processing][START]");
		log.info("[ScheduledExample][processing][LocalDateTime.now(): " + dateTimeFormatter.format(LocalDateTime.now()) + "]");
		log.info("[ScheduledExample][processing][END]");
	}
	
}


```

------------------------------------------------------------------------------