package com.demo.service;

import java.util.List;

import com.demo.models.MyProduct;

public interface ProductService {

	List<MyProduct> getProducts();

	void deleteById(int id);

	void addProduct(MyProduct p);

}
