package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {

	private int num1, num2;
	
	public int Sumar () {
		int suma;
		suma=num1+num2;
		return suma;
	}
	public int Dividir () {
		int division;
		division=num1/num2;
		return division;
	}
	public int Restar () {
		int resta;
		resta=num1-num2;
		return resta;
	}
	public int Multiplicar () {
		int multiplicacion;
		multiplicacion=num1*num2;
		return multiplicacion;
	}
	
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}

	public Calculadora(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
}
