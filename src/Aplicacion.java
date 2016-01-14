/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Carlos
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Escultura e=new Escultura(20);
        try{
        e.adicionarP(new Circulo(50,3.3566));
        e.adicionarP(new Triangulo(60,3.234,4.23,5.2314));
        e.adicionarP(new Rectangulo(60,6.2452,7.2352));
        e.adicionarP(new Triangulo(40,4.5,5.6,9.0));
        e.adicionarP(new Circulo(30,6.34));
        double c=e.costo(324243.4342);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Indice Incorrecto");
        }
        }
}
