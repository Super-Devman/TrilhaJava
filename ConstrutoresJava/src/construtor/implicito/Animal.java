package construtor.implicito;

// Classe com construtor implícito
// Esses tipos de construtores são gerados automaticamente pelo compilador
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

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setPeso(5.5);
        animal.setGrupo("Mamiferos");
        System.out.println("Peso: " + animal.getPeso() +
                " Grupo: " + animal.getGrupo());
    }
}
