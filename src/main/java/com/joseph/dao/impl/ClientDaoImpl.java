package com.joseph.dao.impl;

import com.joseph.dao.ClientDao;
import com.joseph.model.Client;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientDaoImpl implements ClientDao {
	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Client client) {
		session.getCurrentSession().save(client);
	}

	@Override
	public void edit(Client client) {
		session.getCurrentSession().update(client);
	}

	@Override
	public void delete(int clientId) {
		session.getCurrentSession().delete(getClient(clientId));
	}

	@Override
	public Client getClient(int clientId) {
		return (Client)session.getCurrentSession().get(Client.class, clientId);
	}


	@Override
	public List getAllClient() {
		return session.getCurrentSession().createQuery("FROM Client").list();
//		return null;
	}

}
