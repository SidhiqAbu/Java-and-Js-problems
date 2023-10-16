
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class arrayShafuling{
    public static void main(String[] args){
        // Creation of Array using Integer objects.......
        Integer [] array= {1,2,3,4,5,6,7};

        // Convert the array to a List
        List<Integer> list = new ArrayList<>(Arrays.asList(array));

        // Shuffle the List using ThreadLocalRandom
        Collections.shuffle(list, ThreadLocalRandom.current());

        // Create a new array of the same type and size as the original array
        Integer[] shuffledArray = new Integer[list.size()];

        // Copy the shuffled elements from the List to the array
        list.toArray(shuffledArray);

        // Print the Input array
         System.out.println("Input Array: " + Arrays.toString(array));

        // Print the shuffled array
        System.out.println("Shuffled Array: " + Arrays.toString(shuffledArray));
    }
}
