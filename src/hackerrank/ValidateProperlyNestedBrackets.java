package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidateProperlyNestedBrackets {
    public static void main(String[] args) {
        String s = "int x = 42";
        Solution35 solution35 = new Solution35();
        System.out.println(solution35.isProperlyNested(s));
    }
}
class Solution35{
    public boolean isProperlyNested(String s){
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}', '{');
        map.put(']', '[');
        for(char ch : s.toCharArray()) {
            if(map.containsValue(ch)){
                stack.push(ch);
            } else if (map.containsKey(ch)){
                if(stack.isEmpty() || stack.pop() != map.get(ch))
                    return false;
        }
    }
        return stack.isEmpty();
}
}