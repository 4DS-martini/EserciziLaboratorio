package classe;

public class Studente {
    private String nome;
    private String cognome;

    public Studente(String nome, String cognome) throws Exception{
        setNome(nome);
        setCognome(cognome);
    }

    public Studente Studente(Studente s) throws Exception{
        Studente newS = new Studente(s.getNome(), s.getCognome());
        return newS;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setNome(String nome) throws Exception{
        //char[] nomeArray = nome.toCharArray();
        if(nome == null){
            throw new Exception("Stringa vuota!");
        }
        if(nome.matches("[A-Z][a-z]*")){
            this.nome = nome.toLowerCase();
            this.nome = this.nome.substring(0,1).toUpperCase() + this.nome.substring(1);
        }else{
            throw new Exception("Nome errato!");
        }
    }

    public void setCognome(String cognome) throws Exception{
        if(cognome.matches("[A-Z][a-z]*")){
            this.cognome = cognome.toLowerCase();
            this.cognome = this.cognome.substring(0,1).toUpperCase() + this.cognome.substring(1);
        }else{
            throw new Exception("Cognome errato!");
        }
    }


    public String toString() {
        return "Studente: \n" + nome + "\n" + cognome;
    }
}
