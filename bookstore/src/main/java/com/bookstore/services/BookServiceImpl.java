package com.bookstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService 
{
	@Autowired
	private BookRepository repo;
}
