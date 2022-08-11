package com.bookstore.repositories;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bookstore.session.SessionManager;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository 
{
	private SessionManager manager;
	private Session ses;
	public CategoryRepositoryImpl(SessionManager mn)
	{
		manager=mn;
		ses=manager.getSession();
	}
}
