package train;


public class recursive01 {

    public static void main(String[] args) {
        cetakFibonacci(7);
        System.out.print("index : "+index
        );
    }
    public static long factorial(int i)
    {
        System.out.println(i+"");
        // This is the base case
        if(i == 0)
        {
            return 1;
        }
        else
        {
            // This reduces the problem to something closer to the base case
            return i * factorial(i - 1);
        }
    }

    public static int tailSum(int currentSum, int n) {
        System.out.println(currentSum+"");
        if (n <= 1) {
            return currentSum + n;
        }
        return tailSum(currentSum + n, n - 1);
    }

    public static long fib(int n) {
        if (n <= 1) return n;
        else {
            long x = fib(n-1) + fib(n-2);
            return x;
        }
    }

    static int index = 0;

    static String str = "";

    static void cetakFibonacci(int batas) {

        int temp1 = 0;

        int temp2 = 1;

        if (index < batas) {

            if (index == 0) {

                System.out.print(temp1 + " ");

                str += temp1 + ";";

            } else if (index == 1) {

                System.out.print(temp2 + " ");

                str += temp2 + ";";

            } else {

                String[] arr = str.split(";");

                temp1 = Integer.parseInt(arr[arr.length - 1]);

                temp2 = Integer.parseInt(arr[arr.length - 2]);

                System.out.print((temp1 + temp2) + " ");

                str += (temp1 + temp2) + ";";

            }

            index++;

            cetakFibonacci(batas);

        }

    }

}
