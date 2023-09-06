package org.example;
import java.util.ArrayList;
import java.util.List;


public class LongitudArreglo {

    public static void main(String[] args) {
        int[] entrada = {1, 2, 3, 10, 22, 33};
        int[] resultado = obtenerElementosPares(entrada);

        // Imprimir el resultado
        for (int elemento : resultado) {
            System.out.println(elemento);
        }
    }

    public static int[] obtenerElementosPares(int[] arr) {
        int contadorPares = 0;

        // Contar cuántos elementos pares hay en el arreglo
        for (int elemento : arr) {
            if (elemento % 2 == 0) {
                contadorPares++;
            }
        }

        // Crear un nuevo arreglo con el tamaño necesario para los elementos pares
        int[] resultado = new int[contadorPares];
        int indiceResultado = 0;

        // Llenar el nuevo arreglo con los elementos pares
        for (int elemento : arr) {
            if (elemento % 2 == 0) {
                resultado[indiceResultado] = elemento;
                indiceResultado++;
            }
        }

        return resultado;
    }
}
