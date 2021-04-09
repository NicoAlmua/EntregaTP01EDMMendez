package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Calculadora;

@Controller
public class CalculadoraContoller {
	@Autowired
	Calculadora unaCalculadora;
	@GetMapping({"/menuoperaciones"})
	public String cargarCalculadora (Model model) {
		return "menuoperaciones";
	}
	@GetMapping("/Sumar")
	public ModelAndView getSumar(@RequestParam (name = "num1") String num1 , @RequestParam (name = "num2") int num2){
		
		unaCalculadora.setNum1(Integer.valueOf(num1));
		unaCalculadora.setNum2(num2);
		
		int resultadoSuma = unaCalculadora.Sumar();
		
		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoSuma", resultadoSuma);
		
		return modelView;
	}
	@GetMapping("/Restar")
	public ModelAndView getRestar (@RequestParam (name = "num1")int num1 , @RequestParam (name = "num2") int num2) {
		unaCalculadora.setNum1(num1);
		unaCalculadora.setNum2(num2);
		int resultadoResta = unaCalculadora.Restar();
		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoResta", resultadoResta);
		return modelView;
	}
	@GetMapping("/Multiplicar")
	public ModelAndView getMultiplicar (@RequestParam (name = "num1")int num1 , @RequestParam (name = "num2") int num2) {
		unaCalculadora.setNum1(num1);
		unaCalculadora.setNum2(num2);
		int resultadoMultiplicacion = unaCalculadora.Multiplicar();
		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoMultiplicacion", resultadoMultiplicacion);
		return modelView;
	}
	@GetMapping("/Dividir")
	public ModelAndView getDividr (@RequestParam (name = "num1")int num1 , @RequestParam (name = "num2") int num2) {
		unaCalculadora.setNum1(num1);
		unaCalculadora.setNum2(num2);
		int resultadoDivision = unaCalculadora.Dividir();
		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoDivision", resultadoDivision);
		return modelView;
	}
}
