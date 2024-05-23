package main;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Model.Dao.DaoFactory;
import Model.Dao.SellerDao;
import entities.Department;
import entities.Seller;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SellerDao SellerDao = DaoFactory.createSellerDao();
		System.out.println("=== TEST 1: seellerbyid =====");
		Seller seller = SellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n=== TEST 2: seller findByDepartment =====");
		Department department = new Department(2, null);
		List<Seller> list = SellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		list = SellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 4: seller insert =====");
		Seller newSeller = new Seller(null, "greg", "greg#", new Date(), 4000.00, department);
		SellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());

		System.out.println("\n=== TEST 5: seller update =====");
		seller = SellerDao.findById(1);
		seller.setName("Martha Waine");
		SellerDao.update(seller);
		System.out.println("Update completed");

		System.out.println("\n=== TEST 6: seller delete =====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		SellerDao.deleteById(id);
		System.out.println("Delete completed");

		sc.close();

	}

}
