package apigateway.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/test1/")
public class Test1 {
	@GetMapping("health1")
	String health3() {
		return "api-gateway ".concat("Conectado, servicio 1 metodo 1");
	}
	
	@GetMapping("health2")
	String health4() {
		return "Conectado servicio 1 metodo 2";
	}
}
