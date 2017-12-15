package com.niit.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.niit.dao.ProductDao;
import com.niit.model.Category;
import com.niit.model.Product;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
private ProductDao productDao;
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}
	public Product getProduct(int id) {
		return productDao.getProduct(id);
	}
	public void deleteProduct(int id) {
		productDao.deleteProduct(id);
		
	}
	public List<Category> getAllCategories() {
		return productDao.getCategories();
	}
	public void saveOrUpdateProduct(Product product) {
	
			productDao.saveOrUpdateProduct(product);
			
	}
}
