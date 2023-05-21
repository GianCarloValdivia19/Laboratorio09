/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Gian Carlo
 */
public class Arquero extends Personaje {

    private int agilidad;
    private int precision;
    
    public void dispararFlecha(Personaje atacado){
    
    
    }   
    
    @Override
    public void atacar(Personaje atacado){
        int nivelActualDeVida = atacado.getVida();
        if (this.precision>5) {
            atacado.setVida(nivelActualDeVida - 50);
        }else
            atacado.setVida(nivelActualDeVida - 6);
        atacado.defender(this);  
    }
    
    
    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }
    
    
    
    
    
    
}
