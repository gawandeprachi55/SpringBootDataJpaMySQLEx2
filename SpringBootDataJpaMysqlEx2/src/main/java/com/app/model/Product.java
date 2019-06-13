package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prodtab")
public class Product {
	@Id
	@Column(name="pid")
private Integer prodId;
	@Column(name="pcode")
private String prodCode;
	@Column(name="pCost")
private Double prodCost;
	public Product() {
		super();
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public Double getProdCost() {
		return prodCost;
	}
	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodCode=" + prodCode + ", prodCost=" + prodCost + "]";
	}
	public Product(Integer prodId, String prodCode, Double prodCost) {
		super();
		this.prodId = prodId;
		this.prodCode = prodCode;
		this.prodCost = prodCost;
	}
	
}
