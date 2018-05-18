package com.mmc.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mmc.hello.service.HelloService;

@RestController
@RequestMapping("/api/hello")
public class HelloController {
	
	
		@Autowired
		HelloService helloService;
		
		@GetMapping("/")
		public ResponseEntity<String> helloWord() {
			String mensagem = helloService.getHelloWord();
			return new ResponseEntity<String>(mensagem, HttpStatus.OK);
		}
		
		@RequestMapping(value = "/{nome}", method = RequestMethod.GET)
		public ResponseEntity<String> helloNome(@PathVariable("nome") String nome) {
			String mensagem = helloService.getHelloNome(nome);
			return new ResponseEntity<String>(mensagem, HttpStatus.OK);
		}

}
