package pkg.cogent.dao;

import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import pkg.cogent.exception.MandatoryFieldExcpetion;
import pkg.cogent.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	Customer customers[];
	Scanner sc=new Scanner(System.in);
	@Override
	public void create() {
		
		System.out.println("How many customer you want to store?");
		int size=sc.nextInt();
		customers=new Customer[size];
		for(int i=0;i<customers.length;i++)
		{
			Customer cust=new Customer();
			System.out.println("Please enter customer ID:");
			String cid=sc.next();		
			System.out.println("Please enter customer name:");
			String cname=sc.next();
			System.out.println("Please enter customer email ");
			String eMail=sc.next();
			System.out.println("Please enter customer Birthday ");
			String cBod=sc.next();
			cust.setcId(cid);
			cust.setcName(cname);
			cust.setcEmail(eMail);
			cust.setcDob(cBod);
			validateMandatoryField(cust);
			customers[i]=cust;
		}
	}
	
	public void validateMandatoryField(Customer customer)
	{
		if(customer==null)
		{
			throw new MandatoryFieldExcpetion("Customer object can not be left blank");
		}
		else if(customer.getcId()==null)
		{
			throw new MandatoryFieldExcpetion("Customer ID can not be left blank");
		}
		else if(customer.getcName()==null)
		{
			throw new MandatoryFieldExcpetion("Customer name can not be left blank");
		}
		else if(customer.getcEmail()==null)
		{
			throw new MandatoryFieldExcpetion("Customer Email can not be left blank");
		}
		else if(customer.getcDob()==null)
		{
			throw new MandatoryFieldExcpetion("Customer Birthday can not be left blank");
		}
	}

	@Override
	public void read() {
		for(int i=0;i<customers.length;i++)
		{
			System.out.println("Customer ID:"+customers[i].getcId());
			System.out.println("Customer  name:"+customers[i].getcName());
			System.out.println("Customer e-mail:"+customers[i].getcEmail());
			System.out.println("Customer Birthday:"+customers[i].getcDob());
		}
	}

	@Override
	public void update(String customerId) {
		// TODO Auto-generated method stub
		int index =0;
		for (int i = 0; i < customers.length; i++) {
			if(customers[i].getcId() == customerId) {
				index = i;
				break;
			}
		}
		System.out.println("Enter your new name");
		String newName = sc.next();
		customers[index].setcName(newName);
		System.out.println("Enter your new email");
		String newEmail = sc.next();
		customers[index].setcEmail(newEmail);
		String newDob = sc.next();
		customers[index].setcEmail(newDob);
		System.out.println(customerId + " updated, your new name is: " +newName +" your new email is: " + newEmail + " your new Dob is: " + newDob);

	}

	@Override
	public void delete(String customerId) {
		// TODO Auto-generated method stub
		int index =0;
		for (int i = 0; i < customers.length; i++) {
			if(customers[i].getcId() == customerId) {
				index = i;
				break;
			}
		}
		customers[index] = null; 
		

	}
	@Override
	public void findCustomerById(String cID) {
		int index =0;
		Boolean flag = false;
		for (int i = 0; i < customers.length; i++) {
			if(customers[i].getcId() == cID) {
				flag = true;
				index = i;
				System.out.println("Customer  name:"+customers[index].getcName());
				break;
			}
		}
		if(!flag) {
			System.out.println("Customer not found!");
		}
		
		
		
	}
	
	@Override
	public void findYongestCustomer() {
		int num = Integer.parseInt(customers[0].getcDob());
		int index = 0;
		for (int i = 1; i < customers.length; i++) {
			int temp = Integer.parseInt(customers[i].getcDob());
			if(temp < num) {
				num = temp;
				index = i;
			}
		}
		
		System.out.println("YongestCustomer  name:"+customers[index].getcName());
		
	}

}
