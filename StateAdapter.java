/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trablhogps.Estados;

import trablhogps.Dados.Data;

/**
 *
 * @author Asus
 */
public class StateAdapter implements IStates{

    private Data dados;
    public StateAdapter(Data  dados){
        this.dados = dados;
    }
    
    @Override
    public IStates Start() {
        return this;
    }

    @Override
    public IStates GeraChave() {
        return this;
    }

    /**
     * @return the dados
     */
    public Data getDados() {
        return dados;
    }

    /**
     * @param dados the dados to set
     */
    public void setDados(Data dados) {
        this.dados = dados;
    }
    
}
