class Solution {
    public static int[] plusOne(int[] digits) {
        long num=0;
        int count=0;
        for(int i=0;i<digits.length;i++){
            num=num*10+digits[i];
            count++;
        }
        if(digits[0]==9 && digits[digits.length-1]==9){
            count++;
        }
        int[] ans = new int[count];
        num=num+1;
        System.out.println(num);
        for (int i = ans.length - 1; i >= 0; i--) {

            ans[i] = (int) num % 10;
            System.out.println(ans[i]);
            num = num / 10;
        }
        return ans;
    }
}
class test{

    public static void main(String[] args) {
        int [] arr = new int[]{9,8,7,6,5,4,3,2,1,0};
        Solution.plusOne(arr);
    }
}