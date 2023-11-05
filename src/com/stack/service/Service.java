package com.stack.service;
import java.util.*;
public class Service {
    public static boolean isBalancedBrackets(String inputString) {
        Stack<Character> stack = new Stack<>();
        for (char ch : inputString.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.pop();
                    if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
