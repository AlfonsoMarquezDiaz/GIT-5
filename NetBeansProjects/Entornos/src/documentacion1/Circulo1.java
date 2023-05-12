/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *

/**
 *
 * @author Alfonso
 * Ejercicio de Documentación
 * Circulos - Versión con información
 * @version 12/5/23
 */
package documentacion1;

public class Circulo1 {

    private double centroX;
    private double centroY;
    private double radio;

    /**Constructor
     * 
     */
    public Circulo1(double x, double y, double r) {
        centroX = x;
        centroY = y;
        radio = r;
    }
    /**getter
     * 
     */
    public double getCentroX() {
        return centroX;
    }
    /**getter
     * 
     */
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }
    /**Desplaza los ejes
     * 
     */
    public void mueve(double despX, double despY) {
        centroX = centroX + despX;
        centroY = centroY + despY;
    }
}