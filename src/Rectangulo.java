/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Carlos
 */
public class Rectangulo extends Pieza {
    private double largo;
    private double ancho;
    public Rectangulo(double costoM,double largo,double ancho){
        super(costoM);
        this.ancho=ancho;
        this.largo=largo;
    }
    public double area(){
        return largo*ancho;
    }

}
