package com.borba.dsvendas.dto;

import java.io.Serializable;

import com.borba.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String sellername;
	private Double sum;

	public SaleSumDTO(Seller seller, Double sum) {

		this.sellername = seller.getName();
		this.sum = sum;
	}

	public String getSellername() {
		return sellername;
	}

	public void setSellername(String sellername) {
		this.sellername = sellername;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
}