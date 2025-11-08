package LeetCode;

public class AddTwoIntegers {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        Solution2235 add = new Solution2235();
        int sum = add.addTwo(num1,num2);
        System.out.println(sum);
    }
}
class Solution2235{
    public int addTwo(int num1, int num2){
        return num1 + num2;
    }
}
