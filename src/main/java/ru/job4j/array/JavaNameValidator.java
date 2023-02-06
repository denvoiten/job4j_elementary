package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean rsl = false;
        if (!name.isEmpty() && isLowerLatinLetter(name.codePointAt(0))) {
            for (int index = 1; index < name.length(); index++) {
                int code = name.codePointAt(index);
                if (isLowerLatinLetter(code) || isUpperLatinLetter(code)
                        || isSpecialSymbol(code) || Character.isDigit(code)) {
                    rsl = true;
                }
            }
        }
        return rsl;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 60 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
