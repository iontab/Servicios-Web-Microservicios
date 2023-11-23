package controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import model.Ficha;

@RestController
public class FichaController {
	

	@GetMapping(value="FichaPersona/{name}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Ficha fichaPersona(@PathVariable("name") String nombre){
		
		Ficha ficha=new Ficha(nombre,"email@gmail.com", 44);
		
		return ficha;
	}
	
	

}
