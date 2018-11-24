/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trablhogps.Dados;

/**
 *
 * @author Asus
 */
public class Cliente {
    
    private String Username;
    private String Password;
    private double ValorPlafond;
    private Historico historico;
    /**
     * @return the historico
     */
    public Historico getHistorico() {
        return historico;
    }

    /**
     * @param historico the historico to set
     */
    public void setHistorico(Historico historico) {
        this.historico = historico;
    }

    
    public Cliente(String username,String password){
        this.Username = username;
        this.Password = password;
        this.ValorPlafond = 0;
        this.historico = null;
    }

    /**
     * @return the Username
     */
    public String getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the Valor
     */
    public double getValor() {
        return ValorPlafond;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(double Valor) {
        this.ValorPlafond += Valor;
    }
    
    
}
