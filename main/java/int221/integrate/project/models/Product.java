package int221.integrate.project.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private long ProductId;
	private String Productname;
	private double Price;
	private int Warranty;
	private Date MenufacturrerDaate;
	private int Capacity;
	private String Description;
	private String Images;
	private String brandId;
	public Product(Long productId, String productname, double price, int warranty, Date menufacturrerDaate,
			int capacity, String description, String images, String brandId) {
		ProductId = productId;
		Productname = productname;
		Price = price;
		Warranty = warranty;
		MenufacturrerDaate = menufacturrerDaate;
		Capacity = capacity;
		Description = description;
		Images = images;
		this.brandId = brandId;
	}
	public Long getProductId() {
		return ProductId;
	}
	public void setProductId(Long productId) {
		ProductId = productId;
	}
	public String getProductname() {
		return Productname;
	}
	public void setProductname(String productname) {
		Productname = productname;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getWarranty() {
		return Warranty;
	}
	public void setWarranty(int warranty) {
		Warranty = warranty;
	}
	public Date getMenufacturrerDaate() {
		return MenufacturrerDaate;
	}
	public void setMenufacturrerDaate(Date menufacturrerDaate) {
		MenufacturrerDaate = menufacturrerDaate;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getImages() {
		return Images;
	}
	public void setImages(String images) {
		Images = images;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
}
