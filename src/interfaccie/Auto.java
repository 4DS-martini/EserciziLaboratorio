package interfaccie;

public class Auto implements Confrontabile{
    private String modello;
    private Float velocita;

    public Auto(Float peso, Float velocita)throws Exception{
        setPeso(modello);
        setVelocita(velocita);
    }

    public void setPeso(String modello){
        this.modello = modello;
    }

    public void setVelocita(Float velocita) throws Exception{
        if(velocita <= 0){
            throw new Exception("Valore errato!");
        }
        this.velocita = velocita;
    }

    public String getModello() {
        return modello;
    }

    public Float getVelocita() {
        return velocita;
    }

    @Override
    public Boolean confrontaMaggiore(Object obj) throws Exception{
        if(!(obj instanceof Auto)){
            throw new Exception("Oggetto non appartenente alla classe Auto!");
        }
        if(((Auto) obj).getVelocita() > velocita){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Boolean confrontaMinore(Object obj) throws Exception{
        if(!(obj instanceof Auto)){
            throw new Exception("Oggetto non appartenente alla classe Auto!");
        }
        if(((Auto) obj).getVelocita() < velocita){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Boolean confrontaUguale(Object obj) throws Exception{
        if(!(obj instanceof Auto)){
            throw new Exception("Oggetto non appartenente alla classe Auto!");
        }
        if(((Auto) obj).getVelocita().equals(velocita)){
            return true;
        }else{
            return false;
        }
    }
}
