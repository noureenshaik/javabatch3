package com.product.productInterface;

import java.util.ArrayList;

import com.product.pojo.Product;

public interface ProductList {
	
	public void addProduct(Product product);
	
	public Product viewProduct(int productId);
	
	public ArrayList<Product> viewAllProduct();
	
	public boolean updateProduct(int proudctId,Product newProduct);
	
	public boolean deleteProduct(int proudctId);

	
}
