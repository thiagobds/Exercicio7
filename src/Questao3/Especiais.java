package Questao3;

public class Especiais extends Alunos{
    
    private String disciplinaGraduacao;
    private String disciplinaPosGraduacao;
   
    public Especiais(int m, String n, int i,String g, String p){
        super(m, n, i);
        this.setDisciplinaGraduacao(g);
        this.setDisciplinaPosGraduacao(p);
    }
    
    public String getDisciplinaGraduacao() {
        return this.disciplinaGraduacao;
    }
    
    public String getDisciplinaPosGraduacao() {
        return this.disciplinaPosGraduacao;
    }
    
    public void setDisciplinaGraduacao(String g) {
        this.disciplinaGraduacao = g;
    }

    public void setDisciplinaPosGraduacao(String p) {
        this.disciplinaPosGraduacao = p;
    }
}
