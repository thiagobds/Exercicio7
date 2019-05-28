package Questao3;

public class PosGraduacao extends Alunos{
    
    private String disciplinaPosGraduacao;
    
    private PosGraduacao(int m, String n, int i, String p){
        super(m, n, i);
        this.setDisciplinaPosGraduacao(p);
    }
    
    public String getDisciplinaPosGraduacao() {
        return this.disciplinaPosGraduacao;
    }
    
    public void setDisciplinaPosGraduacao(String p) {
        this.disciplinaPosGraduacao = p;
    }
}
