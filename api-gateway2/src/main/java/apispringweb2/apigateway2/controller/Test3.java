package apispringweb2.apigateway2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/test3/")
public class Test3 {
	@GetMapping("health5")
	String health5() {
		return "api-gateway ".concat("Conectado, servicio 3 metodo 1");
	}
	
	@GetMapping("health6")
	String health6() {
		return "Conectado servicio 3 metodo 2";
	}
}
