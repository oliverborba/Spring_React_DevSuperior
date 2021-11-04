package com.borba.dsvendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sales")
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private Integer visited;
	private Integer deals;
	private Double amounts;
	private LocalDate date;

	
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller seller;

	public Sale() {

	}

	public Sale(Long id, Integer visited, Integer deals, Double amounts, LocalDate date, Seller seller) {
		Id = id;
		this.visited = visited;
		this.deals = deals;
		this.amounts = amounts;
		this.date = date;
		this.seller = seller;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmounts() {
		return amounts;
	}

	public void setAmounts(Double amounts) {
		this.amounts = amounts;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}
}
