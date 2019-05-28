package Questao2;

public class Professor {
    
    private String Nome_Professor;
    private int Idade_Professor;
    private int Matricula_Professor;
    
    public String getNomeProfessor(){
        return this.Nome_Professor;
    }
    
    public int getIdadeProfessor(){
        return this.Idade_Professor;
    }
    
    public int getMatriculaProfessor(){
        return this.Matricula_Professor;
    }
    
    public void setNomeProfessor(String n){
        this.Nome_Professor = n;
    }
    
    public void setIdadeProfessor(int i){
        this.Idade_Professor = i;
    }
    
    public void setMatriculaProfessor(int m){
        this.Matricula_Professor = m;
    }
    
    public Professor(String n, int i, int m){
        this.setNomeProfessor(n);
        this.setIdadeProfessor(i);
        this.setMatriculaProfessor(m);
    }
}
