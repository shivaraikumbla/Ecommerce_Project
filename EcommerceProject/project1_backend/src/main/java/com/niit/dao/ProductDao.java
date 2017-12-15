package com.niit.dao;

import java.util.List;


import com.niit.model.Category;
import com.niit.model.Product;

public interface ProductDao {
List<Product> getAllProducts(); 
Product getProduct(int id); 
void deleteProduct(int id);
List<Category> getCategories();
void saveOrUpdateProduct(Product product);
}