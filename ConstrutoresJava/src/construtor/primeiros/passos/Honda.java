package construtor.primeiros.passos;

public class Honda extends Carro {

	private String motor;

	/* CONSTRUTOR PADR�O */
	public Honda() {

	}

	/* CONSTRUTOR COM PAR�METROS */
	// Usando construtor da Classe Pai
	public Honda(String motor, String modelo, double preco) {
		super(modelo, preco);
		this.motor = motor;
	}

	public final String getMotor() {
		return motor;
	}

	public final void setMotor(String motor) {
		this.motor = motor;
	}

}
