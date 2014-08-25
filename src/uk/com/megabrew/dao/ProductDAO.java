package uk.com.megabrew.dao;

import java.util.ArrayList;
import java.util.List;

import uk.com.megabrew.model.Product;

public class ProductDAO {
	
	private static List<Product> products = loadProducts();
	
	public List<Product> getProducts() {
		return products;
	}

	private static List<Product> loadProducts() {
		
		List<Product> products = new ArrayList<Product>();
		
		Product b1 = new Product();
		b1.setName("Trooper");
		b1.setDescription("A beer created by Iron Maiden, brewed by Robinsons");
		b1.setPrice(90.00);
		b1.setAmount(8);
		b1.setUnitMeasure("Litro");
		b1.setVolume("dm3");
		
		products.add(b1);
		
		Product b2 = new Product();
		b2.setName("Sepultura Weizen");
		b2.setDescription("Uma cerveja de trigo, criada pela Cervejaria Bamberg para homenagear a banda de metal, Sepultura, surgida na década de 80.");
		b2.setPrice(17.00);
		b2.setAmount(1);
		b2.setUnitMeasure("Litro");
		b2.setVolume("dm3");
		
		products.add(b2);
		
		Product b3 = new Product();
		b3.setName("Kud: God Save The Queen");
		b3.setDescription("Essa English Pale Ale reverencia o Sex Pistols, uma das mais famosas bandas da Inglatera e também uma das precursoras do punk rock inglês.");
		b3.setPrice(18.00);
		b3.setAmount(1);
		b3.setUnitMeasure("Litro");
		b3.setVolume("dm3");
		
		products.add(b3);
		
		return products;
		
	}
	
	public Product searchProduct(Product product) {
		Product shot = null;
		for (Product p : getProducts()) {
			if(p.getId() == product.getId()) {
				shot = p;
				break;
			}
		}
		
		return shot;
	}
	
}
