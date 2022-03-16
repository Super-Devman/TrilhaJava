package br.com.java.classes.abstratas;

public class Circulo extends Figura {
	private double raio;

	public Circulo() {

	}

	public Circulo(double raio) {
		this.raio = raio;
	}

	public final double getRaio() {
		return raio;
	}

	public final void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * this.raio;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(this.raio, 2);
	}

}
