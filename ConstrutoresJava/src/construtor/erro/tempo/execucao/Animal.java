package construtor.erro.tempo.execucao;

// Código com erro em tempo de execução
/* No exemplo abaixo ocorre um erro percebido pelo compilador como StackOverflowError
* em tempo de execução, que é gerado pelo estouro de memória.
* Geralmente ocorre quando o desenvolvedor cria um código que consome toda a memória
* disponível para a execução do programa */
public class Animal {
    private String grupo;

    public Animal() {
        go();
    }

    public Animal(String grupo) {
        this();
        System.out.println("Grupo: " + grupo);
    }

    private void go() {
        new Animal("Mamíferos");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.go();
    }
}
