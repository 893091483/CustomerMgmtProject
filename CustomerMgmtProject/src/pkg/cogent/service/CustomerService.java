package pkg.cogent.service;

import pkg.cogent.dao.CustomerDAOImpl;

public class CustomerService {
	CustomerDAOImpl dao;
	public CustomerService() {
		dao = new CustomerDAOImpl();
	}

	public void save() {
		dao.create();

	}

	public void fetch() {
		dao.read();
	}

	public void modify(String cId) {
		dao.update(cId);
	}

	public void delete(String cId) {
		dao.delete(cId);
	}

}
