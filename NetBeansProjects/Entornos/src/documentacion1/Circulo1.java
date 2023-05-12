/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *

/**
 *
 * @author Alfonso
 * Ejercicio de Documentación
 * Circulos - Versión sin información
 */
package documentacion1;

public class Circulo1 {

    private double centroX;
    private double centroY;
    private double radio;

    public Circulo1(double x, double y, double r) {
        centroX = x;
        centroY = y;
        radio = r;
    }

    public double getCentroX() {
        return centroX;
    }

    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    public void mueve(double despX, double despY) {
        centroX = centroX + despX;
        centroY = centroY + despY;
    }
}