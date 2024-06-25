import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class DataHelper {

    // TODO: completare i metodi seguenti

    // restituisce una lista di numeri interi casuali compresi tra 0 e 10
    public static List<Integer> getRandomInteger(int size) {

        List<Integer> listToReturn = new ArrayList<>();
        Random random = new Random();

        for (int x = 0; x < size; x++) {

            // genera numero tra 1 e 10
            int randomNumber = random.nextInt(11);
            listToReturn.add(randomNumber);
        }

        return listToReturn;
    }

    // restituisce una lista di numeri interi casuali compresi tra 0 e max
    public static List<Integer> getRandomInteger(int size, int max) {

        List<Integer> listToReturn = new ArrayList<>();
        Random random = new Random();

        for (int x = 0; x < size; x++) {

            // genera numero tra 1 e 10
            int randomNumber = random.nextInt(max + 1);
            listToReturn.add(randomNumber);
        }

        return listToReturn;
    }

    // restituisce una lista di numeri interi casuali compresi tra min e max
    public static List<Integer> getRandomInteger(int size, int min, int max) {

        List<Integer> listToReturn = new ArrayList<>();
        Random random = new Random();

        for (int x = 0; x < size; x++) {

            // genera numero tra 1 e 10
            int randomNumber = random.nextInt(max - min + 1) + min;
            listToReturn.add(randomNumber);
        }

        return listToReturn;
    }

    // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e 10
    
         public static Set<Integer> getRandomUniqueInteger(int size) {
         Random random = new Random();
         Set<Integer> set = new HashSet<>();

         while (set.size() < size) {
             set.add(random.nextInt(11));
         }

         return set;
     }

    // // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e max
    public static Set<Integer> getRandomUniqueInteger(int size, int max) {

        Random random = new Random();

        Set<Integer> set = new HashSet<>();

        while (set.size() < size) {
            set.add(random.nextInt(max + 1));
        }

        return set;
     }

    // // restituisce una lista di numeri casuali NON DUPLICATI compresi tra min e
    public static Set<Integer> getRandomUniqueInteger(int size, int min, int max) {

        Random random = new Random();

        Set<Integer> set = new HashSet<>();

        while (set.size() < size) {
            set.add(random.nextInt(max - min + 1) + min);
        }

        return set;
    }

    // restituisce una mappa di frequenza di numeri interi
    // public static ??? getFrequencyMap(List<Integer> list) {
    //
    // return null;
    // }

}