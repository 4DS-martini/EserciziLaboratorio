package interfaccie;

public class Esagono extends PoligonoRegolare {
    public Esagono(float lLati)throws Exception{
        super(6, lLati);
    }
    public Esagono(Esagono e)throws Exception{
        super(6, e.getLLati());
    }
    public float diagonale(){
        return super.getLLati();
    }
    public double area(){
        return(super.perimetro()*apotema())/2;
    }
    public String disegna(char x){
        String str = "";
        return str;
    }

    public Boolean confrontaMaggiore(Object obj) throws Exception{
        if(!(obj instanceof Esagono)){
            throw new Exception("Oggetto non appartenente alla classe Esagono!");
        }
        if(((Esagono) obj).area() > area()){
            return true;
        }
        else{
            return false;
        }
    }

    public Boolean confrontaMinore(Object obj) throws Exception{
        if(!(obj instanceof Esagono)){
            throw new Exception("Oggetto non appartenente alla classe Esagono!");
        }
        if(((Esagono) obj).area() < area()){
            return true;
        }
        else{
            return false;
        }
    }

    public Boolean confrontaUguale(Object obj) throws Exception{
        if(!(obj instanceof Esagono)){
            throw new Exception("Oggetto non appartenente alla classe Esagono!");
        }
        if(((Esagono) obj).area() == area()){
            return true;
        }
        else{
            return false;
        }
    }

    public double apotema(){
        return 0.86*super.getLLati();
    }
}
