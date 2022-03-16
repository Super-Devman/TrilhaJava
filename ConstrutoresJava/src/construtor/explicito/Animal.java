package construtor.explicito;

// Classe com construtor explicíto
// Tipo de construtor que tem seus argumentos declarados, que são criados por um desenvolvedor
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
        // Construtor padrão
    }

    public Animal(double peso, String grupo) {
        super();
        this.peso = peso;
        this.grupo = grupo;
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.setPeso(5.5);
        animal1.setGrupo("Mamiferos");
        System.out.println("Peso: " + animal1.getPeso() +
                " Grupo: " + animal1.getGrupo());
        Animal animal2 = new Animal(6.0, "Aves");
        System.out.println("Peso: " + animal2.getPeso() +
                " Grupo: " + animal2.getGrupo());
    }
}
