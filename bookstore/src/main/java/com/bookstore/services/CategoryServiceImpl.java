package com.bookstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.repositories.BookRepository;
import com.bookstore.repositories.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService 
{
	@Autowired
	private CategoryRepository repo;
}
