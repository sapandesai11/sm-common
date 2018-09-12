/**
 * 
 */
package com.sd.stock.monitor.common.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sd.stock.monitor.common.entity.WatchList;

/**
 * @author Sapan.Desai
 *
 */
@Repository
public interface WatchListRepository extends CrudRepository<WatchList, Integer> {

}
