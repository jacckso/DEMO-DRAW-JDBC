package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Model.Dao.SellerDao;
import Model.Dao.impl.DaoFactory;
import entities.Department;
import entities.Seller;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Department department = new Department(2, null);
		List<Seller>list = sellerDao.findByDepartment(department);
		for(Seller e : list) { 
		System.out.println(e);
		}
		List<Seller>list1 = sellerDao.findAll();
		for(Seller e : list1) { 
		System.out.println(e);
		}
		Seller seller = new Seller(null, "greg", "greg@", new Date(), 4000.0);
	System.out.println(seller);
	}

}
