
import java.util.*;

public class numberConvertion {

    //  values of Roman charectors........
    static int valueRoman(char ch){
        if(ch == 'I'){
            return 1;
        }else if(ch == 'V'){
            return 5;
        }else if(ch == 'X'){
            return 10;
        }else if(ch == 'L'){
            return 50;
        }else if (ch == 'C'){
            return 100;
        }else if(ch == 'D'){
            return 500;
        }else if(ch == 'M'){
            return 1000;
        }else{
            return -1;
        }
    }

    // convertion of Roman string in to integer values...........
     static int convertionToNumber(String str){
        int total = 0;
        for(int i=0;i<str.length();i++){
            int s1 = valueRoman(str.charAt(i));
            if(s1== -1) return -1;
            if(i+1 < str.length()){
                int s2 = valueRoman(str.charAt(i+1));
                if(s1 >= s2){
                    total = total + s1;
                }else{
                    total = total - s1;
                }
            }else{
                total = total+s1;
            }
        }
        return total;
    }
    
    public static void main(String[] args){
        //  Taking input from the user.........
        try (Scanner scan = new Scanner(System.in)) {
            String str = scan.nextLine();
            // Getting value from convertionToNumber method........
            int value = convertionToNumber(str);
            // Printing the number or error statement............... 
            if(value > -1) {
                System.out.println("Converted number : "+ value);
             }else {
                System.out.println(" Input is not a Roman number..!");
             }
        }
    }
}
