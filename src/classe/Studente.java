package classe;

import jdk.nashorn.internal.runtime.ECMAException;

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

    public void setNome(String nome)throws Exception{
        controllo(nome);
        this.nome = rimodella(nome);
    }

    public void setCognome(String cognome)throws Exception{
        controllo(cognome.trim());
        this.cognome = rimodella(cognome.trim());
    }

    private void controllo(String s) throws Exception{
        if(s == null){
            throw new NullPointerException("Stringa vuota!");
        }
        if(s.equals(" ")){
            throw new Exception("Stringa vuota!");
        }
        if(s.length() <= 3){
            throw new Exception("Stringa troppo corta!");
        }

        try {
            String[] cog = s.split(" ");
            if (cog.length == 0) {
                throw new Exception("Stringa vuota!");
            }
            for(int i = 0; i < cog.length; i++) {
                if (!cog[i].matches("[A-Z a-z]*")) { //espressioni regolari
                    throw new Exception("Cognome errato!");
                }
            }
        }catch (StringIndexOutOfBoundsException e){
            throw new Exception("Stringa errata!");
        }catch (Exception e){
            throw new Exception(" " + e.getMessage());
        }
    }

    private String rimodella(String s){
        String[] cog = s.split(" ");
        String newS = "";
        for(int i = 0; i < cog.length; i++) {
            cog[i] = cog[i].toLowerCase();
            newS += cog[i].substring(0, 1).toUpperCase() + cog[i].substring(1) + " ";
        }

        return newS;
    }

    /*public void setNome(String nome) throws Exception{
        //char[] nomeArray = nome.toCharArray();
        if(nome == null){
            throw new NullPointerException("Stringa vuota!");
        }
        if(nome.contains(" ")){
            throw new Exception("Spazi Proibiti!");
        }
        if(nome.length() <= 3){
            throw new Exception("Troppo corto!");
        }

        this.nome = "";

        if(nome.matches("[a-zA-Z]*")){
            this.nome = nome.toLowerCase();
            this.nome = this.nome.substring(0,1).toUpperCase() + this.nome.substring(1);
        }else{
            throw new Exception("Nome errato!");
        }
    }*/

    /*public void setCognome(String cognome) throws Exception{
        if(cognome == null){
            throw new NullPointerException("Stringa vuota!");
        }
        if(cognome.equals(" ")){
            throw new Exception("Stringa vuota!");
        }
        if(cognome.length() <= 3){
            throw new Exception("Stringa troppo corta!");
        }

        this.cognome = "";
        try {
            String[] cog = cognome.split(" ");
            if (cog.length == 0) {
                throw new Exception("Stringa vuota!");
            }
            for (int i = 0; i < cog.length; i++) {
                if (cog[i].matches("[A-Z a-z]*")) { //espressioni regolari
                    cog[i] = cog[i].toLowerCase();
                    this.cognome += cog[i].substring(0, 1).toUpperCase() + cog[i].substring(1) + " ";
                } else {
                    throw new Exception("Cognome errato!");
                }
            }
        }catch (IndexOutOfBoundsException e){
            throw new IndexOutOfBoundsException("Stringa errata!");
        }catch (Exception e){
            throw new Exception(" " + e.getMessage());
        }

    }*/


    public String toString() {
        return "Studente: \n" + nome + "\n" + cognome;
    }
}
