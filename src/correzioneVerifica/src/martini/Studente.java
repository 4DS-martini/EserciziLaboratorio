package martini;

public class Studente extends Persona implements Cloneable{
    public Studente(String cognome, String nome, String codFisc, String data, String email) throws Exception {
        super(cognome, nome, codFisc, data, email);
        numeroIstanze++;
    }

    public Studente(Persona persona) throws Exception {
        super(persona);
        numeroIstanze++;
    }

    protected Studente clone() throws CloneNotSupportedException{
        Studente s =  (Studente) super.clone();
        return s;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object o) throws Exception{
        if(!(o instanceof Studente)){
            throw new Exception("Oggetto non Studente!");
        }

        return super.equals(o);
    }

    protected void finalize() throws Throwable {
        super.finalize();
    }
}
