package classe;


public class TestClasse {
    public static void main(String[] args) {
        Studente s1 = null;

        try{
            s1 = new Studente("Gino","Negro");
        }catch(ArithmeticException e){
            System.out.println("Errore: Sei stupido perchè dividi per 0 :(");
        }catch(Exception e){
            System.out.println("Errore: " + e.getMessage());
        }

    }
}
