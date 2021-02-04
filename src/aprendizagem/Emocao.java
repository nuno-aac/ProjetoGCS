package aprendizagem;

public class Emocao {
    private int taskPeople;
    private int activeReflective;

    public Emocao(int x, int y){
        this.taskPeople = x;
        this.activeReflective = y;
    }

    public Emocao(String emo){
        switch (emo){
            case "Timido":
                this.taskPeople=-1;
                this.activeReflective=4;
                break;
            case "Competitivo":
                this.taskPeople = 0;
                this.activeReflective = -4;
                break;
            case "Extrovertido":
                this.taskPeople = 5;
                this.activeReflective = -4;
            case "Distraido":
                this.taskPeople = 3;
                this.activeReflective = 3;
            case "Dedicado":
            case "Interessado":
                this.taskPeople = -3;
                this.activeReflective = 0;
                break;
            case "Concentrado":
                this.taskPeople = -3;
                this.activeReflective = 2;
                break;
            case "Desconcentrado":
                this.taskPeople = 3;
                this.activeReflective = -2;
                break;
            case "Persistente":
                this.taskPeople = -3;
                this.activeReflective = -2;
                break;
            case "Dificuldades":
                this.taskPeople = 4;
                this.activeReflective = 1;
                break;
            default:
                System.out.println("[AVISO] Emoção não reconhecida: " + emo + " (Ignorada)");
                this.taskPeople=0;
                this.activeReflective=0;
                break;
        }
    }

    public int getActiveReflective() {
        return activeReflective;
    }

    public int getTaskPeople() {
        return taskPeople;
    }

    public double getEmocaoDistancia(Emocao e){
        double x1,x2,y1,y2;

        x1 = this.getTaskPeople();
        x2 = e.getTaskPeople();
        y1 = this.getActiveReflective();
        y2 = e .getActiveReflective();

        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }

    @Override
    public String toString() {
        return "("+ taskPeople + "," + activeReflective + ")";
    }
}
