/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author yonyh
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int res[] = new int[100];
        int co[] = new int[100];
        int id[] = new int[100];
        int total[] = new int[100];
        int respuestas[] = new int[100];
        int n, con, buenas = 0, malas = 0, k;
        Random r = new Random(4);
        for (int i = 1; i <= 30; i++) {
            res[i] = (int) (Math.random() * 4 + 1);

//            System.out.println("la respuesta " + i + " es: " + res[i]);
        }

        System.out.println("digite el numero de estudiantes");

        n = teclado.nextInt();
        for (int i = 1; i <= n; i++) {

            System.out.println("digite su numero de identificacion del estudiante # " + i);
            id[i] = teclado.nextInt();

            for (int j = 1; j <= 30; j++) {
                System.out.println("digite la respuesta a su pregunta # " + j);
                respuestas[j] = teclado.nextInt();

            }

            for (k = 1; k <= 30; k++) {
                if (respuestas[k] == res[k]) {
                    buenas = buenas + 1;
                } else {
                    malas = malas + 1;
                }
                if (k == 30) {
                    buenas = buenas - (malas / 3);
                    total[i] = buenas;
                }
            }

        }

        for (int i = 1; i <= 30; i++) {
            for (int j = 1; j <= 30; j++) {
                if (total[j] < total[j + 1]) {
                    int tmp = total[j + 1];
                    int tmp2 = id[j + 1];
                    total[j + 1] = total[j];
                    id[j + 1] = id[j];
                    total[j] = tmp;
                    id[j] = tmp2;
                }
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("los puntajes de la prueba son los siguientes");
        System.out.println("");
        System.out.println("");
        for (int i = 1; i <= n; i++) {
            System.out.println("el estudiante con numero de identificacion ");
            System.out.println("");
            System.out.print(id[i] + "\n");
            System.out.println("");
            System.out.println("");
            System.out.println("saco en la prueba: ");
            System.out.println("");
            System.out.println(total[i] + "\n");
        }
    }
}
