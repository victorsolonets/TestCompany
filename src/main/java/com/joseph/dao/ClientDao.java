package com.joseph.dao;

import com.joseph.model.Client;

import java.util.List;

public interface ClientDao {
	public void add(Client client);
	public void edit(Client client);
	public void delete(int clientId);
	public Client getClient(int clientId);
	public List getAllClient();
}
