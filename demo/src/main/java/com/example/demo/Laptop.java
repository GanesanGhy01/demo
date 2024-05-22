package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	@Autowired
	Cpu cpu;
	void dell() {
		cpu.amd();
	}
}
