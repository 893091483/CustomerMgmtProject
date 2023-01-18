package pkg.cogent.controller;

import java.util.Scanner;

import pkg.cogent.service.CustomerService;

public class CustomerController {

	CustomerService cs;
	Scanner sc = new Scanner(System.in);

	public CustomerController() {
		cs = new CustomerService();
	}

	public void accpept(int choice) {
		switch (choice) {
		case 1:
			cs.save();
			break;
		case 2:
			cs.fetch();
			break;
		case 3:
			System.out.println("Please enter the customer ID");
			String cid = sc.next();
			cs.modify(cid);
			break;
		case 4:
			System.out.println("Please enter the customer ID");
			String id = sc.next();
			cs.delete(id);
			break;

		case 5:
			System.exit(choice);
			break;
		}
	}

}
