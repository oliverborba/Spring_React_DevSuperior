package com.borba.dsvendas.dto;

import java.io.Serializable;

import com.borba.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String sellerName;
	private Double sum;

	public SaleSumDTO(Seller seller, Double sum) {

		this.sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellername() {
		return sellerName;
	}

	public void setSellername(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
}
