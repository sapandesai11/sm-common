/**
 * 
 */
package com.sd.stock.monitor.common.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class represents the Stock object in Database.
 * 
 * @author Sapan.Desai
 *
 */
@Entity
@Table(name="stock")
public class Stock implements Serializable{
	
	private static final long serialVersionUID = 1323849283400L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="stock_id")
	private int id;
	
	@Column(name="stock_name", nullable=false)
	private String name;
	
	@Column(name="stock_exch_symbol", nullable=false)
	private String symbol;
	
	@Column(name="iex_id", nullable=false)
	private String iexId;
	
	@Column(name="is_enabled")
	private boolean enabled = true;
	
	@Column(name="price", nullable=true)
	private double price;

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

	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * @return the iexId
	 */
	public String getIexId() {
		return iexId;
	}

	/**
	 * @param iexId the iexId to set
	 */
	public void setIexId(String iexId) {
		this.iexId = iexId;
	}

	/**
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Sotck : [Name = " + getName() + ", Exchange Symbol = " + getSymbol() + "]";
	}

}
