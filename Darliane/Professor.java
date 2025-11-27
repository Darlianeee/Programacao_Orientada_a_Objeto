public class Professor extends Pessoa {

     // Atributo privado (encapsulamento)
    private int Siape;

     // Getter - pega o nome
    public int getSiape() {
        return Siape;
    }

    // Setter - altera o nome
    public void setSiape(int novoSiape) {
        this.Siape = novoSiape;
    }
    // Método sobrescrito
    @Override
    public void apresentar() {
        System.out.println("Olá! Sou um Professor e me chamo " + getNome() + " e a minha matrícula do SIAPE é " + getSiape());
    }
}