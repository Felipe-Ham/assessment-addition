package com.tmobile.bootcamp.assessmentaddition.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addition")
public class AssessmentAdditinController {
	
	@GetMapping
	@RequestMapping("/{numberOne}/{numberTwo}")
	public Integer addNumbers(@PathVariable("numberOne") Integer numberOne, @PathVariable("numberTwo") Integer numberTwo) {
		return Integer.valueOf(numberOne.intValue() + numberTwo.intValue());
	}

}
