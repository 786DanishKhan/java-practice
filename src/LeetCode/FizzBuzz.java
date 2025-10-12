package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 5;
        Solution7 solution = new Solution7();
        String result = solution.fizzbuzz(n).toString();
        System.out.println(result);
    }
}
class Solution7{
    public List<String> fizzbuzz(int n){
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <=n; i++){
            if (i%3==0 && i%5==0){
                answer.add("FizzBuzz");
            } else if (i%3==0) {
                answer.add("Fizz");
            } else if (i%5==0) {
                answer.add("Buzz");
            }else{
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }
}