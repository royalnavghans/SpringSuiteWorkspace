package com.royal.productService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.royal.product.Products;

@Component
public class ProductsServiceImpl {
	static HashMap<Integer, Products> hm;

	public ProductsServiceImpl() {

		hm = new HashMap<Integer, Products>();
		Products prod1 = new Products(01, "Dell-mouse", "235", 1250.3, "256");
		Products prod2 = new Products(02, "logitech-mouse", "235", 1250.3, "256");
		Products prod3 = new Products(03, "Hp-mouse", "235", 1250.3, "256");
		Products prod4 = new Products(04, "Hp-mouse", "235", 1250.3, "256");
		Products prod5 = new Products(05, "I-mouse", "235", 1250.3, "256");

		hm.put(1, prod1);
		hm.put(2, prod2);
		hm.put(3, prod3);
		hm.put(4, prod4);
		hm.put(5, prod5);

	}

	public List<Products> findAll() {
		// TODO Auto-generated method stub
		List prods = new ArrayList(hm.values());
		return prods;

	}

	public static int MaxId() {
		int max = 0;
		for (int id : hm.keySet())
			if (max <= id)
				max = id;
		return max + 1;
	}

	public void addProduct(Products prod) {
		// TODO Auto-generated method stub

		prod.setProd_id(MaxId());
		hm.put(prod.getProd_id(), prod);

	}

	public void addProducts(List<Products> prod) {
		// TODO Auto-generated method stub

		for (Products product : prod) {
			this.hm.put(product.getProd_id(), product);
		}

	}

	public AddResponse deleteProduct(int id) {
		hm.remove(id);
		AddResponse res = new AddResponse();
		res.setMsg("Product Deleted...!!");
		res.setId(id);
		return null;
	}

	public Products find(int id) {
		Products prod = hm.get(id);
		return prod;
	}

	public Products updateProduct(Products prod) {
		if (prod.getProd_id() > 0)
			hm.put(prod.getProd_id(), prod);
		return prod;
	}
}
