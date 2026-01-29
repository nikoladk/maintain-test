package com.ai.maintain_target_test;

import com.ai.maintain_target_test.service.UserService;
import com.ai.maintain_target_test.service.NotificationService;
import com.ai.maintain_target_test.service.CircularServiceA;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class MaintainTargetTestApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private UserService userService;

	@Autowired
	private NotificationService notificationService;

	@Test
	void contextLoads() {
		// This test will now fail due to circular dependency between CircularServiceA
		// and CircularServiceB
	}

	@Test
	void testUserServiceWithWrongBeanName() {
		// Try to get a bean with the wrong name - this will fail
		Object wrongBean = applicationContext.getBean("wrongServiceName");
		Assertions.assertNotNull(wrongBean, "Should fail: Bean 'wrongServiceName' does not exist");
	}

	@Test
	void testIncorrectBeanType() {
		// Try to cast a bean to the wrong type - this will fail
		UserService wrongCast = (UserService) applicationContext.getBean("notificationService");
		Assertions.assertNotNull(wrongCast, "Should fail: NotificationService cannot be cast to UserService");
	}

	@Test
	void testMissingDependency() {
		// Try to get a non-existent bean - this will fail
		Object missingBean = applicationContext.getBean("nonExistentService");
		Assertions.assertNotNull(missingBean, "Should fail: nonExistentService bean does not exist");
	}

	@Test
	void testCircularDependency() {
		// This test tries to use CircularServiceA which has circular dependency with
		// CircularServiceB
		// The context should have failed to load, but if it somehow loads, this will
		// fail
		CircularServiceA circularServiceA = applicationContext.getBean(CircularServiceA.class);
		String result = circularServiceA.performAction();
		Assertions.assertNotNull(result, "Should fail due to circular dependency");
	}

}
