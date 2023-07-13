package ar.com.conversor.tests;

import javax.swing.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TestSwingJOptionPane {

    public static void main(String[] args) {

        iniciar();

    }

    public static void iniciar() {

        JFrame frame = new JFrame("Conversor");

        Object[] opcionesConversion = {"Conversión de Monedas", "Conversión de temperatura"};

        Object opcionElegida = JOptionPane.showInputDialog(frame,
                "Seleccione una opcion de conversión", "Menu",
                JOptionPane.INFORMATION_MESSAGE,
                null, opcionesConversion, opcionesConversion[0]);

        if (opcionElegida == opcionesConversion[0]){
            String valorAValidar = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que quieres convertir");
            System.out.println(valorAValidar);

            Pattern pattern = Pattern.compile("[^0-9]");
            Matcher matcher = pattern.matcher(valorAValidar);
            boolean encontro = matcher.find();
            if (encontro) {
                JOptionPane.showMessageDialog(frame, "Deberias ingresar un numero");
            }

            double valorAConvertir = Double.parseDouble(valorAValidar);

            Object[] tipoDeConversion = {"De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreano",
                    "De Dolar a Pesos", "De Euro a Pesos", "De Libra a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos", };

            Object conversionElegida = JOptionPane.showInputDialog(frame,
                    "Seleccione una opcion de conversión", "Menu",
                    JOptionPane.INFORMATION_MESSAGE,
                    null, tipoDeConversion, tipoDeConversion[0]);

            System.out.println(conversionElegida);

            double valorConvertido;

            if (conversionElegida == tipoDeConversion[0]) {
                valorConvertido = valorAConvertir / 490;
                JOptionPane.showMessageDialog(frame, "tenes " + valorConvertido + " Dolares.", "total", JOptionPane.INFORMATION_MESSAGE, null);
            } else if (conversionElegida == tipoDeConversion[1]) {
                valorConvertido = valorAConvertir / 566.5;
                JOptionPane.showMessageDialog(frame, "tenes " + valorConvertido + " Euros.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
            }  else if (conversionElegida == tipoDeConversion[2]) {
                valorConvertido = valorAConvertir / 662.86;
                JOptionPane.showMessageDialog(frame, "tenes " + valorConvertido + " Libras.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
            }  else if (conversionElegida == tipoDeConversion[3]) {
                valorConvertido = valorAConvertir / 3.62;
                JOptionPane.showMessageDialog(frame, "tenes " + valorConvertido + " Yenes.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
            }  else if (conversionElegida == tipoDeConversion[4]) {
                valorConvertido = valorAConvertir * 5;
                JOptionPane.showMessageDialog(frame, "tenes " + valorConvertido + " Wones Coreanos.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
            }  else if (conversionElegida == tipoDeConversion[5]) {
                valorConvertido = valorAConvertir * 490;
                JOptionPane.showMessageDialog(frame, "tenes " + valorConvertido + " Pesos.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
            }  else if (conversionElegida == tipoDeConversion[6]) {
                valorConvertido = valorAConvertir * 566.5;
                JOptionPane.showMessageDialog(frame, "tenes " + valorConvertido + " Pesos.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
            }  else if (conversionElegida == tipoDeConversion[7]) {
                valorConvertido = valorAConvertir * 662.86;
                JOptionPane.showMessageDialog(frame, "tenes " + valorConvertido + " Pesos.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
            }  else if (conversionElegida == tipoDeConversion[8]) {
                valorConvertido = valorAConvertir * 3.62;
                JOptionPane.showMessageDialog(frame, "tenes " + valorConvertido + " Pesos.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
            } else {
                valorConvertido = valorAConvertir / 5;
                JOptionPane.showMessageDialog(frame, "tenes " + valorConvertido + " Pesos.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
            }

            Object otraConversion = JOptionPane.showConfirmDialog(frame,"queres hacer otra conversión?", "conversor", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);

            if (otraConversion.equals(0)){ // la opcion elegida fue SI
                iniciar();
            } else {
                JOptionPane.showMessageDialog(frame, "programa finalizado", "Fin del programa", JOptionPane.INFORMATION_MESSAGE, null);
            }

            System.out.println(valorConvertido);

        } else {

            String valorAValidar = JOptionPane.showInputDialog("Ingresa los grados que quieres convertir");
            System.out.println(valorAValidar);

            Pattern pattern = Pattern.compile("[^0-9]");
            Matcher matcher = pattern.matcher(valorAValidar);
            boolean encontro = matcher.find();
            if (encontro) {
                JOptionPane.showMessageDialog(frame, "Deberias ingresar un numero");
            }

            double valorAConvertir = Double.parseDouble(valorAValidar);

            Object[] tipoDeConversion = {"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius" , "de Fahrenheit a Kelvin", "de Kelvin a Celsius", "de Kelvin a Fahrenheit"};

            Object conversionElegida = JOptionPane.showInputDialog(frame,
                    "Seleccione una opcion de conversión", "Menu",
                    JOptionPane.INFORMATION_MESSAGE,
                    null, tipoDeConversion, tipoDeConversion[0]);

            System.out.println(conversionElegida);

            double valorConvertido;
            if (conversionElegida == tipoDeConversion[0]) {
                valorConvertido = (valorAConvertir * 1.8) + 32;
                JOptionPane.showMessageDialog(frame, "Es " + valorConvertido + " Grados Fahrenheit.", "total", JOptionPane.INFORMATION_MESSAGE, null);
            } else if (conversionElegida == tipoDeConversion[1]) {
                valorConvertido = valorAConvertir + 273.15;
                JOptionPane.showMessageDialog(frame, "Es " + valorConvertido + " Grados Kelvin.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
            }  else if (conversionElegida == tipoDeConversion[2]) {
                valorConvertido = Math.round((valorAConvertir - 32) * ((double) 5 / 9));
                JOptionPane.showMessageDialog(frame, "Es " + valorConvertido + " Grados Celsius.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
            }  else if (conversionElegida == tipoDeConversion[3]) {
                valorConvertido = Math.round((valorAConvertir - 32) * ((double) 5 / 9) + 273.15);
                JOptionPane.showMessageDialog(frame, "Es " + valorConvertido + " Grados Kelvin.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
            }  else if (conversionElegida == tipoDeConversion[4]) {
                valorConvertido = Math.round(valorAConvertir - 273.15);
                JOptionPane.showMessageDialog(frame, "Es " + valorConvertido + " Grados Celsius.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
            } else {
                valorConvertido = Math.round((valorAConvertir - 273.15) * 1.8 + 32);
                JOptionPane.showMessageDialog(frame, "Es " + valorConvertido + " Grados Fahrenheit.", "Total", JOptionPane.INFORMATION_MESSAGE, null);
            }

            Object otraConversion = JOptionPane.showConfirmDialog(frame,"queres hacer otra conversión?", "conversor", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);

            if (otraConversion.equals(0)){ // la opcion elegida fue SI
                iniciar();
            } else {
                JOptionPane.showMessageDialog(frame, "programa finalizado", "Fin del programa", JOptionPane.INFORMATION_MESSAGE, null);
            }

            System.out.println("la opcion que el usuario eligio fue " + otraConversion);
        }

        System.out.println(opcionElegida);
    }
}
