package com.bookstore.repositories;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookstore.session.SessionManager;

@Repository
public class BookRepositoryImpl implements BookRepository 
{
	private SessionManager manager;
	private Session ses;
	public BookRepositoryImpl(SessionManager mn)
	{
		manager=mn;
		ses=manager.getSession();
	}
}
