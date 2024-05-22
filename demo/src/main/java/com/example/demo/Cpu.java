package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Cpu {
	public void intel() {
		System.out.println("intel");
	}
	public void amd() {
		System.out.println("amd");
	}
}
