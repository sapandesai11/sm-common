/**
 * 
 */
package com.sd.stock.monitor.common.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.stock.monitor.common.entity.Stock;
import com.sd.stock.monitor.common.repositories.StockRepository;
import com.sd.stock.monitor.common.services.IStockServices;

/**
 * @author Sapan.Desai
 *
 */
@Service("stockService")
public class StockServicesImpl implements IStockServices {
	
	@Autowired
	StockRepository stockRepository;

	@Override
	public List<Stock> findAll() {
		return (List<Stock>) stockRepository.findAll();
	}

	@Override
	public Stock findBySymbol(String symbol) {
		return stockRepository.findBySymbol(symbol);
	}

	@Override
	public Stock findByName(String name) {
		return stockRepository.findByName(name);
	}

	@Override
	public Stock findById(int id) {
		return stockRepository.findOne(id);
	}

	@Override
	public List<Stock> save(List<Stock> stockList) {
		return (List<Stock>) stockRepository.save(stockList);
	}

	@Override
	public List<Stock> findByEnabled(boolean isEnabled) {
		return stockRepository.findByEnabled(isEnabled);
	}

}
