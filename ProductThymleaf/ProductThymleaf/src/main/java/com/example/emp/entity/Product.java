package com.example.emp.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	
	@Id
	@Column(name="id")
    private Integer id;
	
	@Column(name="sku")
	private  String sku;
	
	@Column(name="name")
	private  String name;
	
	@Column(name="description")
	private  String description;
	
	@Column(name="unitprice")
	private  Float unitprice;
	
	@Column(name="imageurl")
	private  String imageurl;
	
	@Column(name="unitsinstock")
	private  Integer unitsinstock;
	
	@Column(name="datecreated")
	private  Date datecreated;
	
	@Column(name="lastupdated")
	private  Date lastupdated;
	
	@Column(name="categoryid")
	private  Integer categoryid;

	public Product() {
		
	}

	public Product(Integer id, String sku, String name, String description, Float unitprice, String imageurl,
			Integer unitsinstock, Date datecreated, Date lastupdated, Integer categoryid) {
		
		this.id = id;
		this.sku = sku;
		this.name = name;
		this.description = description;
		this.unitprice = unitprice;
		this.imageurl = imageurl;
		this.unitsinstock = unitsinstock;
		this.datecreated = datecreated;
		this.lastupdated = lastupdated;
		this.categoryid = categoryid;
	}

	public Integer getId() {
		return id;
	}

	public String getSku() {
		return sku;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Float getUnitprice() {
		return unitprice;
	}

	public String getImageurl() {
		return imageurl;
	}

	public Integer getUnitsinstock() {
		return unitsinstock;
	}

	public Date getDatecreated() {
		return datecreated;
	}

	public Date getLastupdated() {
		return lastupdated;
	}

	public Integer getCategoryid() {
		return categoryid;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setUnitprice(Float unitprice) {
		this.unitprice = unitprice;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public void setUnitsinstock(Integer unitsinstock) {
		this.unitsinstock = unitsinstock;
	}

	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

	public void setLastupdated(Date lastupdated) {
		this.lastupdated = lastupdated;
	}

	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}
	
	
	

}
