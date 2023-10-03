package classe;

import java.util.Arrays;

public class Classe {
    private Studente[] studenti;
    private Studente capoClasse;
    private int dimLog;

    public Classe(Studente capoClasse, Studente[] studenti)throws Exception{
        this.capoClasse = capoClasse;
        this.studenti = new Studente[studenti.length];
        setStudenti(studenti);
        this.dimLog = 0;
    }


    public Studente[] getStudenti() {
        return studenti;
    }

    public Studente getCapoClasse() {
        return capoClasse;
    }

    public void setStudenti(Studente[] studenti) throws Exception{
        this.studenti[dimLog] = new Studente(studenti[dimLog].getNome(), studenti[dimLog].getCognome());
    }

    public void setCapoClasse(Studente capoClasse) {
        this.capoClasse = capoClasse;
    }

    public void invertiAttributi() throws Exception{
        String tmp;
        for (int i = 0; i < (studenti.length) - 1; i++) {
            tmp = studenti[i].getNome();
            studenti[i].setNome(studenti[i].getCognome());
            studenti[i].setCognome(tmp);
        }
    }

    public String toString() {
        return "Studenti: " + Arrays.toString(studenti) + "\nCapoclasse: " + capoClasse;
    }
}
