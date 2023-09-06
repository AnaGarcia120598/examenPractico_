package org.example;

public class ConcatenarArreglo {

        public static String concatenarArreglo(int[] arr) {
            if (arr == null || arr.length == 0) {
                return "";
            }

            String resultado = "";

            for (int i = 0; i < arr.length; i++) {
                resultado += arr[i];

                // Agregamos una coma si no es el último elemento del arreglo
                if (i < arr.length - 1) {
                    resultado += ",";
                }
            }

            return resultado;
        }

        public static void main(String[] args) {
            int[] X = {100, 200, 300};
            String resultado = concatenarArreglo(X);
            System.out.println(resultado); // Esto imprimirá "100,200,300"
        }
    }



