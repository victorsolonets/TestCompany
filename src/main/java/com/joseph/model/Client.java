package com.joseph.model;

import javax.persistence.*;

@Entity
public class Client {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int clientId;
	@Column
	private String info;
	
	public Client(){}
	public Client(int clientId, String info) {
		super();
		this.clientId = clientId;
		this.info = info;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	
}
