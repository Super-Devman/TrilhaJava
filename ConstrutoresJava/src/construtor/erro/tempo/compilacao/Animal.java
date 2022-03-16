package construtor.erro.tempo.compilacao;

// Código com erro em tempo de compilação
// No exemplo abaixo é causado um estouro de memória na utilização de construtores
public class Animal {
    private String grupo;

    /* public Animal() {
        this("Aves");
    }

    public Animal(String grupo) {
        this();
    } */

    public static void main(String[] args) {
        Animal a = new Animal();
    }
}
