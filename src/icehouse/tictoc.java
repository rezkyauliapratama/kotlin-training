package icehouse;


import static java.sql.DriverManager.println;

public class tictoc {

    public static void main(String[] args) {
        printTicToc(100);
    }
    public static void printTicToc(int n){
        int i = 0;
        do {
            i++;
            StringBuilder s = new StringBuilder();
            if (i % 7 == 0){
                s.append("Tic");
            }

            if (i % 13 == 0){
                s.append("Toc");
            }

            if (s.length() == 0){
                s.append(String.valueOf(i));
            }

            println(s.toString());
        }while(i <= n);
    }
}
