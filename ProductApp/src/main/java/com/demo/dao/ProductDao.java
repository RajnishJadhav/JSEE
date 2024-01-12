package com.demo.dao;

import java.util.List;

import com.demo.models.MyProduct;

public interface ProductDao {

	List <MyProduct> getAllProducts();

	void deleteProduct(int id);

	void addNewProduct(MyProduct p);

}
