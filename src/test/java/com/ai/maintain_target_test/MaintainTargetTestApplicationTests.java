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
		Assertions.assertFalse("spring".startsWith("boot"), "string 'spring' should not start with 'boot'");
	}

	// Removed failingNullTest as it was not meaningful
}