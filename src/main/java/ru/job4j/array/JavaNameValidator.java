package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean result = false;
        if (!name.isEmpty()) {
            for (int i = 0; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if ((isLowerLatinLetter(code) && i == 0) || ((isUpperLatinLetter(code) || isLowerLatinLetter(code) || isSpecialSymbol(code)) && i > 0) && result) {
                    result = true;
                }
            }
        }
        return result;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
