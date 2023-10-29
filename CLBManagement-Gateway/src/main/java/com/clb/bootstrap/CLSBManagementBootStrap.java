package com.clb.bootstrap;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class CLSBManagementBootStrap {

	@EventListener(ApplicationReadyEvent.class)
	public void init() {
		log.info("*****************************************************");
		log.info("*****************************************************");
		log.info("*********** Welcome to CLB Application **************");
		log.info("*****************************************************");
		log.info("*****************************************************");
	}
}
