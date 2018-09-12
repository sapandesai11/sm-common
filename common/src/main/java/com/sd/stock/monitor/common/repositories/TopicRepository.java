package com.sd.stock.monitor.common.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sd.stock.monitor.common.entity.Stock;
import com.sd.stock.monitor.common.entity.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic, Integer> {
	
	Topic findByStock(Stock stock);
	
	List<Topic> save(List<Topic> topicList);

}
