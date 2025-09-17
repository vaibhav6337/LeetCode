
/*Given an array of integers nums and an integer target, return indices of the two numbers such
 that they add up to target.*/
 
import java.util.*;
public class p1_twoSum {
    public static int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        int[] n=new int[2];
        int s;

        for(int i=0;i<len;i++){
            s=0;
            for(int j=i+1;j<len;j++){
                s=nums[i]+nums[j];
                if(s==target){
                    n[0]=j;
                    n[1]=i;
                    break;
                }

            }
        }
        return n;
    }
    public static void main(String[] args) {
        int[] nums={5,7,23,33};
        int target=30;
        int[] s=twoSum(nums,target);
        System.out.println(Arrays.toString(s));
    }
}

