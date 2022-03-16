package construtor.heranca;
/* Herança: Recurso na programação orientada a objetos que permite que classes
* compartilhem variáveis e métodos de uma superclasse, assim, permitindo o
* reaproveitamento de código.
* Object: É a classe raiz de todas as classes em Java, assim tudo que foi definido
* em Object está disponível para qualquer outra classe. */
// Classe utilizando herança
public class Animal {

    private double peso;
    private String grupo;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Animal() {
        super();
        System.out.println("Construtor de Animal");
    }

    public Animal(double peso, String grupo) {
        this();
        System.out.println("Construtor sobrecarregado de Animal");
    }
}
