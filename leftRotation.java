import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leftRotation {
    public static List<Integer> left_rotate(List<Integer> a,int len, int n){
        List<Integer> final_res = new ArrayList<Integer>(len);
        for (int i = 0;i<len;i++){
            final_res.add(i);
        }
        for (int i=0;i<len;i++){
            int newLocation = (i+(len - n)) % len;
            final_res.set(newLocation,a.get(i));
        }
        return final_res;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len, shift;
        System.out.println("Enter the items in array");
        len = scan.nextInt();
        List<Integer> list = new ArrayList<Integer>(len);
        for (int i =0; i<len;i++){
            list.add(scan.nextInt());
        }
        System.out.println("Enter the shift you wanna do...");
        shift= scan.nextInt();
        List<Integer> result = left_rotate(list, len, shift);
        for (int i=0;i<len;i++){
            System.out.print(result.get(i)+ " ");
        }
    }
}
