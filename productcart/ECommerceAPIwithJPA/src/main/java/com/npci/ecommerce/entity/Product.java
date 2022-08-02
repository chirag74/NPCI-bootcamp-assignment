package com.npci.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Product")
public class Product {
	
		@Id
		@Column(name = "id")
		private Integer id;
		
		@Column(name = "sku")
		private String sku;
		
		@Column(name = "name")
		private String name;
		
		@Column(name = "description")
		private String description;
		
		@Column(name = "unitprice")
		private double unitprice;
		
		@Column(name = "imageurl")
		private String imageurl;
		
		@Column(name = "unitsinstock")
		private Integer unitinstock;
		
		@Column(name = "datecreated")
		private String datecreated; 
		
		@Column(name = "lastupdated")
		private String lastupdated;
		
		@Column(name = "categoryid")
		private Integer categoryid;
	
		public Product(Integer id, String sku, String name, String description, double unitprice, String imageurl,
				Integer unitinstock, String datecreated, String lastupdated, Integer categoryid) {
			super();
			this.id = id;
			this.sku = sku;
			this.name = name;
			this.description = description;
			this.unitprice = unitprice;
			this.imageurl = imageurl;
			this.unitinstock = unitinstock;
			this.datecreated = datecreated;
			this.lastupdated = lastupdated;
			this.categoryid = categoryid;
		}
		public Product() {
			
		}
	
		public Integer getId() {
			return id;
		}
		
		public void setId(Integer id) {
			this.id = id;
		}
		
		public String getSku() {
			return sku;
		}
		
		public void setSku(String sku) {
			this.sku = sku;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getDescription() {
			return description;
		}
		
		public void setDescription(String description) {
			this.description = description;
		}
		
		public double getUnitprice() {
			return unitprice;
		}
		
		public void setUnitprice(double unitprice) {
			this.unitprice = unitprice;
		}
		public String getImageurl() {
			return imageurl;
		}
		
		public void setImageurl(String imageurl) {
			this.imageurl = imageurl;
		}
		
		public Integer getUnitinstock() {
			return unitinstock;
		}
		
		public void setUnitinstock(Integer unitinstock) {
			this.unitinstock = unitinstock;
		}
		
		public String getDatecreated() {
			return datecreated;
		}
		
		public void setDatecreated(String datecreated) {
			this.datecreated = datecreated;
		}
		
		public String getLastupdated() {
			return lastupdated;
		}
		
		public void setLastupdated(String lastupdated) {
			this.lastupdated = lastupdated;
		}
		
		public Integer getCategoryid() {
			return categoryid;
		}
		
		public void setCategoryid(Integer categoryid) {
			this.categoryid = categoryid;
		}
		
		@Override
		public String toString() {
			return "Product [id=" + id + ", sku=" + sku + ", name=" + name + ", description=" + description
					+ ", unitprice=" + unitprice + ", imageurl=" + imageurl + ", unitinstock=" + unitinstock
					+ ", datecreated=" + datecreated + ", lastupdated=" + lastupdated + ", categoryid=" + categoryid
					+ "]";
		}
		
			

}