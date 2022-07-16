package apispringweb1.apigateway1.controller;

import javax.annotation.security.RolesAllowed;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/test2/")
public class Test2 {
	
	@RolesAllowed("user")
	@GetMapping("health3")
	String health3() {
		return "api-gateway ".concat("Conectado, servicio 2 metodo 1");
	}
	
	
	@PreAuthorize("hasAuthority('SCOPE_TEST')")
	@GetMapping("health4")
	String health4() {
		return "Conectado servicio 2 metodo 2";
	}
}
