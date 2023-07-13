package ar.com.conversor.modelo;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Modelo {

    public void eleccionConversion(JFrame parentComponent) {

        Object[] opcionesConversion = {"Conversión de Monedas", "Conversión de temperatura", "Conversión de distancia", "Conversión de tiempo"};

        Object opcionElegida = JOptionPane.showInputDialog(parentComponent,
                "Seleccione una opcion de conversión", "Menu",
                JOptionPane.INFORMATION_MESSAGE,
                null, opcionesConversion, opcionesConversion[0]
        );

        if (opcionElegida == null) {
            JOptionPane.showMessageDialog(parentComponent, "programa finalizado", "Fin del programa", JOptionPane.INFORMATION_MESSAGE, null);
        } else if (opcionElegida == opcionesConversion[0]) {

            String valorAValidar = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que quieres convertir");
            validarEntrada(parentComponent, valorAValidar);

            double valorAConvertir = Double.parseDouble(valorAValidar);

            Object[] tipoDeConversion = {"De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreano",
                    "De Dolar a Pesos", "De Euro a Pesos", "De Libra a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos", };

            conversionMonedas(parentComponent, valorAConvertir, tipoDeConversion);

            otraConversion(parentComponent);

        } else if (opcionElegida == opcionesConversion[1]){

            String valorAValidar = JOptionPane.showInputDialog("Ingresa los grados a convertir");
            validarEntrada(parentComponent, valorAValidar);

            double valorAConvertir = Double.parseDouble(valorAValidar);

            Object[] tipoDeConversion = {"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius" , "de Fahrenheit a Kelvin", "de Kelvin a Celsius", "de Kelvin a Fahrenheit"};

            conversionTemperatura(parentComponent, valorAConvertir, tipoDeConversion);

            otraConversion(parentComponent);
        } else if (opcionElegida == opcionesConversion[2]){

            String valorAValidar = JOptionPane.showInputDialog("Ingresa la distancia a convertir");
            validarEntrada(parentComponent, valorAValidar);

            double valorAConvertir = Double.parseDouble(valorAValidar);

            Object[] tipoDeConversion = {"De Milimetro a centimetro", "De Milimetro a pulgada", "De Milimetro a Decimetro", "De Milimetro a Yarda", "De Milimetro a Metro" , "De Milimetro a Milla",};

            conversionDistancia(parentComponent, valorAConvertir, tipoDeConversion);

            otraConversion(parentComponent);
        } else {

            String valorAValidar = JOptionPane.showInputDialog("Ingresa el tiempo a convertir");
            validarEntrada(parentComponent, valorAValidar);

            double valorAConvertir = Double.parseDouble(valorAValidar);

            Object[] tipoDeConversion = {"De segundos a minutos", "de segundos a horas", "de segundos a dias" , "de minutos a dias", "de horas a años"};

            conversionTiempo(parentComponent, valorAConvertir, tipoDeConversion);

            otraConversion(parentComponent);
        }

    }

    public void validarEntrada(JFrame parentComponent, String valorAValidar) {

        try {
            Pattern pattern = Pattern.compile("[^0-9]");
            Matcher matcher = pattern.matcher(valorAValidar);
            boolean encontro = matcher.find();
            if (encontro) {
                JOptionPane.showMessageDialog(parentComponent, "Deberias ingresar un numero");
            }
        } catch (NullPointerException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(parentComponent, "programa finalizado", "Fin del programa", JOptionPane.INFORMATION_MESSAGE, null);
        }

    }

    public void conversionMonedas(JFrame parentComponent ,double valorAConvertir, Object[] tipoDeConversion) {

        Object conversionElegida = JOptionPane.showInputDialog(parentComponent,
                "Seleccione una opcion de conversión", "Menu",
                JOptionPane.INFORMATION_MESSAGE,
                null, tipoDeConversion, tipoDeConversion[0]);

        double valorConvertido;

        if (conversionElegida == tipoDeConversion[0]) {
            valorConvertido = valorAConvertir / 490;
            JOptionPane.showMessageDialog(parentComponent, "tenes " + valorConvertido + " Dolares.", "total", JOptionPane.INFORMATION_MESSAGE, null);
        } else if (conversionElegida == tipoDeConversion[1]) {
            valorConvertido = valorAConvertir / 566.5;
            JOptionPane.showMessageDialog(parentComponent, "tenes " + valorConvertido + " Euros.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
        }  else if (conversionElegida == tipoDeConversion[2]) {
            valorConvertido = valorAConvertir / 662.86;
            JOptionPane.showMessageDialog(parentComponent, "tenes " + valorConvertido + " Libras.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
        }  else if (conversionElegida == tipoDeConversion[3]) {
            valorConvertido = valorAConvertir / 3.62;
            JOptionPane.showMessageDialog(parentComponent, "tenes " + valorConvertido + " Yenes.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
        }  else if (conversionElegida == tipoDeConversion[4]) {
            valorConvertido = valorAConvertir * 5;
            JOptionPane.showMessageDialog(parentComponent, "tenes " + valorConvertido + " Wones Coreanos.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
        }  else if (conversionElegida == tipoDeConversion[5]) {
            valorConvertido = valorAConvertir * 490;
            JOptionPane.showMessageDialog(parentComponent, "tenes " + valorConvertido + " Pesos.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
        }  else if (conversionElegida == tipoDeConversion[6]) {
            valorConvertido = valorAConvertir * 566.5;
            JOptionPane.showMessageDialog(parentComponent, "tenes " + valorConvertido + " Pesos.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
        }  else if (conversionElegida == tipoDeConversion[7]) {
            valorConvertido = valorAConvertir * 662.86;
            JOptionPane.showMessageDialog(parentComponent, "tenes " + valorConvertido + " Pesos.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
        }  else if (conversionElegida == tipoDeConversion[8]) {
            valorConvertido = valorAConvertir * 3.62;
            JOptionPane.showMessageDialog(parentComponent, "tenes " + valorConvertido + " Pesos.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
        } else {
            valorConvertido = valorAConvertir / 5;
            JOptionPane.showMessageDialog(parentComponent, "tenes " + valorConvertido + " Pesos.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
        }
    }

    public void conversionTemperatura(JFrame parentComponent ,double valorAConvertir, Object[] tipoDeConversion) {

        Object conversionElegida = JOptionPane.showInputDialog(parentComponent,
                "Seleccione una opcion de conversión", "Menu",
                JOptionPane.INFORMATION_MESSAGE,
                null, tipoDeConversion, tipoDeConversion[0]);


        double valorConvertido;

        if (conversionElegida == tipoDeConversion[0]) {
            valorConvertido = (valorAConvertir * 1.8) + 32;
            JOptionPane.showMessageDialog(parentComponent, "Es " + valorConvertido + " Grados Fahrenheit.", "total", JOptionPane.INFORMATION_MESSAGE, null);
        } else if (conversionElegida == tipoDeConversion[1]) {
            valorConvertido = valorAConvertir + 273.15;
            JOptionPane.showMessageDialog(parentComponent, "Es " + valorConvertido + " Grados Kelvin.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
        }  else if (conversionElegida == tipoDeConversion[2]) {
            valorConvertido = Math.round((valorAConvertir - 32) * ((double) 5 / 9));
            JOptionPane.showMessageDialog(parentComponent, "Es " + valorConvertido + " Grados Celsius.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
        }  else if (conversionElegida == tipoDeConversion[3]) {
            valorConvertido = Math.round((valorAConvertir - 32) * ((double) 5 / 9) + 273.15);
            JOptionPane.showMessageDialog(parentComponent, "Es " + valorConvertido + " Grados Kelvin.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
        }  else if (conversionElegida == tipoDeConversion[4]) {
            valorConvertido = Math.round(valorAConvertir - 273.15);
            JOptionPane.showMessageDialog(parentComponent, "Es " + valorConvertido + " Grados Celsius.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
        } else {
            valorConvertido = Math.round((valorAConvertir - 273.15) * 1.8 + 32);
            JOptionPane.showMessageDialog(parentComponent, "Es " + valorConvertido + " Grados Fahrenheit.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
        }
    }

    public void conversionDistancia(JFrame parentComponent, double valorAConvertir, Object[] tipoDeConversion){

        Object conversionElegida = JOptionPane.showInputDialog(parentComponent,
                "Seleccione una opcion de conversión", "Menu",
                JOptionPane.INFORMATION_MESSAGE,
                null, tipoDeConversion, tipoDeConversion[0]);


        double valorConvertido;

        if (conversionElegida == tipoDeConversion[0]) {
            valorConvertido = (valorAConvertir / 10);
            JOptionPane.showMessageDialog(parentComponent, "Es " + valorConvertido + " centimetros.", "total", JOptionPane.INFORMATION_MESSAGE, null);
        } else if (conversionElegida == tipoDeConversion[1]) {
            valorConvertido = valorAConvertir / 25.4;
            JOptionPane.showMessageDialog(parentComponent, "Es " + valorConvertido + " pulgadas.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
        }  else if (conversionElegida == tipoDeConversion[2]) {
            valorConvertido = (valorAConvertir / 100);
            JOptionPane.showMessageDialog(parentComponent, "Es " + valorConvertido + " decimetros.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
        }  else if (conversionElegida == tipoDeConversion[3]) {
            valorConvertido = valorAConvertir / 914.4;
            JOptionPane.showMessageDialog(parentComponent, "Es " + valorConvertido + " yardas.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
        }  else if (conversionElegida == tipoDeConversion[4]) {
            valorConvertido = valorAConvertir / 1000;
            JOptionPane.showMessageDialog(parentComponent, "Es " + valorConvertido + " metros.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
        } else {
            valorConvertido = valorAConvertir / 1.609;
            JOptionPane.showMessageDialog(parentComponent, "Es " + valorConvertido + " millas.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
        }
    }

    public void conversionTiempo(JFrame parentComponent, double valorAConvertir, Object[] tipoDeConversion){

        Object conversionElegida = JOptionPane.showInputDialog(parentComponent,
                "Seleccione una opcion de conversión", "Menu",
                JOptionPane.INFORMATION_MESSAGE,
                null, tipoDeConversion, tipoDeConversion[0]);


        double valorConvertido;

        if (conversionElegida == tipoDeConversion[0]) {
            valorConvertido = valorAConvertir / 60;
            JOptionPane.showMessageDialog(parentComponent, "Es " + valorConvertido + " minutos.", "total", JOptionPane.INFORMATION_MESSAGE, null);
        } else if (conversionElegida == tipoDeConversion[1]) {
            valorConvertido = valorAConvertir / 3600;
            JOptionPane.showMessageDialog(parentComponent, "Es " + valorConvertido + " horas.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
        }  else if (conversionElegida == tipoDeConversion[2]) {
            valorConvertido = (valorAConvertir / 86400);
            JOptionPane.showMessageDialog(parentComponent, "Es " + valorConvertido + " dias.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
        }  else if (conversionElegida == tipoDeConversion[3]) {
            valorConvertido = valorAConvertir / 1440;
            JOptionPane.showMessageDialog(parentComponent, "Es " + valorConvertido + " dias.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
        }  else {
            valorConvertido = valorAConvertir / 8760;
            JOptionPane.showMessageDialog(parentComponent, "Es " + valorConvertido + " años.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
        }
    }

    public void otraConversion(JFrame parentComponent) {
        Object otraConversion = JOptionPane.showConfirmDialog(parentComponent,"queres hacer otra conversión?", "conversor", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);

        if (otraConversion.equals(0)){ // la opcion elegida fue SI
            eleccionConversion(parentComponent);
        } else {
            JOptionPane.showMessageDialog(parentComponent, "programa finalizado", "Fin del programa", JOptionPane.INFORMATION_MESSAGE, null);
        }

    }

}
