/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trablhogps.Estados;

import trablhogps.Dados.Data;
import trablhogps.TrablhoGPS;

/**
 *
 * @author Asus
 */
public class AwaitGeraChave extends StateAdapter {
    
    public AwaitGeraChave(Data dados) {
        super(dados);
    }
    
    
    @Override
    public IStates GeraChave(){
           getDados().RecolheEuromilhoesDados();
           getDados().GeraChave();          
           
           return new Start(getDados());
    }
    
}
