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
            default:
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
