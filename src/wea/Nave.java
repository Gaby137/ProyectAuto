package wea;

public class Nave {
	private String patente;
	private String marca;
	private String color;
	
	public Nave() {
		
	}
	public Nave(String patente, String marca, String color) {
		super();
		this.patente = patente;
		this.marca = marca;
		this.color = color;
	} 

	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
