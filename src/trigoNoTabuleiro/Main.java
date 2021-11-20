package trigoNoTabuleiro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long trigo;
        int contador = 1;

        int n = sc.nextInt();

        while(contador <= n){
            int casasTabuleiro = sc.nextInt();

            trigo = (long) ((Math.pow(2, casasTabuleiro) - 1) / 12000);
            System.out.println(trigo + " kg");

            contador++;
        }
    }
}