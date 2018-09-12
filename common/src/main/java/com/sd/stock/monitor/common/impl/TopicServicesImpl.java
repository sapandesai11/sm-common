/**
 * 
 */
package com.sd.stock.monitor.common.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.stock.monitor.common.entity.Stock;
import com.sd.stock.monitor.common.entity.Topic;
import com.sd.stock.monitor.common.repositories.TopicRepository;
import com.sd.stock.monitor.common.services.ITopicServices;

/**
 * @author Sapan.Desai
 *
 */
@Service("topicService")
public class TopicServicesImpl implements ITopicServices {

	@Autowired
	TopicRepository topicRepository;
	
	@Override
	public List<Topic> findAll() {
		return (List<Topic>) topicRepository.findAll();
	}

	@Override
	public Topic findByStock(Stock stock) {
		return topicRepository.findByStock(stock);
	}

	@Override
	public Topic findById(int id) {
		return topicRepository.findOne(id);
	}

	@Override
	public List<Topic> save(List<Topic> topicList) {
		return topicRepository.save(topicList);
	}

}
