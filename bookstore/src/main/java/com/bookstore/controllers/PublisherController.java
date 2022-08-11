package com.bookstore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.bookstore.services.PublisherService;

@Controller
public class PublisherController 
{
	@Autowired
	private PublisherService service;
}
