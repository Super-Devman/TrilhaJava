package construtor.explicito.usandothis;

// Classe com construtor explicito usando this()
// Uso do this() sempre fará uma chamada ao construtor da própria classe
// uso do super() fará chamada ao construtor da superclasse
// Só poderá escolher um dos dois para usar em um construtor para não gerar erro em tempo de compilação
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
        System.out.println("Construtor Padrão");
    }

    public Animal(double peso, String grupo) {
        this();
        this.peso = peso;
        this.grupo = grupo;
    }

    public static void main(String[] args) {
        Animal animal2 = new Animal(6.0, "Aves");
        System.out.println("Peso: " + animal2.getPeso() +
                " Grupo: " + animal2.getGrupo());
    }
}