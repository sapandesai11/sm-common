/**
 * 
 */
package com.sd.stock.monitor.common.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * This class starts the application.
 * @author Sapan.Desai
 * @since 1.0.0
 */

@SpringBootApplication(scanBasePackages= {"com.sd.stock.monitor.common"})
@EnableJpaRepositories(basePackages = "com.sd.stock.monitor.common.repositories")
@EntityScan(basePackages = {"com.sd.stock.monitor.common.entity"})
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
