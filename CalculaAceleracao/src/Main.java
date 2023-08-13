import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da força: ");
        int forca = scanner.nextInt();

        System.out.println("Digite o valor da massa, precisa ser maior do que zero: ");
        int massa = scanner.nextInt();

        Aceleracao aceleracao = new Aceleracao(forca, massa);
        System.out.println("A aceleração é de " + aceleracao.aceleracao() + "m/s²");

    }

}