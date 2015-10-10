package com.joseph.service.impl;

import com.joseph.dao.ClientDao;
import com.joseph.model.Client;
import com.joseph.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ClientServiceImpl implements ClientService {
	@Autowired
	private ClientDao clientDao;
	
	@Transactional
	public void add(Client client) {
		clientDao.add(client);
	}

	@Transactional
	public void edit(Client client) {
		clientDao.edit(client);
	}

	@Transactional
	public void delete(int clientId) {
		clientDao.delete(clientId);
	}

	@Transactional
	public Client getClient(int clientId) {
		return clientDao.getClient(clientId);
	}

	@Transactional
	public List getAllClient() {
		return clientDao.getAllClient();
	}

}
