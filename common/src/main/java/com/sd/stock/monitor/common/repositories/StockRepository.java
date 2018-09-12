/**
 * 
 */
package com.sd.stock.monitor.common.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sd.stock.monitor.common.entity.Stock;

/**
 * @author Sapan.Desai
 *
 */
@Repository
public interface StockRepository extends CrudRepository<Stock, Integer> {
	
	Stock findBySymbol(String symbol);
	
	Stock findByName(String name);
	
	List<Stock> findByEnabled(boolean isEnabled);

}
