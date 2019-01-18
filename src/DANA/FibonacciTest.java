package DANA;

import java.util.ArrayList;
import java.util.List;

public class FibonacciTest {
    public static List<Integer> fibonacci(int n) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n ;i++){
            if (i<=1){
                result.add(i);
            }else{
                result.add(result.get(i-2)+result.get(i-1));
            }
        }
        return result;
    }
}
