package Questao2;

public class Integral extends Professor{
    private double Salario_Professor_Integral;
    
    public Integral(String n, int i, int m, double s){
        super(n, i, m);
        this.setSalarioProfessorIntegral(s);
    }
    
    public double getSalarioProfessor_Integral(){
        return this.Salario_Professor_Integral;
    }
    
    public void setSalarioProfessorIntegral(double s){
        this.Salario_Professor_Integral = s;
    }
}

