package edu.profound;

public class Product{
	
	
	private String productName;
	private String productType;
	private String productCategory;
	private String productPrice;
	
	
	public Product() 
	{
		
	}


	public Product(String productName, String productType, String productCategory, String productPrice) {
		super();
		this.productName = productName;
		this.productType = productType;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductType() {
		return productType;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}


	public String getProductCategory() {
		return productCategory;
	}


	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}


	public String getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	
}



	
	
