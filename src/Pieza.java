/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Carlos
 */
public abstract class Pieza {
    protected double costoM;
    public Pieza(double costoM){
        this.costoM=costoM;
    }
    public abstract double area();
    public double costo(){
        return costoM*this.area();
    }


}
