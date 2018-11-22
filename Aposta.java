/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trablhogps.Dados;

import java.util.*;


/**
 *
 * @author Asus
 */
public class Aposta {
    private  ArrayList<Integer> Numeros = new ArrayList<Integer>();
    private  ArrayList<Integer> Estrelas = new ArrayList<Integer>();
    private Date Data;
    private float Ganhos;
    public static final double APOSTADO =  2.5;

    public Aposta( ArrayList<Integer> numeros,  ArrayList<Integer> estrelas,Date data, float ganhos ) {
        this.Data = data;
        this.Ganhos = ganhos;
        this.Estrelas = estrelas;
        this.Numeros = numeros;
        
    }

    public Aposta(){}
    /**
     * @return the Numeros
     */
    public  ArrayList<Integer> getNumeros() {
        return Numeros;
    }

    /**
     * @return the Estrelas
     */
    public  ArrayList<Integer> getEstrelas() {
        return Estrelas;
    }

    /**
     * @return the Data
     */
    public Date getData() {
        return Data;
    }

    /**
     * @param Data the Data to set
     */
    public void setData(Date Data) {
        this.Data = Data;
    }

    /**
     * @return the Ganhos
     */
    public float getGanhos() {
        return Ganhos;
    }

    /**
     * @param Ganhos the Ganhos to set
     */
    public void setGanhos(float Ganhos) {
        this.Ganhos = Ganhos;
    }

    void setNumero(ArrayList<Integer> get) {
        this.Numeros = get;
    }
    
        void setEstrela(ArrayList<Integer> get) {
        this.Estrelas = get;
    }
    
    
    
}
public void EstouAqui(){}
