package icehouse;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class LowHighIndex {
    public static void main(String[] args) {
        println(mergeStrings("abc", "def") );
    }
    public static String find(int[] arr, int v){

        List<Integer> list = new ArrayList<>();

        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == v){
                list.add(i);
            }
        }

        if (list.size() > 0){
            return "min index : "+list.get(0)+" , high index : "+list.get(list.size()-1);
        }else{
            return "-1";
        }
    }

    public static String findSum(int[] arr, int total){

        List<Integer> list = new ArrayList<>();

        for (int i = 0 ; i < arr.length ; i++){
            for (int j = i ; j < arr.length; j++){
                if((i+j) == total){
                    return i+"+"+j;
                }
            }
        }
        return "";
    }

    public static boolean findStringIsValidInteger(String s){
        if (s == null) {
            return false;
        }
        if (s.isEmpty()) {
            return false;
        }


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static String mergeStrings(String a, String b){
        int size = (a.length() > b.length()) ? a.length() : b.length();
        StringBuilder s = new StringBuilder();
        for (int i=0; i<size; i++){
            if (i<a.length()){
                s.append(a.toCharArray()[i]);
            }

            if (i<b.length()){
                s.append(b.toCharArray()[i]);
            }
        }

        return s.toString();
    }

    public static String removeDuplicatedValue (String s){

        char[] chars = s.toCharArray();
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        return sb.toString();
    }
}
