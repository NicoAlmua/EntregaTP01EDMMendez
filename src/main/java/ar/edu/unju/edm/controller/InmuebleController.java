package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Inmueble;

@Controller
public class InmuebleController {
	@Autowired
	Inmueble unInmueble;
	@GetMapping({"/inmueble"})
	public String cargarInmueble (Model model){
		unInmueble.setCodigo(101);
		model.addAttribute("inm", unInmueble);
		return "inmueble";
	}
}
