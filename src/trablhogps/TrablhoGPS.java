/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trablhogps;

import trablhogps.Dados.Data;

/**
 *
 * @author Asus
 */
public class TrablhoGPS {

    /**
     * @param args the command line arguments
     */
    private Data dados;
    
    public TrablhoGPS(){
        this.dados = new Data();
    }
    
    public Data GetData(){
        return dados;
    }
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
