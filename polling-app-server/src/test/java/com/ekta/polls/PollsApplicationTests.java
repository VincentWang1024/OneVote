package com.ekta.polls;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PollsApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void whenEmptyString_thenAccept() {
		Palindrome palindromeTester = new Palindrome();
		assertTrue(palindromeTester.isPalindrome(""));
	}

	@Test
	public void whenPalindrom_thenAccept() {
		Palindrome palindromeTester = new Palindrome();
		assertTrue(palindromeTester.isPalindrome("noon"));
	}
		
	@Test
	public void whenNearPalindrom_thenReject(){
		Palindrome palindromeTester = new Palindrome();
		assertFalse(palindromeTester.isPalindrome("neon"));
	}
}
