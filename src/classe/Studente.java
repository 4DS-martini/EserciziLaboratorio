package classe;

import java.lang.String;

public class Studente {
    private String nome;
    private String cognome;

    public Studente(String nome, String cognome) throws Exception{
        setNome(nome);
        setCognome(cognome);
        /*
        try{ //controllo per la divisione per 0
            int a = 1/0;
        }catch(ArithmeticException e){
            throw new ArithmeticException("Divisione per 0!");
        }
         */
    }

    public Studente(Studente s) throws Exception{
        this.nome = s.nome;
        this.cognome = s.cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setNome(String nome) throws Exception{
        this.nome = "";
        //char[] nomeArray = nome.toCharArray();
        if(nome == null){
            throw new Exception("Stringa vuota!");
        }
        if(nome.matches("[a-zA-Z]*")){
            this.nome = nome.toLowerCase();
            this.nome = this.nome.substring(0,1).toUpperCase() + this.nome.substring(1);
        }else{
            throw new Exception("Nome errato!");
        }
    }

    public void setCognome(String cognome) throws Exception{
        this.cognome = "";

        if(cognome == null){
            throw new Exception("Stringa vuota!");
        }

        String[] cog = cognome.split(" ");

        for (int i = 0; i < cog.length; i++) {
            if(cog[i].matches("[A-Za-z]*")){
                cog[i] = cog[i].toLowerCase();
                this.cognome += cog[i].substring(0,1).toUpperCase() + cog[i].substring(1) + " ";
            }else{
                throw new Exception("Cognome errato!");
            }
        }

    }


    public String toString() {
        return "Studente: \n" + nome + "\n" + cognome;
    }
}
