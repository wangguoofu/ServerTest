package com.byteuncle.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
	@GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name);
    }
	
	@GetMapping("/china")
    public String china(@RequestParam(value = "name", defaultValue = "China") String name) {
      return String.format("Hello %s!", name);
    }
}
