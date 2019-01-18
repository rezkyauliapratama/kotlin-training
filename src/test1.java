import java.util.*;



public class test1 {

    public static void main(String[] args) {
        System.out.println(findSimilar("1234","2341")+"");
    }

    public static long findSimilar(String a, String b) {
        // Write your code here

        boolean isSimilar = true;

        List<Integer> listA= new ArrayList();
        List<Integer> listB= new ArrayList();


        for (char i : a.toCharArray()){
            listA.add(Integer.parseInt(String.valueOf(i)));
        }

        for (char i : b.toCharArray()){
            listB.add(Integer.parseInt(String.valueOf(i)));
        }

        if (listA.get(0) == 0 || listB.get(0) == 0 ){
            isSimilar = false;
        }

        Collections.sort(listA);
        Collections.sort(listB);

        if (isSimilar && listA.size() ==  listB.size()){
            for (int i = 0; i < listA.size(); i++){
                if (listA.get(i) != listB.get(i)){
                    isSimilar = false;
                    break;
                }
            }
        }else{
            isSimilar = false;
        }

        System.out.println(isSimilar+"");
        List<Integer> tempArr = new ArrayList<>();
        Set<String> treeRetArr = new TreeSet<>();

        if (isSimilar){
            tempArr.addAll(listA);
        }else{
            tempArr.addAll(listB);
        }


        for (int i = 0 ; i < tempArr.size() ; i++){
            List<Integer> tempList = new ArrayList<>();
            tempList.addAll(tempArr);
            for (int j = 0 ;  j < tempList.size() ; j++){
                Collections.swap(tempList,i,j);

                String tempString = "";
                for (int x : tempList){
                    tempString = tempString+String.valueOf(x);
                }
                if (!tempString.startsWith("0") && tempString.length() > 0)
                    treeRetArr.add(tempString);
            }
        }

        for (String s : treeRetArr){
            System.out.println(s);
        }
        return treeRetArr.size();
    }
}
