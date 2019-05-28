package Questao3;

public class Graduacao extends Alunos{
    
    private String disciplinaGraduação;
    
    public Graduacao(int m, String n, int i, String g){
        super(m, n, i);
        this.setDisciplinaGraduacao(g);
    }

    public String getDisciplinaGraduacao() {
        return this.disciplinaGraduação;
    }

    public void setDisciplinaGraduacao(String g) {
        this.disciplinaGraduação = g;
    }
}
