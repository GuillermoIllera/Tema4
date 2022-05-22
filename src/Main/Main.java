package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduzca el numero que desea comprobar: ");
        int numeroIf = in.nextInt();
        if (numeroIf == 0){
            System.out.println(numeroIf + " es 0");
        } else if (numeroIf > 0){
            System.out.println("El numero " + numeroIf + " es positivo.");
        } else {
            System.out.println("El numero " + numeroIf + " es negativo.");
        }
        int numeroWhile = 0;
        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("El valor del iterador es: " + numeroWhile);
        }
        int numeroDoWhile = 0;

        do {
            System.out.println("El valor actual del iterador es: " + numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile == 0);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("El valor del iterador del FOR es: " + numeroFor);
        }
        System.out.println("Seleccione una estación (1,2,3,4)");
        int estacion = in.nextInt();

        switch(estacion){
            case 1:
                System.out.println("Invierno");
                break;
            case 2:
                System.out.println("Primavera");
                break;
            case 3:
                System.out.println("Verano");
                break;
            case 4:
                System.out.println("Otoño");
                break;
            default:
                System.out.println("No ha seleccionado ninguna estación.");
                break;
        }

    }
}
