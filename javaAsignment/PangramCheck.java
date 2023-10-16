
import java.util.*;

public class PangramCheck{

    //  Checking of given input string as pangram or not........
    static boolean checkPangram(String str){

         //  check matrix for A to Z alphabites......
        Set<Character> set = new HashSet<>();

        // looping over the input string to check the visited alphabite as true..........
        for(char ch : str.toCharArray()){
            if('a'<= ch && ch <='z') set.add(ch);
            if('A'<=ch && ch <='Z'){
                ch = Character.toLowerCase(ch);
                set.add(ch);
            }
        }
        //  If any alphabite in the matrix is not visited then return false....
        return set.size()==26;
    }
    public static void main(String[]args){

        try (Scanner scan = new Scanner(System.in)) {
            String str = scan.nextLine();
            if(checkPangram(str)){
                System.out.println("Is a Pangram");
            }else{
                System.out.println("Is not a Pangram");
            }
        }

    }
}