package opereDarte;

public class Collezione {
    private String nome;
    private String luogo;
    private OperaDarte[] collection;
    private int dimLog;

    public Collezione(String n, String l, int num){
        setNome(n);
        setLuogo(l);
        collection = new OperaDarte[num];
        dimLog = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public void inserisciScultura(Scultura s1)throws Exception{
        if(s1 == null){
            throw new Exception("Opera nulla!");
        }
        collection[dimLog] = new Scultura(s1);
        dimLog++;
    }

    public void inserisciQuadro(Quadro q1)throws Exception{
        if(q1 == null){
            throw new Exception("Opera nulla!");
        }
        collection[dimLog] = new Quadro(q1);
        dimLog++;
    }

    public String occupazione(OperaDarte od1){
        return "Occupato: " + od1.printIngombro();
    }

    public String toString(){
        String s = "";
        for (int i = 0; i < dimLog; i++) {
            s += collection[i].toString();
        }
        return s;
    }
}
