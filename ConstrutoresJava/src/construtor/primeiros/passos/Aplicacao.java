package construtor.primeiros.passos;

public class Aplicacao {

	public static void main(String[] args) {

		// Construtor sem parâmetros
		Carro prototipoDeCarro = new Carro();

		Carro fiat = new Carro("Fiat Doblò", 122.438);

		Carro civicPreto = new Carro("New Civic", 40000);

		Carro golfAmarelo = new Carro("Golf", 38000);

		Honda hondaFitPreto = new Honda("2.0 Flex", "Honda Accord", 60000);

		System.out.println("Modelos de carros disponíveis: \n" + fiat.getModelo() + " por " + fiat.getPreco() + "\n"
				+ civicPreto.getModelo() + " por " + civicPreto.getPreco() + "\n" + golfAmarelo.getModelo() + " por "
				+ golfAmarelo.getPreco() + "\n" + prototipoDeCarro.getModelo() + "\n" + hondaFitPreto.getModelo()
				+ " por " + hondaFitPreto.getPreco() + " com motor de " + hondaFitPreto.getMotor());
	}
}
