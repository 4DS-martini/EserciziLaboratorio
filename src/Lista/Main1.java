package Lista;

public class Main1 {
    public static void main(String[] args) {
        // Esempio di utilizzo delle classi
        try {
            MezzoDiTrasporto m2 = new MezzoDiTrasporto(500, "FIAT");
            System.out.println(m2.info());

            Automobile a2 = new Automobile(800, "LAND ROVER");
            Persona persona1 = new Persona("Persona1");
            Persona persona2 = new Persona("Persona2");

            a2.aggiungiPasseggero(persona1);
            a2.aggiungiPasseggero(persona2);

            System.out.println(a2.toString());

            a2.ordinaPasseggeriCrescente();
            System.out.println("Passeggeri ordinati in ordine crescente: " + a2.toString());
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
