package com.joseph.service;

import com.joseph.model.Client;

import java.util.List;

public interface ClientService {
	public void add(Client client);
	public void edit(Client client);
	public void delete(int clientId);
	public Client getClient(int clientId);
	public List getAllClient();
}
