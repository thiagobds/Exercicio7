
package Questao4;

import Questao4.Aereo;

public class Aviao extends Aereo{
    
    private String Nome;
    private double Tamanho;
    private double Peso;
    
    public Aviao(double c, String n, double t, double p){
        super(c);
        this.setNome(n);
        this.setPeso(p);
        this.setTamanho(t);
    }
    
     public String getNome(){
        return this.Nome;
    }
    
    public double getTamanho(){
        return this.Tamanho;
    }
    
    public double getPeso(){
        return this.Peso;
    }
    
    public void setNome(String n){
        this.Nome = n;
    }
    
    public void setTamanho(double t){
        this.Tamanho = t;
    }
    
    public void setPeso(double p){
        this.Peso = p;
    }
}
