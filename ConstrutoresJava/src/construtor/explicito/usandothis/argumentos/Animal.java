package construtor.explicito.usandothis.argumentos;

// Classe com construtor explicito usando this() com argumentos
/* Sobrecarga: Recurso disponível no Java que permite a existência de vários
 * métodos com o nomes nome, desde que sejam criados com uma lista de argumentos diferentes */
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
        this(6.0, "Aves");
    }

    public Animal(double peso, String grupo) {
        System.out.println("Construtor Sobrecarregado");
        this.peso = peso;
        this.grupo = grupo;
    }

    public static void main(String[] args) {
        Animal animal2 = new Animal();
        System.out.println("Peso: " + animal2.getPeso() +
                " Grupo: " + animal2.getGrupo());
    }
}
