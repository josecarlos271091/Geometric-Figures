/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Carlos
 */
public class Circulo extends Pieza {
    private double r;
    public Circulo(double costoM,double r){
        super(costoM);
        this.r=r;
    }
    public double area(){
        return Math.PI*Math.pow(r,2);
    }

}
