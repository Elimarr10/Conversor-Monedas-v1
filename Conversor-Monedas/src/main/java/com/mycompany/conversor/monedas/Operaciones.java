/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversor.monedas;

/**
 *
 * @author tmarroquin
 */
public class Operaciones {
 
   private double valor_moneda, resultado;
   private int seleccion1, seleccion2;
   
   // Constructor
public Operaciones() {
    }
   
   
   /*------------ GET Y SET VALOR_MONEDA  ----------------------------------------------------------------------------*/
    public double getValor_moneda() {
        return valor_moneda;
    }

    public void setValor_moneda(double valor_moneda) {
        this.valor_moneda = valor_moneda;
    }
/*------------ GET Y SET SELECCION1 ----------------------------------------------------------------------------*/
    public int getSeleccion1() {
        return seleccion1;
    }

    public void setSeleccion1(int seleccion1) {
        this.seleccion1 = seleccion1;
    }
    
/*------------ GET Y SET SELECCION2 ----------------------------------------------------------------------------*/
    public int getSeleccion2() {
        return seleccion2;
    }

    public void setSeleccion2(int seleccion2) {
        this.seleccion2 = seleccion2;
    }

/*------------ GET Y SET RESULTADO ----------------------------------------------------------------------------*/
    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

/*---------------------------------------------operaciones---------------------------------------------------*/
    
    public double convertir(){
        
        /*DOLAR*/
        if (seleccion1 ==0 && seleccion2==1) {//Dolar a Euro
            resultado = valor_moneda * 0.85;
        }else if(seleccion1 ==0 && seleccion2==2){//Dolar a LibraEst.
            resultado = valor_moneda * 0.81;
        }else if(seleccion1 ==0 && seleccion2==3){//Dolar a Quetzal
            resultado = valor_moneda * 7.87;
        }else if(seleccion1 ==0 && seleccion2==0){
            resultado = valor_moneda * 1;
        }
        
        /*EURO*/
        if (seleccion1 ==1 && seleccion2==0) {//Euro a Dolar 
            resultado = valor_moneda * 1.07;
        }else if(seleccion1 ==1 && seleccion2==2){//Euro a LibraEst.
            resultado = valor_moneda * 0.86;
        }else if(seleccion1 ==1 && seleccion2==3){//Euro a Quetzal
            resultado = valor_moneda * 8.42;
        }else if(seleccion1 ==1 && seleccion2==1){
            resultado = valor_moneda * 1;
        }
        
         /*LibraEst*/
        if (seleccion1 ==2 && seleccion2==0) {//LibraEst a Dolar 
            resultado = valor_moneda * 1.24;
        }else if(seleccion1 ==2 && seleccion2==1){//LibraEst a Euro.
            resultado = valor_moneda * 1.16;
        }else if(seleccion1 ==2 && seleccion2==3){//LibraEst a Quetzal
            resultado = valor_moneda * 9.85;
        }else if(seleccion1 ==2 && seleccion2==2){
            resultado = valor_moneda * 1;
        }
        
        /*QUETZAL*/
        if (seleccion1 ==3 && seleccion2==0) {
            resultado = valor_moneda * 0.13;
        }else if(seleccion1 ==3 && seleccion2==1){
            resultado = valor_moneda * 0.12;
        }else if(seleccion1 ==3 && seleccion2==2){
            resultado = valor_moneda * 0.10;
        }else if(seleccion1 ==3 && seleccion2==3){
            resultado = valor_moneda * 1;
        }
   
        
        return resultado;
    }
   
    
}
