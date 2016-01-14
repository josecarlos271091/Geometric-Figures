/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Carlos
 */
public class Escultura {
    protected Pieza [] lp;
    protected int cantP;
    public Escultura(int l){
        lp=new Pieza[l];
        this.cantP=0;
    }

    public void adicionarP(Pieza p){
        if(cantP>=lp.length){
            Pieza h []=new Pieza[lp.length+100];
            for(int i=0;i<lp.length;i++)
                h[i]=lp[i];
            lp=h; }
        lp[cantP++]=p;
    }
    public void eliminarP(int posicion)throws PosicionFueraDeRango{
        if(posicion<0||posicion>cantP)
            throw new PosicionFueraDeRango("La posicion es incorrecta");
        lp[posicion-1]=null;
        for(int i=posicion-1;i<cantP;i++)
            lp[i]=lp[i+1];
            cantP--;
    }
    public void eliminarP(Pieza p){
        int v=0;
        for(int i=0;i<cantP;i++)
            if(lp[i].equals(p)){
                v=i;
                lp[i]=null;}
        for(int i=v-1;i<cantP;i++)
            lp[i]=lp[i+1];
            cantP--;
    }
    public double costo(double mobra){
        double suma=mobra;
        for(int i=0;i<cantP;i++)
            suma+=lp[i].costo();
        return suma;
    }


}
