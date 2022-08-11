package com.bookstore.session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

@Component
public class SessionManager 
{
	private SessionFactory factory;
	private Session ses;
	public SessionManager(SessionFactory factory) 
	{
		this.factory = factory;
		ses=this.factory.openSession();
	}
	public Session getSession()
	{
		return ses;
	}
}
