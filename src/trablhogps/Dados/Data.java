/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trablhogps.Dados;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Asus
 */
public class Data {
    private Cliente cliente;
    private Aposta apostaGerada;
    private  ArrayList<Integer> Numeros = new ArrayList<Integer>();
    private  ArrayList<Integer> Estrelas = new ArrayList<Integer>();
    
    public Data(){
        this.cliente = null;

    }
    
    
    
      
    public void RecolheEuromilhoesDados(){
        Scanner scan;

        String nome = "Numeros_Percentagem.txt";
         boolean num =true;
      try{
          FileReader arq = new FileReader(nome);
          BufferedReader lerArq = new BufferedReader(arq);
          String linha;
         
          
          while((linha = lerArq.readLine()) != null){
           scan = new Scanner(linha);
              
           while(scan.hasNext()){
               if(num == true){
                    Numeros.add(scan.nextInt());
               }
               
               else{
                Estrelas.add(scan.nextInt());
               }
           }
           num = !num;
      }
      }catch(Exception e){
          System.out.println(e);
      }
    }
    
    public void GeraChave(){
        int i =0;
           ArrayList<Integer> Numero = new ArrayList<Integer>();
   ArrayList<Integer> Estrela = new ArrayList<Integer>();
    
        RecolheEuromilhoesDados();
        try{
             while(i<5){
            Collections.shuffle(Numeros);
             Numero.add(Numeros.get(0));
            Numeros.remove(0);
            i++;
             }
        }catch(Exception e){
          System.out.println(e);
                }
        apostaGerada = new Aposta();
         apostaGerada.setNumero(Numero);
        
       
        i=0;
            try{
             while(i<2){
            Collections.shuffle(Estrelas);
             Estrela.add(Estrelas.get(0));
           Estrelas.remove(0);
            i++;
             }
        }catch(Exception e){
          System.out.println(e);
                }
    
         apostaGerada.setEstrela(Estrela);
        }
 
    
        
    public void CalculaPlafond(){
        double plafond = 0;
        
        plafond  = ( cliente.getValor() + cliente.getHistorico().getTotalGanho() ) - cliente.getHistorico().getTotalGasto();
        cliente.setValor(plafond);
    }
    
     public static void main(String[] args) {
        // TODO code application logic here
     Data data = new Data();
     data.GeraChave();
     
         System.out.println(data.apostaGerada.getNumeros());
        
       System.out.println(data.apostaGerada.getEstrelas());
    
    
    
    }
     
     
     public Cliente RecolheDados(){
         Cliente s=null;
         String user=null,Pass=null;
         boolean valid = false;
         
         Scanner sc = new Scanner(System.in);
         
         while(!valid){
         System.out.println("Insira o seu Username: ");
         user = sc.next();
         Pattern p = Pattern.compile("[^A-Za-z0-9]");
         Matcher m = p.matcher(user);
         
         if(user.length()>= 5 && user.length()<=20 ){
         if( m.find() == false){
             
         }
        }     
}
        while(!valid){
         System.out.println("Insira o seu Password: ");
         Pass = sc.next();
         Pattern p = Pattern.compile("[^A-Za-z0-9]");
         Matcher m = p.matcher(Pass);
         
         if(Pass.length()>= 5 && Pass.length()<=20 ){
         if( m.find() == false){
             valid= true;
         }
        }
        }
        
        s= new Cliente(user,Pass);
             
        return s;
    
}
}