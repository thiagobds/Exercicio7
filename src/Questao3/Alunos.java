package Questao3;

public class Alunos {
    
    private int Matricula_Aluno;
    private String Nome_Aluno;
    private int Idade_Aluno;
    
    public int getMatriculaAluno(){
        return this.Matricula_Aluno;
    }
    
    public String getNomeAluno(){
        return this.Nome_Aluno;
    }
    
    public int getIdadeAluno(){
        return this.Idade_Aluno;
    }
    
    public void setMatriculaAluno(int m){
        this.Matricula_Aluno = m;
    }
    
    public void setNomeAluno(String n){
        this.Nome_Aluno = n;
    }
    
    public void setIdadeAluno(int i){
        this.Idade_Aluno = i;
    }
    
    public Alunos(int m, String n, int i){
        this.setMatriculaAluno(m);
        this.setNomeAluno(n);
        this.setIdadeAluno(i);
    }
    
}

