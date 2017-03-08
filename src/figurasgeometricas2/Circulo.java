/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas2;

/**
 *
 * @author David Jimenez - Duvan Poveda
 */
public class Circulo {
    /**
     * Atributo que contiene la cordenada x1 y1
     */
    private Punto punto1;
    /**
     * Atributo que contiene la cordenada x2 y2
     */
    private Punto punto2;
    /**
     * Constuctor de la clase que inicializa las variables
     * @param punto1
     * @param punto2
     */
    public Circulo(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }
    public void darResultados() {
        System.out.println("Radio: " + darRadio());
        System.out.println("Perimetro: " + darPerimetro());
        System.out.println("Area: " + darArea());
        System.out.println("Diametro: " + darDiametro());
    }
    /**
     * Metodo que retorna el valor del radio
     * @return radio
     */
    private double darRadio(){
        double radio;
        double auxiliarX = Math.pow(punto1.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto2.getY(), 2);
        
        radio = Math.sqrt(auxiliarX +  auxiliarY);
        return radio;
    }
    /**
     * Metodo que retorna el area del circulo
     * @return 
     */
    private double darArea(){
        double area;
        area = (Math.PI)*(Math.pow(darRadio(), 2));
        return area;
    }
    /**
     * Metodo que retorna el perimetro del circulo
     * @return 
     */
    private double darPerimetro(){
        return 2*Math.PI*darRadio();
    }
    private double darDiametro(){
        return darRadio()*2;
    }
    /**
     * retorna la cordenada x1 y1
     * @return 
     */
    public Punto getPunto1() {
        return punto1;
    }
    /**
     * modifica la cordenada x1 y1
     * @param punto1 
     */
    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }
    /**
     * retorna la cordenada x2 y2
     * @return 
     */
    public Punto getPunto2() {
        return punto2;
    }
    /**
     * modifica la cordenada x2 y2
     * @param punto2 
     */

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

}

