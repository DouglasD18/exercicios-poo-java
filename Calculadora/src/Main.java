// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora(25, 18);

        System.out.println("A soma é: " + String.format("%.2f", calculadora.somar()));
        System.out.println("A subtração é: " + String.format("%.2f", calculadora.subtrair()));
        System.out.println("A multiplicação é: " + String.format("%.2f", calculadora.multiplicar()));
        System.out.println("A divisão é: " + String.format("%.2f", calculadora.dividir()));

    }

}