package construtor.heranca;

public class Dog extends Animal{
    private String raca;
    private String porte;


    public Dog() {
        super(5.6, "Mamiferos");
        System.out.println("Construtor de Dog");
    }

    public Dog(String raca, String porte) {
        this();
        System.out.println("Construtor sobrecarregado de Dog");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Vira Lata", "Médio");
    }
}
