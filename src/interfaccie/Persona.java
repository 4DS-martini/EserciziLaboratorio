package interfaccie;

public class Persona {
    private String nome;
    private float altezza;

    Persona(String newN, float newA) throws Exception{
        setNome(newN);
        setAltezza(newA);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) throws Exception {

        this.nome = nome;
    }

    public float getAltezza() {
        return altezza;
    }
    public void setAltezza(float altezza) throws Exception {
        if(altezza <= 0){
            throw new Exception("Valore errato!");
        }
        this.altezza = altezza;
    }
}
