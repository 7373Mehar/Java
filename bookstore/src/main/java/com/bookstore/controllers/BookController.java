package com.bookstore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookstore.services.BookService;

@Controller
public class BookController 
{
	@Autowired
	private BookService service;
	
	
}
