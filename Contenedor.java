/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nachopascual13
 */
import java.util.Random;
public class Contenedor {
    private double Peso;
    private double Volumen;
    
    public Contenedor(double Peso, double Volumen){
        this.Peso = Peso;
        this.Volumen = Volumen;
    
    }
    
    public void imprimir(){
        System.out.println("Peso: " + Peso);
        System.out.println("Volumen: " + Volumen);
        System.out.println("");
        
    }
    
    public double getPeso(){
        return Peso;
    
    }
    
    public double getVolumen(){
        return Volumen;
    
    }
    
}
