package ar.edu.unju.edm.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Inmueble {

	private int codigo, descripcion;
	private String tipo, direccion, estado;
	private double precio;
	@Autowired
	private Provincia provincia;
	
	public Inmueble() {
		// TODO Auto-generated constructor stub
	}

	public Inmueble(int codigo, int descripcion, String tipo, String direccion, String estado, double precio,
			Provincia provincia) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.direccion = direccion;
		this.estado = estado;
		this.precio = precio;
		this.provincia = provincia;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(int descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	
	
}
