package mx.edu.uttt.arreglos;

import javax.swing.*;

public class OperacionesArreglos {
    private double [] vector;
    private final int TAMANIO = 5;

    public OperacionesArreglos (){
        this.vector = new double[TAMANIO];
    }

    public OperacionesArreglos (int tamanio){
        this.vector = new double[tamanio];
    }

    public OperacionesArreglos (double [] vector){
        this.vector = new double[vector.length];
        this.llenarArreglo(vector);
    }

    public void llenarArreglo (double [] vector){
        int i = 0;
        while(i<this.vector.length){
            this.vector[i] = vector[i];
            i++;

        }
    }

    public void llenarArreglo (){
        int i=0;
        do{
            this.vector[i] =
                    Double.parseDouble
                            (JOptionPane.showInputDialog("Introduce el valor decimal"));
            i++;
        }while(i<this.vector.length);

    }
    public double sumarValores (){

        double suma = 0.0;

        for (int i=0; i<this.vector.length; i++){
            suma+= this.vector[i];
        }

        return suma;
    }

    public double obtenerValorMaximo(){
        double maximo = 0.0;

        int i = 0;
        while(i<this.vector.length){
            if(maximo<this.vector[i])
                maximo = this.vector[i];
            i++;
        }
        return maximo;
    }

    public double obtenerValorMinimo(){
        double minimo = this.vector[0];

        for(double valor: this.vector){
            if(valor < minimo){
                minimo = valor;
            }
        }

        return minimo;
    }

    public boolean compararArreglos (double [] vector){
        boolean isEquals = true;

        if(vector.length != this.vector.length){
            isEquals = false;
        }else{
            for (int i = 0; i < this.vector.length && isEquals ; i++) {
                if(this.vector[i] !=vector[i])
                    isEquals = false;
            }
        }

        return isEquals;
    }

    public void cambiarTamanio (int tamanio){
         double temp [] = new double[tamanio];

         for(int i=0; i<this.vector.length; i++){
             temp[i] = this.vector[i];
         }

         this.vector = temp;
         temp = null;
    }

    public String bucarValor(double valor){
        String salida = "";
        boolean sentinel = false;
        for(int i = 0; i<this.vector.length; i++){
            if(valor == this.vector[i]){
                sentinel = true;
                salida = "El valor " + valor + " esta en la posición " + i;
                break;
            }
        }

        if(!sentinel)
            salida = "El valor no se encontro en el arreglo";

        return salida;
    }

    public void imprimir( ){
      // foreach

      String salida = "";
        for( double valor: vector){
            salida+= "| " + valor + " |";
        }

        JOptionPane.showMessageDialog(null, salida);



    }
}
