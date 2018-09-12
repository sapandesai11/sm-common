/**
 * 
 */
package com.sd.stock.monitor.common.services;

import java.util.List;

import com.sd.stock.monitor.common.entity.Stock;
import com.sd.stock.monitor.common.entity.Topic;

/**
 * @author Sapan.Desai
 *
 */
public interface ITopicServices {
	List<Topic> findAll();
	
	Topic findByStock(Stock stock);
	
	Topic findById(int id);
	
	List<Topic> save(List<Topic> topicList);
}
