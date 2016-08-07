/**
 * Created by Atlantis on 16/4/29.
 */
public class Solution {

    public static int reverse(int x){
        long ret = 0;
        while(0 != x){
            ret = ret*10 +x%10;
            x = x/10;
        }
        if(ret>Integer.MAX_VALUE || ret<Integer.MIN_VALUE){
            return 0;
        }
        return  (int) ret;
    }

    public static void main(String[] args){

        System.out.println(reverse(123456789));
        System.out.println(reverse(-123456789));

    }

}
