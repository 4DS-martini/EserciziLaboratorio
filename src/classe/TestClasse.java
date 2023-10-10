package classe;


public class TestClasse {
    public static void main(String[] args) {
        Studente s1 = null;

        try{
            s1 = new Studente("GiNo","RoSsI aArTiNi");
        }catch(ArithmeticException e){
            System.out.println("Errore: " + e.getMessage());
        }catch(Exception e){
            System.out.println("Errore: " + e.getMessage());
        }
        try {
            System.out.println(s1.toString());
        }catch (NullPointerException e){
            System.out.println("Errore: " + e.getMessage());
        }

    }
}
