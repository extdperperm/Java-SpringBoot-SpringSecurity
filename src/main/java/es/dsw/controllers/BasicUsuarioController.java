package es.dsw.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basic/")
public class BasicUsuarioController {

	@GetMapping(value= {"/rrhh"})
	public String rrhh() {

		return "views/rrhh";
	}
	
	@GetMapping(value= {"/almacen"})
	public String almacen() {
		
		return "views/almacen";
	}
	
	@GetMapping(value= {"/marketing"})
	public String marketing() {
		
		return "views/comerciales";
	}
}
