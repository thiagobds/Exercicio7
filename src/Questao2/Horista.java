package Questao2;

public class Horista extends Professor{
    
    private double SalarioBase_Professor_Horista;
    private int HorasAula;
    
    public Horista(String n, int i, int m, int h,double b){
        super(n, i, m);
        this.setHorasAula(h);
        this.setSalarioBaseProfessorIntegral(b);
    }
    
    public double SalarioProfessorHorista(double s){
        s = this.getHorasAula() * this.getSalarioProfessorIntegral();
        return s;
    }
    
    public double getSalarioProfessorIntegral(){
        return this.SalarioBase_Professor_Horista;
    }
    
    public int getHorasAula(){
        return this.HorasAula;
    }
    
    public void setSalarioBaseProfessorIntegral(double b){
        this.SalarioBase_Professor_Horista = b;
    }
    
    public void setHorasAula(int h){
        this.HorasAula = h;
    }
}
