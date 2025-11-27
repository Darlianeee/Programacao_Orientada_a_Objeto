public class Aluno extends Pessoa{

    private String matricula;

  // Getter - pega a Matrícula
    public String getMatricula (){
        return matricula;
    }

     // Setter - altera a Matrícula
    public void setMatricula(String novaMatricula) {
        this.matricula = novaMatricula;
    }  

    @Override
    public void apresentar() {
        System.out.println("Oi! Eu sou um aluno, me chamo " + getNome() + " e a minha matrícula é " + getMatricula());
    }
}
