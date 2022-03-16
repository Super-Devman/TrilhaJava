package br.com.java.classes.abstratas;

public class Paralelogramo extends Quadrilatero {
	private double base;
	private double altura;

	public Paralelogramo() {

	}

	public Paralelogramo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public final double getBase() {
		return base;
	}

	public final void setBase(double base) {
		this.base = base;
	}

	public final double getAltura() {
		return altura;
	}

	public final void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double perimetro() {
		return 2 * (this.base + this.altura);
	}

	@Override
	public double area() {
		return this.base * this.altura;
	}

}
