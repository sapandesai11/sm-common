/**
 * 
 */
package com.sd.stock.monitor.common.services;

import java.util.List;

import com.sd.stock.monitor.common.entity.Stock;

/**
 * @author Sapan.Desai
 *
 */
public interface IStockServices {
	
	List<Stock> findAll();
	
	Stock findBySymbol(String symbol);
	
	Stock findByName(String name);
	
	Stock findById(int id);
	
	List<Stock> findByEnabled(boolean isEnabled);
	
	List<Stock> save(List<Stock> stockList);
}
