package com.shopme.admin.user;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderTest {

	@Test
	public void testEncodePassword() {
		BCryptPasswordEncoder passowrdEncoder = new BCryptPasswordEncoder();
		String rawPassword = "admin2022";
		String encodedPassword = passowrdEncoder.encode(rawPassword);
		
		System.out.println("Password is encoded: " + encodedPassword);
		
		boolean matches = passowrdEncoder.matches(rawPassword, encodedPassword);
		
		assertThat(matches).isTrue();
	}
}
