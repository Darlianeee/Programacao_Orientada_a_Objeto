import java.util.Scanner;

public class PrincipalTv {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        TV tv = new TV();
        Controle controle = new Controle();
        int opcao;

        do {
            System.out.println("\n--- MENU DA TV ---");
            System.out.println("1 - Ligar TV");
            System.out.println("2 - Desligar TV");
            System.out.println("3 - Mostrar Canal");
            System.out.println("4 - Canal +");
            System.out.println("5 - Canal -");
            System.out.println("6 - Escolher Canal");
            System.out.println("7 - Aumentar Volume");
            System.out.println("8 - Diminuir Volume");
            System.out.println("9 - Sair");
            System.out.print("Escolha: ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1 -> controle.ligar(tv);
                case 2 -> controle.desligar(tv);
                case 3 -> controle.mostrarCanal(tv);
                case 4 -> controle.canalMais(tv);
                case 5 -> controle.canalMenos(tv);
                case 6 -> {
                    System.out.print("Digite o número do canal: ");
                    int num = ler.nextInt();
                    controle.escolherCanal(tv, num);
                }
                case 7 -> controle.aumentarVolume(tv);
                case 8 -> controle.diminuirVolume(tv);
            }
        } while (opcao != 9);

        System.out.println("Encerrando...");
        ler.close();
    }
}