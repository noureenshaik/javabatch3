package com.product.DAOImpl;

import java.util.ArrayList;
import java.util.Scanner;

import com.product.pojo.Product;
import com.product.product.DAO.ProductDAO;

public class ProductDAOImpl {
	static Scanner sc=new Scanner(System.in);
	private ProductDAO productDao=new ProductDAO();
	
	public void add() {
		System.out.println("Enter Product Details:");
		
		Product product=new Product();
		
		System.out.print("Product id: ");
		product.setpId(sc.nextInt());
		
		System.out.print("Product name: ");
		product.setpName(sc.next());
		
		System.out.print("Product Price: ");
		product.setPrice(sc.nextDouble());
		
		System.out.print("Product quantity: ");
		product.setQuantity(sc.nextInt());
		System.out.println();
		
		productDao.addProduct(product);
	}

	public void view() {
		System.out.print("Enter product id to View: ");
		int id=sc.nextInt();
		
		System.out.println();
		
		Product product=productDao.viewProduct(id);
		
		if(product!=null)
		
		System.out.println(product.toString());
	}
	
	public void viewAll() {
		ArrayList<Product> pList=new ArrayList<>();
		pList=productDao.viewAllProduct();
		
		if(pList!=null)
		{
		for(Product p:pList) {
			System.out.println(p.toString());
		}
		}
	}
	
	public void update() {
		System.out.print("Enter Product id to update: ");
		int id=sc.nextInt();
		if(!productDao.hasProdut(id)) {
			System.out.println("No matching products.");
			return;
		}
		System.out.println();
		
		System.out.println("Enter New Product Details:");
		
		Product product=new Product();
		
		System.out.print("New Product name: ");
		product.setpName(sc.next());
		
		System.out.print("New Product Price: ");
		product.setPrice(sc.nextDouble());
		
		System.out.print("New Product quantity: ");
		product.setQuantity(sc.nextInt());
		
		product.setpId(id);
		System.out.println();
		
		if(productDao.updateProduct(id, product))
			System.out.println("Proudct updated successflly.");
		else 
			System.out.println("Proudct update unsuccessfll!!!");
	}
	
	public void delete() {
		System.out.print("Enter Proudct id to Delete: ");
		if(productDao.deleteProduct(sc.nextInt()))
			System.out.println("\nProduct Deleted successfully.");
		else
			System.out.println("Proudct Deletion unsuccessful!!!");
	}
}
