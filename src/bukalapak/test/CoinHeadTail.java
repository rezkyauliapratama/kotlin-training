package bukalapak.test;

public class CoinHeadTail {
    public static void main(String[] args) {
        System.out.println(""+solution(new int[]{0,0,0,0,0,0}));
    }

    public static int solution(int[] A) {
        int face = 0;
        int tail = 0;
        for (int i :  A){
            if (i == 1){
                face++;
            }

            if (i == 0){
                tail++;
            }
        }

        return (face > tail) ? tail : face;
    }
}
