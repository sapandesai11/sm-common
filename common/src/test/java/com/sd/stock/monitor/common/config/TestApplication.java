package com.sd.stock.monitor.common.config;
/**
 * 
 */


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Sapan.Desai
 *
 */
@SpringBootApplication(scanBasePackages= {"com.sd.stock.monitor.common"})
@EnableJpaRepositories(basePackages = "com.sd.stock.monitor.common.repositories")
@EntityScan(basePackages = {"com.sd.stock.monitor.common.entity"})
@PropertySource("application.properties")
public class TestApplication {

}
