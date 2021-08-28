import java.util.Scanner;

public class AlgoCourse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] numArr = new long[n];
        for (int i=0;i<n;i++){
            numArr[i] = scan.nextInt();
        }
        long Ans = find_product(numArr, n);
        System.out.println(Ans);
    }

    public static long find_product(long[] num, int n){
        long res=0;
        long first, second;
        int firstIndex = -1;
        first = Integer.MIN_VALUE;
        second = Integer.MIN_VALUE;
        if (n == 2){
            first = num[0];
            second = num[1];
            res = first * second;
            return res;
        }
        for (int i=0;i<n;i++){
            if (num[i] > first) {
                first = num[i];
                firstIndex = i;
            }
        }
        for (int i=0;i<n;i++){
            if (i == firstIndex){
                continue;
            }
            if (num[i] > second) {
                second = num[i];
            }
        }

        res = first * second;
        return res;
    }
}
