package com.product.Client;

import java.util.Scanner;

import com.product.DAOImpl.ProductDAOImpl;
import com.product.pojo.Product;

public class ProductClient {
	public static Scanner sc = new Scanner(System.in);

	public static void productDetail() {
		ProductDAOImpl productDaoImpl = new ProductDAOImpl();

		int choice=0;
		while (choice!=6) {
			System.out
			.println("\n1) Add Products\n2) View All Product\n3) View Product\n4) Update Product\n5) Delete Product\n6)Back");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				productDaoImpl.add();
				break;
			case 2:
				productDaoImpl.viewAll();
				break;
			case 3:
				productDaoImpl.view();
				break;
			case 4:
				productDaoImpl.update();
				break;
			case 5:
				productDaoImpl.delete();
				break;
			case 6:System.out.println("Back to main menu......");
				break;
			default:
				System.out.println(
						"1) Add Products\n2) View All Product\n3) View Product\n4) Update Product\n5) Delete Product");
			}

		}

	}
	public static void main(String[] args) {

		while (true) {
			System.out.println("\n1) Product\n2) Exit");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:productDetail();
			break;
			case 2: System.out.println("Thank you For Using Prodcut Application. Bye Bye !!!");
				System.exit(0);
			}
		}
	}

}
