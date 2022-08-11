package com.product.product.DAO;
import com.product.pojo.Product;

import java.util.ArrayList;
import java.util.List;

import com.product.productInterface.ProductList;

public class ProductDAO implements ProductList{
	
	private List<Product> pList=new ArrayList<>();

	@Override
	public Product viewProduct(int productId) {
		if(pList.isEmpty()) {
			System.out.println("Product list is empty.");
			return null;
		}
		
		for(Product product:pList) {
			if(product.getpId()==productId)
				return product;
		}
		return null;
	}

	@Override
	public ArrayList<Product> viewAllProduct() {
		if (pList.isEmpty()) {
			System.out.println("Product list is empty.");
			return null;
		}
		return (ArrayList<Product>) pList;
	}

	@Override
	public boolean updateProduct(int productId,Product newProduct) {
		// TODO Auto-generated method stub
		
		for(Product product:pList) {
			if(product.getpId()==productId) {
				product.setpName(newProduct.getpName());
				product.setPrice(newProduct.getPrice());
				product.setQuantity(newProduct.getQuantity());
				return true;
			}
				
		}
		
		return false;
	}

	@Override
	public boolean deleteProduct(int productId) {
		for(Product p:pList) {
			if(p.getpId()==productId) {
				pList.remove(p);
				return true;
			}
		}
		return false;
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		pList.add(product);
	}

	public boolean hasProdut(int id) {
		for(Product p:pList) {
			if(p.getpId()==id)
				return true;
		}
		return false;
	}
}
