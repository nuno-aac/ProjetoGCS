package aprendizagem;

import java.util.ArrayList;

public class Atributos {
    private int idadeMax;
    private int idadeMin;
    private char tempo;
    private ArrayList<Emocao> listaEmocional;
    private ArrayList<String> cprogs;

    public Atributos(int idadeMin, int idadeMax, char tempo){
        this.idadeMax = idadeMax;
        this.idadeMin = idadeMin;
        this.tempo = tempo;
        this.listaEmocional = new ArrayList<>();
        this.cprogs = new ArrayList<>();
    }

    public Atributos(){
        this.idadeMax = 0;
        this.idadeMin = 0;
        this.tempo = 'S';
        this.listaEmocional = new ArrayList<>();
        this.cprogs = new ArrayList<>();
    }

    public char getTempo() {
        return tempo;
    }

    public int getIdadeMax() {
        return idadeMax;
    }

    public int getIdadeMin() {
        return idadeMin;
    }

    public ArrayList<Emocao> getListaEmocional() {
        return listaEmocional;
    }

    public ArrayList<String> getCprogs() {
        return cprogs;
    }

    public void setIdadeMax(int idadeMax) {
        this.idadeMax = idadeMax;
    }

    public void setIdadeMin(int idadeMin) {
        this.idadeMin = idadeMin;
    }

    public void setTempo(char tempo) {
        this.tempo = tempo;
    }

    public void addEmocao(Emocao emocao){
        this.listaEmocional.add(emocao);
    }

    public void addCprog(String cprog){
        this.cprogs.add(cprog);
    }

    @Override
    public String toString() {
        return "Atributos{" +
                "idadeMax=" + idadeMax +
                ", idadeMin=" + idadeMin +
                ", tempo=" + tempo +
                ", listaEmocional=" + listaEmocional +
                ", cprogs=" + cprogs +
                '}';
    }
}
