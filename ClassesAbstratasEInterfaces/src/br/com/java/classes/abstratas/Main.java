package br.com.java.classes.abstratas;

public class Main {

	public static void main(String[] args) {
		Figura f;
		f = new Circulo(5.0);
		System.out.println("Área do círculo: " + f.area());
		System.out.println("Perímetro do círculo: " + f.perimetro());
		Figura f2;
		f2 = new Paralelogramo(7.0, 9.0);
		System.out.println("Área do paralelogramo: " + f2.area());
		System.out.println("Perímetro do paralelogramo: " + f2.perimetro());
	}

}
