/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trablhogps.Dados;

import trablhogps.Dados.Aposta;
import java.util.List;

/**
 *
 * @author Asus
 */
public class Historico {
    private List<Aposta> historico;
    private int TotalGanho;
    private int TotalGasto;
    
    public Historico(List<Aposta> historico){
        this.historico = historico;
        this.TotalGanho =0;
        this.TotalGasto =0;
    }
    
    public void AdicionaAposta(Aposta nova){
        historico.add(nova);
    }
    
    public double CalculaBalanco (){
        double balanco=0;
        for(Aposta x : historico){
            balanco +=  x.getGanhos() - 2.5 ;
        }
        return balanco;
    }

    /**
     * @return the TotalGanho
     */
    public int getTotalGanho() {
        return TotalGanho;
    }

    /**
     * @param TotalGanho the TotalGanho to set
     */
    public void setTotalGanho(int TotalGanho) {
        for(Aposta x : historico){
            this.TotalGanho += x.getGanhos();
        }
    }

    /**
     * @return the TotalGasto
     */
    public int getTotalGasto() {
        return TotalGasto;
    }

    /**
     * @param TotalGasto the TotalGasto to set
     */
    public void setTotalGasto(int TotalGasto) {
         for(Aposta x : historico){
            this.TotalGanho += x.getGanhos();
        }
    }
    
}
