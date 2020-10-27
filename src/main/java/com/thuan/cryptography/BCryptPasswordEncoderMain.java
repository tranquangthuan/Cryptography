package com.thuan.cryptography;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderMain {
	public static void main(String[] args) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		String raw = "thuantran";
		String encode = bCryptPasswordEncoder.encode(raw);
		System.out.println(encode);
		System.out.println(bCryptPasswordEncoder.matches("thuantran", encode));
	}
}
