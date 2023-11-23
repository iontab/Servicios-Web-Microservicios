package controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SaludoController {
	
	@GetMapping(value="Saludar",produces=MediaType.TEXT_PLAIN_VALUE)
	public String saludo() {
		
		return "Bienvenido a REST";
	}
	
	@GetMapping(value="Saludar/{name}",produces=MediaType.TEXT_PLAIN_VALUE)
	public String saludoPersonalizado(@PathVariable("name") String nombre) {
		
		return "Bienvenido a REST sr/a "+ nombre;
	}
	

	@GetMapping(value="Saludar/{name}/{edad}",produces=MediaType.TEXT_PLAIN_VALUE)
	public String saludoEdad(@PathVariable("name") String nombre,
							 @PathVariable("edad") int edad) {
		
		return "Hola, "+nombre+" tienes "+edad+ " años";
	}
	
	@GetMapping(value="SaludarParametros",produces=MediaType.TEXT_PLAIN_VALUE)
	public String saludoParametros(@RequestParam("name") String nombre,
							       @RequestParam("edad") int edad) {
		
		return "Hola, "+nombre+" tienes "+edad+ " años";
	}
	

}
