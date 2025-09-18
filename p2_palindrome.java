public class p2_palindrome {
    public static boolean isPalindrome(int x) {
        int rem=0,rev=0;
        int original=x;
        if(original<0){
            return false;
        }
        while(x!=0){
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
       if(rev==original){
        return true;
       }else{
        return false;
       }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(202));
    }
}