package com.sa.gradle.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/webhook")
public class GradleWebhookController {
	Logger logger = LoggerFactory.getLogger(GradleWebhookController.class);
	 @PostMapping // http://localhost:8080/api/webhook
	    public ResponseEntity<String> print(@RequestBody String requestBody) {
		 logger.trace("PUSH");
		 logger.trace("PULL");
		 logger.trace("COMMIT");
	        System.out.println("###### Webhook #####" + requestBody);
	        return new ResponseEntity<String >(requestBody, HttpStatus.OK);
	    }

}
