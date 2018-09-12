/**
 * 
 */
package com.sd.stock.monitor.common.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sd.stock.monitor.common.config.TestApplication;
import com.sd.stock.monitor.common.entity.Stock;
import com.sd.stock.monitor.common.services.IStockServices;


/**
 * @author Sapan.Desai
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes={TestApplication.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestStockServicesImpl {
	
	@Autowired
	IStockServices stockService;
	
	Stock stock;
	
	List<Stock> stockList = new ArrayList<>();
	
	@Before
	public void setup() {
		stock = new Stock();
		stock.setEnabled(true);
		stock.setName("Alcoa Corporation");
		stock.setSymbol("AA");
		stock.setIexId("12042");
		stockList.add(stock);
		stock = new Stock();
		stock.setEnabled(false);
		stock.setName("Perth Mint Physical Gold");
		stock.setSymbol("AAAU");
		stock.setIexId("14924");
		stockList.add(stock);
		stock = new Stock();
		stock.setEnabled(false);
		stock.setName("Altaba Inc.");
		stock.setSymbol("AABA");
		stock.setIexId("7653");
		stockList.add(stock);
		
	}
	
	@Test
	public void aTestStockServiceSave() {
		stockService.save(stockList);
	}
	
	@Test
	public void bTestStockServiceFindByName() {
		assertThat(stockService.findByName("Alcoa Corporation").getName())
				.isEqualTo("Alcoa Corporation");
	}
	
	@Test
	public void cTestStockServiceFindBySymbol() {
		assertThat(stockService.findBySymbol("AABA").getSymbol()).isEqualTo("AABA");
	}
	
	@Test
	public void dTestStockServiceEnabled() {
		assertThat(stockService.findByEnabled(true).size()).isEqualTo(1);
	}
	
	@Test
	public void eTestStockServiceEnabled() {
		assertThat(stockService.findByEnabled(false).size()).isEqualTo(2);
	}

}
