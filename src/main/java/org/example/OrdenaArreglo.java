package org.example;
import java.util.Arrays;
public class OrdenaArreglo {

    public static void main(String[] args){
        int[] X = {9, 8, 1, 7, 4, 3};
        int[] Resultado = ordenaArreglo(X);

        for (int i = 0; i < Resultado.length; i++) {
            System.out.println("Resultado(" + (i + 1) + ") = " + Resultado[i]);
        }
    }

    public static int[] ordenaArreglo(int[] arreglo) {
        // Usamos el método sort() de la clase Arrays para ordenar el arreglo
        Arrays.sort(arreglo);
        return arreglo;
    }

    }
