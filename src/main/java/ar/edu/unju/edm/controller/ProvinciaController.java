package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Provincia;

@Controller
public class ProvinciaController {

	//poder trabajar en Provincia sin preocuparse por memoria
	@Autowired
	Provincia unaProvincia;
	
	@GetMapping({"/provincia"})
	public String cargarProvincia(Model model) {
		//Provincia unaProvincia = new Provincia( metodo constructor ); ya no es necesario instanciar la clase provincia de esta manera
		unaProvincia.setNombre("Jujuy Argentina");
		model.addAttribute("prov", unaProvincia);
		return "provincia";
	}
	
}
