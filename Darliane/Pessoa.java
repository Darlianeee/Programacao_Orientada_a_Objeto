public class Pessoa {

    // Atributo privado (encapsulamento)
    private String nome;

    // Getter - pega o nome
    public String getNome() {
        return nome;
    }

    // Setter - altera o nome
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    // Método que será sobrescrito (polimorfismo)
    public void apresentar() {
        System.out.println("Olá! Eu me chamo " + nome);
    }
}