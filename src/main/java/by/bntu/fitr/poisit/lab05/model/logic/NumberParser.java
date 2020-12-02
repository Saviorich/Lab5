package by.bntu.fitr.poisit.lab05.model.logic;

// TODO: rethink the name of class
public class NumberParser {

    public int[] parseIntoDigits(int number) {
        number = Math.abs(number);

        int length = (number + "").length();
        int[] digits = new int[length];

        if (length > 0) {
            int i = 0;
            while (number > 0) {
                digits[i] = number % 10;
                number /= 10;
                i++;
            }
        }
        return digits;
    }

    public int calculateDigitsSum(int number) {
        int sum = 0;
        for(int digit : parseIntoDigits(number)) {
            sum += digit;
        }
        return sum;
    }

    public boolean hasDuplicates(int number) {
        int[] digits = parseIntoDigits(number);
        for (int i = 0; i < digits.length; i++) {
            int counter = 0;
            for (int j = 0; j < digits.length; j++) {
                if (digits[i] == digits[j]) {
                    counter++;
                }
            }
            if (counter > 1) {
                return true;
            }
        }
        return false;
    }

    public boolean isAscending(int number) {
        int[] digits = parseIntoDigits(number);
        if (digits.length > 1) {
            for (int i = 0; i < digits.length - 1; i++) {
                if (digits[i] < digits[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public int countUniqueDigits(int number) {
        int[] digits = parseIntoDigits(number);
        if (!hasDuplicates(number)) {
            return digits.length;
        }
        int uniqueCounter = 0;
        for (int i = 0; i < digits.length; i++) {
            int counter = 0;
            for (int j = 0; j < digits.length; j++) {
                if (digits[i] == digits[j]) {
                    counter++;
                }
            }
            if (counter == 1) {
                uniqueCounter++;
            }
        }
        return uniqueCounter;
    }

    public boolean isPowerOf(int number, int power) {
        if (number == power) {
            return true;
        } else if (number % power != 0) {
            return false;
        }
        return isPowerOf(number / power, power);
    }
}
