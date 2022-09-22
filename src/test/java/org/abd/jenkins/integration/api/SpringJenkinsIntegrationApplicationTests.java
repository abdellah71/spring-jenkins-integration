package org.abd.jenkins.integration.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsIntegrationApplicationTests {

	public static Logger logger= LoggerFactory.getLogger(SpringJenkinsIntegrationApplicationTests.class);


	@Test
	 contextLoads() {

		logger.info("test case executing....");

		logger.info("test case executing second log statement....");


	}

}
