package aprendizagem;

import java.util.ArrayList;

public class Aluno {
    String id;
    int idade;
    ArrayList<Emocao> listaEmocional;

    public Aluno(String id, int idade){
        this.id = id;
        this.idade = idade;
        listaEmocional = new ArrayList<>();
    }

    public Aluno(){
        this.id = "";
        this.idade = 0;
        listaEmocional = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }

    public ArrayList<Emocao> getListaEmocional() {
        return listaEmocional;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addEmocao(Emocao emocao){
        this.listaEmocional.add(emocao);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id='" + id + '\'' +
                ", idade=" + idade +
                ", listaEmocional=" + listaEmocional +
                '}';
    }

    public Emocao getAvgEmocao() {
        Emocao avgEmocao;
        int activeReflective, taskPeople;
        activeReflective = taskPeople = 0;

        for(Emocao e : listaEmocional){
            activeReflective += e.getActiveReflective();
            taskPeople += e.getTaskPeople();
        }

        activeReflective /= listaEmocional.size();
        taskPeople /= listaEmocional.size();

        avgEmocao = new Emocao(taskPeople,activeReflective);

        return avgEmocao;
    }
}
