
package Questao4;

import Questao4.Terrestres;

public class Automovel extends Terrestres{
    
    private String Cor;
    private int Portas;
    private String Placa;
    
    public Automovel(double c, int r, String n, String co, int p, String pl){
        super(c, r);
        this.setCor(co);
        this.setPortas(p);
        this.setPlaca(pl);
    }
    
    public String getCor(){
        return this.Cor;
    }
    
    public int getPortas(){
        return this.Portas;
    }
    
    public String getPlaca(){
        return this.Placa;
    }
    
    public void setCor(String co){
        this.Cor = co;
    }
    
    public void setPortas(int p){
        this.Portas = p;
    }
    
    public void setPlaca(String pl){
        this.Placa = pl;
    }
}
