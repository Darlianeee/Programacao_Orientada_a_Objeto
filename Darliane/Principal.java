public class Principal {
    public static void main(String[] args) {

        // Criando objetos
        Pessoa p1 = new Pessoa();
        Professor p2 = new Professor();
        Aluno p3 = new Aluno();

        // Definindo nomes usando os setters
        p1.setNome("Lucas Gusmão");
        p3.setNome ("Dercley");
        p3.setMatricula("2024109100055");
        p2.setNome("Felipe Balem");
        p2.setSiape(1234567);

        // Polimorfismo na prática:
        p1.apresentar(); // chama Pessoa.apresentar()
         p3.apresentar(); // chama Aluno.apresentar()
        p2.apresentar(); // chama Professor.apresentar()

    }
}