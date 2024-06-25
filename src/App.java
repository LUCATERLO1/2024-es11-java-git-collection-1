import java.util.Set;

public class App {

    /**
     * TODO:
     * 
     * completare la classe DataHelper
     * 
     * aggiungere i seguenti metodi per testare la classe DataHelper:
     * - testRandomInteger : void
     * testare le 3 implementazioni del metodo getRandomInteger
     * 
     * - testRandomUniqueInteger : void
     * testare le 3 implementazioni del metodo getRandomUniqueInteger
     * 
     * - testFrequencyMap : void
     * testare il metodo getFrequencyMap;
     * sfruttare i metodi precedentemente svolti e utilizzarli come
     * dati in ingresso per il metodo getFrequencyMap
     * 
     */




    public static void main(String[] args) throws Exception {
        testRandomInteger();
        System.out.println("---------------------------------------");
        testRandomUniqueInteger();
    }

    public static void testRandomInteger() {

        DataHelper datahelperRandom = new DataHelper();

        System.out.println("Restituisce una lista di numeri interi casuali compresi tra 0 e 10 (size 5)");
        System.out.println(datahelperRandom.getRandomInteger(5));
        System.out.println("-------------------------------------");
        System.out.println("Lista di numeri interi casuali compresi tra 0 e max (size 5, max 10)");
        System.out.println(datahelperRandom.getRandomInteger(5, 10));
        System.out.println("-------------------------------------");
        System.out.println("Restituisce una lista di numeri interi casuali compresi tra min e max (size 5 min 50 max 100)");
        System.out.println(datahelperRandom.getRandomInteger(5,50,100));
    }

      public static void testRandomUniqueInteger() {
        Set<Integer> soloSize = DataHelper.getRandomUniqueInteger(10);
        System.out.println(soloSize);
        System.out.println("-------------------------------------");
        Set<Integer> sizeAndMax = DataHelper.getRandomUniqueInteger(10, 20);
        System.out.println(sizeAndMax);
        System.out.println("-------------------------------------");
        Set<Integer> sizeMinAndMax = DataHelper.getRandomUniqueInteger(5, 10, 20);
        System.out.println(sizeMinAndMax);
    }
}
