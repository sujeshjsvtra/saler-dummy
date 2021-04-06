package com.saler.dummy.service;

import java.util.ArrayList;
import java.util.List;

import com.saler.dummy.modal.Product;

public class ProductService {
	public static List<Product> getDummyProductList() {
		List<Product> products = new ArrayList<>();
		String thumbnail = "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Ftse2.mm.bing.net%2Fth%3Fid%3DOIP.ypChW7Mi61A4vKBw3Gqr2AHaFj%26pid%3DApi&f=1";
		products.add(
				new Product(1l, "Product Title", "Sub title", "Description description", thumbnail, 150, false, 0));
		products.add(
				new Product(2l, "Product Title", "Sub title", "Description description", thumbnail, 150, true, 100));
		products.add(
				new Product(3l, "Product Title", "Sub title", "Description description", thumbnail, 150, false, 0));
		products.add(
				new Product(4l, "Product Title", "Sub title", "Description description", thumbnail, 240, false, 0));
		products.add(
				new Product(5l, "Product Title", "Sub title", "Description description", thumbnail, 270, false, 0));
		return products;
	}
}
