import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //2.1
        ArrayList<Integer> nmbrs= new ArrayList<>();
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("véletlenszerű számok listájának hossza: ");
        //lista hosszának megadása
        int N =  Integer.parseInt(scanner.nextLine());
        for (int i=0;i<N;i++) {
            nmbrs.add(rand.nextInt(100));
        }
        //lista növekvő sorrendbe állitása
        Collections.sort(nmbrs);
        //lista elemek sorrendjének felcserélése
        Collections.reverse(nmbrs);
        //lista
        System.out.println(nmbrs.toString());
        //lista második eleme
        System.out.println("második legnagyobb elem: "+nmbrs.get(1));

        //2.2
        Collections.reverse(nmbrs);
        //különbségek eltárolása
        int diff=nmbrs.get(1)-nmbrs.get(0);
        //eredmény listája
        ArrayList<Integer> result = new ArrayList<>();
        result.add(nmbrs.get(0));
        result.add(nmbrs.get(1));
        //eredménylista módositása különbségek alapján
        for (int i=0;i<N-1;i++){
            if(nmbrs.get(i+1)-nmbrs.get(i)<diff){
                diff=nmbrs.get(i+1)-nmbrs.get(i);
                result.clear();
                result.add(nmbrs.get(i));
                result.add(nmbrs.get(i+1));
            }
        }
        //eredmény
        System.out.println("két legkisebb különbségű elem: "+result.toString());
    }
}
