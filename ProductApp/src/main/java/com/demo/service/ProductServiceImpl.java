package com.demo.service;

import java.util.List;

import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
import com.demo.models.MyProduct;

public class ProductServiceImpl implements ProductService{

	private ProductDao pdao;
	
	public ProductServiceImpl ()
	{
		pdao = new ProductDaoImpl();
	}

	@Override
	public List<MyProduct> getProducts() {
		List<MyProduct> ls =pdao.getAllProducts();
		return ls;
	}

	@Override
	public void deleteById(int id) {
		pdao.deleteProduct(id);
		
	}

	@Override
	public void addProduct(MyProduct p) {
		pdao.addNewProduct(p);
		
	}
	
	
}
