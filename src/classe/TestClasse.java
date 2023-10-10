package classe;

import java.util.Scanner;
public class TestClasse {
    public static void main(String[] args) {
        Studente s1 = null;

        //Scanner input = new Scanner(System.in);

        try{
            s1 = new Studente("GiNo", "MaRtInI rOsSi");
            System.out.println(s1.toString());
        }catch(ArithmeticException e){
            System.out.println("Errore 1: " + e.getMessage());
        }catch(NullPointerException e) {
            System.out.println("Errore 2: " + e.getMessage());
        }catch(IndexOutOfBoundsException e){
            System.out.println("Errore 3: " + e.getMessage());
        }catch(Exception e){
            System.out.println("Errore 4:" + e.getMessage());
        }
    }
}
