/**
 * 
 */
package com.sd.stock.monitor.common.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * This entity represents the Watch List object in Database.
 * @author Sapan.Desai
 *
 */
@Entity
@Table(name="watch_lists")
public class WatchList implements Serializable {
	
private static final long serialVersionUID = 1323849283402L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="watch_list_id")
	private int id;
	
	@Column(name="watch_list_name", nullable=false)
	private String name;
	
	@ManyToMany
	@JoinColumn(name="stock_id", nullable=true)
	@Column(name="stock")
	private Set<Stock> stock;
	

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the stock
	 */
	public Set<Stock> getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(Set<Stock> stock) {
		this.stock = stock;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Watch List : [Name = " + getName() + ", Stocks = " + getStock() + "]";
	}

}
