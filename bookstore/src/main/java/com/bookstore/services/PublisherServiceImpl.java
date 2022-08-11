package com.bookstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.repositories.PublisherRepository;

@Service
public class PublisherServiceImpl implements PublisherService 
{
	@Autowired
	private PublisherRepository repo;
}
