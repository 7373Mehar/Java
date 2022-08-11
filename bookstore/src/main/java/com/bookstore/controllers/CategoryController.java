package com.bookstore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.bookstore.services.CategoryService;

@Controller
public class CategoryController 
{
	@Autowired
	private CategoryService service;
}
