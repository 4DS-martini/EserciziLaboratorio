package documentoCom;

import java.util.ArrayList;

public abstract class DocumentoCommerciale {
    protected ArrayList<Prodotto> listaProdotti;
    protected double totale;
    protected Azienda azienda;
    protected Data data;

    public DocumentoCommerciale(Azienda a, Data d) {
        azienda = a;
        data = d;
        totale = 0;
    }

    public void aggiungiProd(Prodotto prodotto, int numero) throws Exception {
        if(ricercaProdInAzienda(prodotto)){
            listaProdotti.add(prodotto);
            totale += prodotto.getPrezzo() * (1 + prodotto.getIvaperc()) * numero;
        }
        else{
            throw new Exception("Prodotto non presente all'interno della dispensa!");
        }
    }

    public void rimuoviProd(Prodotto prodotto) throws Exception {
        if(ricercaProdInAzienda(prodotto)){
            if(listaProdotti.contains(prodotto)){
                listaProdotti.remove(prodotto);
                totale -= prodotto.getPrezzo() * (1 + prodotto.getIvaperc());
            }
            else{
                throw new Exception("Prodotto non presente all'interno dello scontrino!");
            }
        }
        else{
            throw new Exception("Prodotto non presente all'interno della dispensa!");
        }
    }

    private boolean ricercaProdInAzienda(Prodotto prodotto){
        for(int i = 0; i <= azienda.listaProdotti.length; i++){
            if(prodotto == azienda.listaProdotti[i]){
                return true;
            }
        }
        return false;
    }

    public abstract String print();

    public String toString() {
        String s = "";
        s += "Supermercato: " + azienda.getNome();
        s += "\nIndirizzo: " + azienda.getIndirizzo();
        s += "\nMail: " + azienda.getMail();
        s += "\nTelefono: " + azienda.getTelefono();

        System.out.println("\nDettagli Spesa:");
        for (Prodotto prodotto : listaProdotti) {
            s += "\n%-20s %10.2f EUR" + prodotto.getNome() + prodotto.getPrezzo() * (1 + prodotto.getIvaperc());
        }

        s += "\nTOTALE COMPLESSIVO: " + totale + " EUR";

        return s;
    }
}
