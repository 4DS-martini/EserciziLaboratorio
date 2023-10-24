package poligoni;

import com.sun.xml.internal.fastinfoset.algorithm.IEEE754FloatingPointEncodingAlgorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestPoligoni {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GestionePoligoni g1 = null;
        int scelta = -1;
        int lun;
        int nL;
        float lL;
        float dMag;
        float dMIn;
        boolean flag = false;

        do {
            System.out.println("Quanti Poligoni vuoi inserire? ");
            lun = input.nextInt();
            try{
                g1 = new GestionePoligoni(lun);
                flag = true;
            }catch (Exception e){
                System.out.println("Errore: " + e.getMessage());
            }
        }while(!flag);

        System.out.println("1)Poligono Regolare \n2)Quadrato \n3)Rombo \n4) Esagono \n5) Pentagono \n0)Esci");
        System.out.println("--> ");
        scelta = input.nextInt();
        PoligonoRegolare pr1 = null;
        Quadrato q1 = null;
        Rombo r1 = null;
        Esagono e1 = null;
        Pentagono p1 = null;

        do {
            try {
                switch (scelta) {
                    case 0: //Esci
                        System.out.println("Arrivederci!");
                        break;
                    case 1: //Poligono Regolare
                        System.out.println("Numero lati: ");
                        nL = input.nextInt();
                        System.out.println("Lunghezza lati: ");
                        lL = input.nextFloat();

                        pr1 = new PoligonoRegolare(nL, lL);
                        break;
                    case 2: //Quadrato
                        System.out.println("Lunghezza lati: ");
                        lL = input.nextFloat();

                        q1 = new Quadrato(lL);
                        break;
                    case 3: //Rombo
                        System.out.println("Lunghezza lati: ");
                        lL = input.nextFloat();
                        System.out.println("Lunghezza lati: ");
                        dMag = input.nextFloat();
                        System.out.println("Lunghezza lati: ");
                        dMIn = input.nextFloat();

                        r1 = new Rombo(lL, dMag, dMIn);
                        break;
                    case 4: // Esagono
                        System.out.println("Lunghezza lati: ");
                        lL = input.nextInt();

                        e1 = new Esagono(lL);
                        break;
                    case 5: //Pentagono
                        System.out.println("Lunghezza lati: ");
                        lL = input.nextInt();

                        p1 = new Pentagono(lL);
                        break;
                    default:
                        System.out.println("Scelta errata!");

                }
            }catch (Exception e){
                System.out.println("Errore: " + e.getMessage());
            }
        }while(scelta != 0);
    }
}