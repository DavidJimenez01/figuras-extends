/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas2;

/**
 *clase que representa un cuadrado con sus operaciones
 * @author David Jimenez - Duvan Poveda
 */
public class Cuadrado {
   /**
     * Atributo que contiene la cordenada x1 y1
     */
    private Punto punto1;
    /**
     * Atributo que contiene la cordenada x2 y2
     */
    private Punto punto2;
    /**
     * Atributo que contiene la cordenada x3 y3
     */
    private Punto punto3;
    /**
     * Atributo que contiene la cordenada x4 y4
     */
    private Punto punto4;
    /**
     * Constuctor de la clase que inicializa las variables
     * @param punto1
     * @param punto2
     * @param punto3 
     * @param punto4
     */
    public Cuadrado(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.punto4 = punto4;
    }
    /**
     * Metodo que da los resultados del cuadrado
     */
    public void darResultados() {
        if(tipoCuadra()){
            System.out.println("Es un cuadrado");
        }else{
            System.out.println("Es un rectangulo");
        }
        System.out.println("Lado1: " + darLado1());
        System.out.println("Lado2: " + darLado2());
        System.out.println("Lado3: " + darLado3());
        System.out.println("Lado4: " + darLado4());
        System.out.println("Perimetro: " + darPerimetro());
        System.out.println("Area: " + darArea());
    }
    /**
     * Metodo que retorna verdad si es cuadrado y falso si es rectangulo
     * @return 
     */
    private boolean tipoCuadra() {
        if(darLado1()==darLado2()&&darLado1()==darLado3()&&darLado1()==darLado4()){
            if(darLado2()==darLado3()&&darLado2()==darLado4()){
                if(darLado3()==darLado4()){
                    return true;
                }
            }
        }
      return false; 
    }
    
    /**
     * Retorma longitud de lado AB
     * @return 
     */
    private double darLado1(){
        double auxiliarX = Math.pow(punto1.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto2.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
      /**
     * Retorma longitud de lado BC
     * @return 
     */
    private double darLado2(){
        double auxiliarX = Math.pow(punto2.getX() - punto3.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto3.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
      /**
     * Retorma longitud de lado CD
     * @return 
     */
    private double darLado3(){
        double auxiliarX = Math.pow(punto3.getX() - punto4.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto4.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
      /**
     * Retorma longitud de lado DA
     * @return 
     */
    private double darLado4(){
        double auxiliarX = Math.pow(punto4.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto4.getY() - punto1.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    /**
     * 
     * Metodo que retorna el perimetro del cuadrado
     * @return Perimetro
     */
    private double darPerimetro() {  
      return darLado1() + darLado2() + darLado3() + darLado4();
    }
     /**
     * Metodo que retorna el area de el cuadrado
     * @return  Area
     */
    private double darArea() {
        double area;
        area = (darLado1())*(darLado2());
        return area;
    }
    /**
     * retorna la coordenada x1 y1
     * @return 
     */
    public Punto getPunto1() {
        return punto1;
    }
   /**
     * retorna la coordenada x2 y2
     * @return 
     */
    public Punto getPunto2() {
        return punto2;
    }
   /**
     * retorna la coordenada x3 y3
     * @return 
     */
    public Punto getPunto3() {
        return punto3;
    }
   /**
     * retorna la coordenada x4 y4
     * @return 
     */
    public Punto getPunto4() {
        return punto4;
    }
  
    /**
     * modifica la cordenada x1 y1
     * @param punto1 
     */
    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }
 /**
     * modifica la cordenada x2 y2
     * @param punto2
     */
    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }
 /**
     * modifica la cordenada x1 y1
     * @param punto3 
     */
    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }
 /**
     * modifica la cordenada x1 y1
     * @param punto4 
     */
    public void setPunto4(Punto punto4) {
        this.punto4 = punto4;
    }
 
}
