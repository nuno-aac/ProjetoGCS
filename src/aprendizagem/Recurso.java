package aprendizagem;

public class Recurso{
    int id;
    String desc;
    String tipo;
    Atributos atributos;

    public Recurso(int id, String desc, String tipo, Atributos atributos){
        this.id = id;
        this.desc = desc;
        this.tipo = tipo;
        this.atributos = atributos;
    }

    public Recurso(){
        this.id = 0;
        this.desc = "";
        this.tipo = "";
        this.atributos = null;
    }

    public String getDesc() {
        return desc;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Emocao getAvgEmocao() {
        Emocao avgEmocao;
        int activeReflective, taskPeople;
        activeReflective = taskPeople = 0;

        for(Emocao e : atributos.getListaEmocional()){
            activeReflective += e.getActiveReflective();
            taskPeople += e.getTaskPeople();
        }

        activeReflective /= atributos.getListaEmocional().size();
        taskPeople /= atributos.getListaEmocional().size();

        avgEmocao = new Emocao(taskPeople,activeReflective);

        return avgEmocao;
    }

    @Override
    public String toString() {
        return "Recurso{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", tipo='" + tipo + '\'' +
                ", atributos=" + atributos.toString() +
                '}';
    }
}