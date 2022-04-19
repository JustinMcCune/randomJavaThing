import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;


public class findMatch {
    public static List<List<Integer>> findMatch(int[] list, int total, int numToUse) {

        List<List<Integer>> result = new ArrayList<>();

        if (list.length < 3){
            return result;
        }

        Arrays.sort(list);
        Set<String> unique = new HashSet<>();

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if(numToUse == 2) {
                    if (list[i] + list[j] == total) {
                        String seq = "" + list[i] + list[j];
                        if (!unique.contains(seq)) {
                            List<Integer> temp = new ArrayList<>(Arrays.asList(list[i], list[j]));
                            result.add(temp);
                            unique.add(seq);
                            System.out.println(" Element " + i + " + Element " + j + " = " + total);;
                        }
                    }
                } else if (numToUse == 3) {
                        for (int k = j + 1; k < list.length; k++) {
                            if (list[i] + list[j] + list[k] == total) {
                                String seq = "" + list[i] + list[j] + list[k];
                                if (!unique.contains(seq)) {
                                    List<Integer> temp = new ArrayList<>(Arrays.asList(list[i], list[j], list[k]));
                                    result.add(temp);
                                    unique.add(seq);
                                    System.out.println(" Element " + i + " + Element " + j + " + Element " + k + " = " + total);
                                }
                            }
                        }
                    } else if(numToUse == 4) {
                    for (int k = j + 1; k < list.length; k++) {
                        for (int l = k + 1; l < list.length; l++) {
                            if (list[i] + list[j] + list[k] + list[l] == total) {

                                String seq = "" + list[i] +  list[j] + list[k] + list[l];
                                if (!unique.contains(seq)) {
                                    List<Integer> temp = new ArrayList<>(Arrays.asList(list[i], list[j], list[k], list[l]));
                                    result.add(temp);
                                    unique.add(seq);
                                    System.out.println(" Element " + i + " + Element " + j + " + Element " + k + " + Element " + l + " = " + total);
                                }
                            }
                        }
                    }
                }
                        }
                        }




        return result;
    }
    public static void main(String[] args){
        int[] list = {3,4,6,7,10,3,9,15,17,17, -5, 10,7, -1, 21};
        int total = 20;
        System.out.println(findMatch(list, total, 2));
        System.out.println(findMatch(list, total, 3));
        System.out.println(findMatch(list, total, 4));
    }
}

