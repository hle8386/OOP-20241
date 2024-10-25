import java.util.Scanner;
import java.util.Arrays;
public class ArraySortSumAvg {
    public static void main (String [] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] nums = new int [n];
        for (int i = 0; i < n; i++) {
            nums[i] = inp.nextInt();
        }
        SortingArr(nums);
        System.out.println(Arrays.toString(nums));
        int sum = SumNum(nums);
        System.out.println(sum);
        double avg = Average(nums);
        System.out.println(avg);
        inp.close();
    }
    public static void SortingArr(int[] nums) {
        Arrays.sort(nums);
    }
    public static int SumNum(int[] nums) {
        int sum = 0;
        for (int a:nums) {
            sum += a;
        }
        return sum;
    }
    public static double Average(int[] nums) {
        int sum = SumNum(nums);
        return (double)sum/nums.length;
    }
}
