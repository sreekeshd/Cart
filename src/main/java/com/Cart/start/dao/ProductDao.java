package com.Cart.start.dao;

import java.util.List;

import com.Cart.start.model.Category;
import com.Cart.start.model.Filter;
import com.Cart.start.model.Products;

public interface ProductDao {
	
	public Products findByProductName(String productName);
	public Products findById(int productID);
	public List<Products> searchByProductName(String productName);
	public List<Products> searchByGenderAndProductName(String productName, String genderName);
	public void addProduct(Products product);
    public void updateProduct(Products product);
    public List<Products> listProducts();
    public void removeProduct(Products product);
    public List<String>brands();
    public List<Products> filterList(Filter filter);
    public List<String>categoryList();
}
