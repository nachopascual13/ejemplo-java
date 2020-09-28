

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nachopascual13
 */
public class GestionContenedor {
    
    public void almacenarEnContenedor(){
        double Peso = 0;
        double Volumen = 0;
        
        for(int i=1;1<11;i++){
            Peso = Math.random()*3+1;
            Volumen = Math.random()*3+1;
            
            if(Peso>11){
                System.out.println("No se permite introducir más peso");
            }
            if(Volumen<11){
                System.out.println("No se puede introducir más volumen");
                break;
            }else if(Volumen)
            
        }
    }
    
    public void crearObjeto(double Peso, double Volumen){
        if(tipoObjeto.equals("Contenedor")){
            Contenedor c = new Contenedor(Peso, Volumen);
            contenedores.add(c);
        }
    }
    
    public void imprimirContenedor(double Precio, double Volumen){
        boolean encontrado = false;
    }
    
}
