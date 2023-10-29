package com.clb.resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/manager")
@Slf4j
public class ManagementResource {

	@PostMapping("/save")
	public String addNewAccount() {
		log.info("addNewAccount() method get called here.....");
		return null;
	}
}
