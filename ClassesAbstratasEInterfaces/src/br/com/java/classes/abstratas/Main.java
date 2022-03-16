package br.com.java.classes.abstratas;

public class Main {

	public static void main(String[] args) {
		Figura f;
		f = new Circulo(5.0);
		System.out.println("�rea do c�rculo: " + f.area());
		System.out.println("Per�metro do c�rculo: " + f.perimetro());
		Figura f2;
		f2 = new Paralelogramo(7.0, 9.0);
		System.out.println("�rea do paralelogramo: " + f2.area());
		System.out.println("Per�metro do paralelogramo: " + f2.perimetro());
	}

}
