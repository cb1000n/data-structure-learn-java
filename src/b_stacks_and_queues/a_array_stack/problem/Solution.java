package b_stacks_and_queues.a_array_stack.problem;

import java.util.Stack;

/**
 * ClassName Solution
 * Description TODO 类描述 力扣算法20题
 * https://leetcode-cn.com/problems/valid-parentheses/
 * @author ZhangRenjie
 * Date  2021/1/19 9:26
 */
public class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if (c == ')' && topChar != '(') {
                    return false;
                }
                if (c == ']' && topChar != '[') {
                    return false;
                }
                if (c == '}' && topChar != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}