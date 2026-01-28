package com.ai.maintain_target_test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MaintainTargetTestApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void failingMathTest() {
		Assertions.assertEquals(4, 2 + 2, "2 + 2 should equal 4");
	}

	@Test
	void failingStringTest() {
		Assertions.assertTrue("boot".startsWith("boot"), "string should start with 'boot'");
	}

	@Test
	void failingNullTest() {
		Object obj = new Object();
		Assertions.assertNotNull(obj, "value should not be null");
	}

}