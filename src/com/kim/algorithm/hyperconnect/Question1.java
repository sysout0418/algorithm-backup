package com.kim.algorithm.hyperconnect;

public class Question1 {

    public static boolean isValid(String brackets) {
        int endIndex = 0;

        for (int i = 0; i < brackets.length(); i++) {
            endIndex = (brackets.length() - 1) - i;
            char word = brackets.charAt(i);
            if (word == '(' || word == '{' || word == '[') {
                char endWord = brackets.charAt(endIndex);
                if (word == '(' && endWord != ')') {
                    return false;
                }
                if (word == '{' && endWord != '}') {
                    return false;
                }
                if (word == '[' && endWord != ']') {
                    return false;
                }
            } else if (word == ' ') {
                return true;
            } else {
                continue;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Question1.isValid("[{()}]"));
        System.out.println(Question1.isValid("(]"));
        System.out.println(Question1.isValid("([)]"));
    }

}
