package FusoHorario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasaida = sc.nextInt();
        int tempoviagem = sc.nextInt();
        int fuso = sc.nextInt();

        int ajuste;
        if (fuso >= 0){
            ajuste = horasaida + tempoviagem + fuso;
            System.out.println(ajuste);
        } else {
            ajuste = horasaida + tempoviagem + fuso;
            if (ajuste >= 24) {
                ajuste = ajuste - 24;
                System.out.println(ajuste);
            } else {
                ajuste = horasaida + tempoviagem + fuso + 24;
                System.out.println(ajuste);
            }
        }
        sc.close();
    }
}