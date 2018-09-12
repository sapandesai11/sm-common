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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * This entity represents the topic object in the Database.
 * @author Sapan.Desai
 *
 */
@Entity
@Table(name="topics")
public class Topic implements Serializable {
	
	private static final long serialVersionUID = 1323849283401L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="topic_id")
	private int id;
	
	@OneToOne
	@JoinColumn(name="stock_id")
	private Stock stock;

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
	public Stock getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Topic : [Name = " + getStock().getName() + "]";
	}
}
