package DANA;

public class MinNumTest {

    public static int minNum(int A, int K, int P) {
        // Write your code here
        int asha = P;
        int kelly = 0;
        int day = 0;
        if ((A <= 100) && (A >= 1) && (K <= 100) && (K >= 1) && (P<=100) && (P >=0 )){
            while(asha >= kelly){
                day++;
                asha = asha + A;
                kelly = kelly + K;
            }
        }else{
            day = -1;
        }


        return day;
    }

}
