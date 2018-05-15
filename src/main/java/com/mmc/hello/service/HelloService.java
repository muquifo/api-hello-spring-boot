package com.mmc.hello.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mmc.hello.repository.HelloRepository;

public class HelloService {
	
	private static final String OLA_MUNDO = "Hello World";
	private static final String OLA = "Olá, ";
	
	public String getHelloWord() {
		return OLA_MUNDO;
	}
	
	public String getHelloNome(String nome) {
		return OLA.concat(nome);
	}

}
