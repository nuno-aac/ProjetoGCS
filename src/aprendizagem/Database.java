package aprendizagem;

import java.util.*;

public class Database {
    private ArrayList<Aluno> alunos;
    private ArrayList<Recurso> recursos;

    public Database(){
        alunos = new ArrayList<>();
        recursos = new ArrayList<>();
    }

    public Aluno findAluno(String id){
        Aluno ret = null;

        for(Aluno a : alunos){
            if(a.getId().equals(id)){
                ret = a;
                break;
            }
        }

        return ret;
    }

    public Recurso findRecurso(int id){
        Recurso ret = null;

        for(Recurso r : recursos){
            if(r.getId() == id){
                ret = r;
                break;
            }
        }

        return ret;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public ArrayList<Recurso> getRecursos() {
        return recursos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void setRecursos(ArrayList<Recurso> recursos) {
        this.recursos = recursos;
    }

    // function to sort hashmap by values
    public static HashMap<Integer, Double> sortByValue(HashMap<Integer, Double> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Double> > list =
                new LinkedList<>(hm.entrySet());

        // Sort the list
        list.sort(Map.Entry.comparingByValue());

        // put data from sorted list to hashmap
        HashMap<Integer, Double> temp = new LinkedHashMap<>();
        for (Map.Entry<Integer, Double> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public static HashMap<String, Double> sortByValueAluno(HashMap<String, Double> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Double> > list =
                new LinkedList<>(hm.entrySet());

        // Sort the list
        list.sort(Map.Entry.comparingByValue());

        // put data from sorted list to hashmap
        HashMap<String, Double> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Double> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public void findRecursosSingleAluno(ArrayList<String> tipos, String cprog, Aluno aluno){
        Emocao avgAluno = aluno.getAvgEmocao();
        Emocao avgRecurso;
        double dist;

        ArrayList<Integer> toRemove = new ArrayList<>();

        HashMap<Integer,Double> distancesToRecurso = new HashMap<>();

        for(Recurso r : recursos) {
            avgRecurso = r.getAvgEmocao();
            dist = avgAluno.getEmocaoDistancia(avgRecurso);
            distancesToRecurso.put(r.getId(), dist);
        }

        for (int key : distancesToRecurso.keySet()) {
            if(tipos.size() != 0 && !tipos.contains(findRecurso(key).getTipo())){
                toRemove.add(key);
            } else if(!findRecurso(key).getAtributos().getCprogs().contains(cprog)){
                toRemove.add(key);
            }
        }

        for(int i : toRemove) distancesToRecurso.remove(i);

        HashMap<Integer,Double> sortedDistances = sortByValue(distancesToRecurso);

        for (Map.Entry<Integer,Double> en : sortedDistances.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }

    }

    public void findAlunosSingleRecurso(Recurso recurso){
        Emocao avgRecurso = recurso.getAvgEmocao();
        Emocao avgAluno;
        double dist;

        HashMap<String,Double> distancesToRecurso = new HashMap<>();

        for(Aluno a : alunos) {
            System.out.println("HERE:" + a.getId());
            avgAluno = a.getAvgEmocao();
            dist = avgRecurso.getEmocaoDistancia(avgAluno);
            distancesToRecurso.put(a.getId(), dist);
        }

        HashMap<String,Double> sortedDistances = sortByValueAluno(distancesToRecurso);

        for (Map.Entry<String,Double> en : sortedDistances.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }

    }
}
