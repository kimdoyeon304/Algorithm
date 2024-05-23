import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int put = 0;

        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            put = sc.nextInt();
            intList.add(put % 42);
        }
        Collections.sort(intList);
        for (int i = 0; i < intList.size()-1; i++) {
            for (int j = i+1; j <intList.size(); j++) {
                if (intList.get(i)==intList.get(j)) {
                    intList.remove(j);
                    j--;
                }
            }
        }
        System.out.println(intList.size());
    }
}
