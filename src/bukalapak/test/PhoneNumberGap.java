package bukalapak.test;

public class PhoneNumberGap {
    public static void main(String[] args) {
        System.out.println(solution("0 - 22 1985--324"));
    }

    public static String solution(String S) {
        String phone = S.replaceAll("[^\\d.]", "");

        StringBuilder s = new StringBuilder();

        int modulo = phone.length() % 3;

        int i = 0;
        for (char c : phone.toCharArray()){
            i++;
            if (modulo == 2){
                if ((i % 3) == 0 ){
                    s.append(c).append("-");
                }else{
                    s.append(c);
                }
            }else if (modulo == 1){
                int endGroup = phone.length() - 3;

                if (i < endGroup){
                    if ((i % 3) == 0){
                        s.append(c).append("-");
                    }else{
                    s.append(c);
                    }
                }else{
                    if((i % 3) == 2){
                        s.append(c).append("-");
                    }else{
                        s.append(c);
                    }
                }

            }else{
                if ((i % 3) == 0 && i < phone.length()){
                    s.append(c).append("-");
                }else{
                    s.append(c);
                }
            }
        }

        return s.toString();
    }
}
