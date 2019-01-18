package icehouse;

import java.util.Arrays;
import java.util.List;


public class ReverseWord {

    public static void main(String[] args) {
        String [] a= new String[]{"Hello", "Candidate", "Write", "It", "Vertically", "Down"};
        write_down(Arrays.asList(a));
    }
    public static void reverse(String s){
        for (int i =0 ; i < s.length() ; i ++){

            s = s.substring(1, s.length() - i)
                    + s.substring(0, 1)
                    + s.substring(s.length() - i, s.length());
        }
    }

    static void write_down(List<String> words) {
        int index = 0;
        boolean isWhile = true;
            while(isWhile){
                StringBuilder s = new StringBuilder();

                for (int i = 0; i < words.size() ; i++) {

                    if (index < words.get(i).length()){
                        s.append(words.get(i).toCharArray()[index]);
                    }else{
                        s.append(" ");
                    }
                }

                isWhile = s.toString().trim().length() > 0;
                if (isWhile){
                    System.out.println(s.toString());

                }
                index++;
            }



    }

}
