package com.kongcepts.assessment.mybankserver.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sakila Dissanayake
 *
 */
@RestController
@CrossOrigin
public class LoginController {

	@RequestMapping({ "/login" })
	public String login() {
		return "authenticated";
	}

}
