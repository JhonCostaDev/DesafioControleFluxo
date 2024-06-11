import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        System.out.println("CONTADOR");

        try {
            int iteracao = recebeNumeros();
            imprimirIteracao(iteracao);
        } catch (ParametrosInvalidosException e) {
            e.printStackTrace();
            System.err.println("O segundo argumento deve ser maior que o primeiro.");
        }
    }

    public static int recebeNumeros() throws ParametrosInvalidosException {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = input.nextInt();

        if(numero1 > numero2) {
            throw new ParametrosInvalidosException();
        }
        return  numero2 - numero1;
    }

    public static void imprimirIteracao(int contador) {
        for(int i = 0; i < contador; i++) {
            System.out.println("Imprimindo número: " + (i + 1));
        }
    }
}
