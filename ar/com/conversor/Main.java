package ar.com.conversor;

import ar.com.conversor.controlador.Controlador;
import ar.com.conversor.modelo.Modelo;
import ar.com.conversor.vista.Vista;

public class Main {

    public static void main(String[] args) {

        Vista vista = new Vista();
        Modelo modelo = new Modelo();

        Controlador controlador = new Controlador(modelo, vista);

        controlador.iniciar();

    }
}