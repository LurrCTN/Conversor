package ar.com.conversor.tests;

import javax.swing.*;
import java.awt.*;

public class TestSwing {

    public static void main(String[] args) {

        // creamos el frame de la aplicacion con el titulo 'Conversor' y le asignamos un tamaño
        JFrame frame = new JFrame("Conversor");
        frame.setSize(500, 600);

        // creamos un panel que contiene la primera parte del conversor y le asignamos un tamaño
        JPanel panelTipoDeConversion = new JPanel();
        panelTipoDeConversion.setSize(500, 200);

        // creamos un label que va a preguntar al usuario el tipo de conversion
        JLabel labelTipoDeConversion = new JLabel("Que tipo de conversion desea hacer");

        // creamos las opciones a elegir y un comboBox para agruparlas
        String[] opcionesComboBox = {"monedas", "Temperatura"};
        JComboBox<String> comboBox = new JComboBox<>(opcionesComboBox);

        // agregamos todo al panel
        panelTipoDeConversion.setLayout(new GridBagLayout());
        panelTipoDeConversion.add(labelTipoDeConversion);
        panelTipoDeConversion.add(comboBox);

        // agregamos todo al frame y lo hacemos visible
        frame.add(panelTipoDeConversion);
        frame.setVisible(true);
    }
}
