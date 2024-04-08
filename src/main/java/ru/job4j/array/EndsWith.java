package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = false;
        for (int i = 0; i < postfix.length; i++) {
            if (postfix[i] != word[i]) {
                result = true;
                break;
            }
            }
        return result;
    }
}
