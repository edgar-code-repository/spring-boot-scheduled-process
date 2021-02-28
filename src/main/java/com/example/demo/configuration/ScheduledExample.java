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
