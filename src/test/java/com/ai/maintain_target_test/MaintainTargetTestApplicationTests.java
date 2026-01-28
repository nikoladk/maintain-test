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
		Assertions.assertEquals(5, 2 + 2, "Intentional failure: 2 + 2 should equal 5");
	}

	@Test
	void failingStringTest() {
		Assertions.assertTrue("spring".startsWith("boot"), "Intentional failure: string should start with 'boot'");
	}

	@Test
	void failingNullTest() {
		Assertions.assertNotNull(null, "Intentional failure: value should not be null");
	}

}
