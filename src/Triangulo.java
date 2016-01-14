/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Carlos
 */
public class Triangulo extends Pieza {
    private double lado1;
    private double lado2;
    private double lado3;
    public Triangulo(double costoM,double lado1,double lado2,double lado3){
        super(costoM);
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }
    public double area(){
        return Math.sqrt((lado1+lado2+lado3)*(lado1+lado2-lado3)*
                (lado3+lado2-lado1)*(lado1+lado3-lado2))/4;
    }



}
