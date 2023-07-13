package ar.com.conversor.controlador;

import ar.com.conversor.modelo.Modelo;
import ar.com.conversor.vista.Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {

    Modelo modelo;
    Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = new Modelo();
        this.vista = new Vista();
    }

    public void iniciar() {
        modelo.eleccionConversion(vista.getFrame());
    }
}
