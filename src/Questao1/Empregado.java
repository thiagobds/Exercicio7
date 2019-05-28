package Questao1;

public class Empregado extends Pessoa{
    private String CodigoSetor_Empregado;
    private double SalarioBase_Empregado;
    private double Imposto_Empregado;
    
    public double CalcularSalario(double s){
        s = this.getSalarioBase() - (this.getSalarioBase() / 100 * this.getImposto());
        return s;
    }
    
    public Empregado(String n, String e, String t, String c, double b, double i){
        super(n, e, t);
        this.setCodigoSetor(c);
        this.setSalarioBase(b);
        this.setImposto(i);
    }
    
    public String getCodigoSetor(){
        return this.CodigoSetor_Empregado;
    }
    
    public void setCodigoSetor(String c){
        this.CodigoSetor_Empregado = c;
    }
    
    public double getSalarioBase(){
        return this.SalarioBase_Empregado;
    }
    
    public void setSalarioBase(double b){
        this.SalarioBase_Empregado = b;
    }
    
    public double getImposto(){
        return this.Imposto_Empregado;
    }
    
    public void setImposto(double i){
        this.Imposto_Empregado = i;
    }
}
