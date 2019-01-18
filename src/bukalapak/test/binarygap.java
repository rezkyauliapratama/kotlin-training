package bukalapak.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class binarygap {

    public static void main(String[] args) {
        System.out.println(""+solution(15));
    }

    public static int solution(int N) {
        // write your code in Java SE 8
        String binary = Integer.toBinaryString(N);
        Pattern pattern = Pattern.compile("(?<=1)(.*)(?=1)");
        Matcher matcher = pattern.matcher(binary);

        int length = 0;

        if (matcher.find())
        {
            String s = matcher.group(1);
            String[]temp = s.split("1");
            if (temp.length > 0){
                for (String v : temp){
                    if (length <= v.length()){
                        length = v.length();
                    }
                }
            }else{
                if (!s.contains("1"))
                length = s.length();
            }

        }

        return length;
    }
}
