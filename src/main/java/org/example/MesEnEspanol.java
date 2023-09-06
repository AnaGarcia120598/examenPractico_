package org.example;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MesEnEspanol {
    public static String obtenerMesEnEspanol(String fechaStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", new Locale("es", "ES"));
        Date fecha = sdf.parse(fechaStr);
        SimpleDateFormat mesFormat = new SimpleDateFormat("MMMM", new Locale("es", "ES"));
        return mesFormat.format(fecha);
    }

    public static void main(String[] args) {
        try {
            String fecha1 = "01/01/2001";
            String fecha2 = "01/02/2001";

            String resultado1 = obtenerMesEnEspanol(fecha1);
            String resultado2 = obtenerMesEnEspanol(fecha2);

            System.out.println("Resultado 1: " + resultado1); // Deberá ser "Enero"
            System.out.println("Resultado 2: " + resultado2); // Deberá ser "Febrero"
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
