package construtor.modificadores.acesso;

public class Dog extends Animal {
    private static int variavelEstatica = 100;
    private int variavelInstancia = 50;

    public Dog() {
        super(variavelEstatica);
    }

    public Dog(int valor) {
        super(Dog.peso());
    }

    public static void main(String[] args) {
        new Dog();
        new Dog(1);
    }

    static int peso() {
        return 60;
    }
}
