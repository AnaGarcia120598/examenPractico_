package org.example;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

public class MesEnEspanol {
    public static String obtenerMesEnEspanol(int mes) {
        DateFormatSymbols dfs = new DateFormatSymbols(new Locale("es", "ES"));
        String[] nombresMeses = dfs.getMonths();

        // Ajustamos el valor del mes para que esté en el rango adecuado (1-12)
        if (mes >= 1 && mes <= 12) {
            return nombresMeses[mes - 1];
        } else {
            return "Mes inválido";
        }
    }

    public static void main(String[] args) {
        int mes1 = 1; // Enero
        int mes2 = 2; // Febrero

        String resultado1 = obtenerMesEnEspanol(mes1);
        String resultado2 = obtenerMesEnEspanol(mes2);

        System.out.println("Resultado 1: " + resultado1); // Deberá ser "enero"
        System.out.println("Resultado 2: " + resultado2); // Deberá ser "febrero"
    }
}


