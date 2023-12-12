package interfaccie;

public abstract class PoligonoRegolare implements Confrontabile {
    private int nLati;
    private float lLati;
    public PoligonoRegolare(int nLati, float lLati) throws Exception{
        if(nLati <= 3){
            throw new Exception("Numero Lati errati!");
        }
        if(lLati <= 0){
            throw new Exception("Lunghezza Lati errati!");
        }
        this.nLati = nLati;
        this.lLati = lLati;
    }
    public int getNLati(){
        return nLati;
    }
    public float getLLati(){
        return lLati;
    }
    public float perimetro(){return nLati * lLati;}

    public abstract double area();

    public abstract String disegna(char x);


    public abstract Boolean confrontaMaggiore(Object obj)throws Exception;
    public abstract Boolean confrontaMinore(Object obj)throws Exception;
    public abstract Boolean confrontaUguale(Object obj)throws Exception;

    public String toString(){
        return "Numero lati: " + nLati + " lunghi: " + lLati;
    }
}
