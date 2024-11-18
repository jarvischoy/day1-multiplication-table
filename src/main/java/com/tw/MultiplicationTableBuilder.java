package com.tw;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.build(start, end);

        System.out.println(multiplicationTable);
    }

    public boolean isStartLessThanOrEqualToEnd(int start, int end) {
        return start <= end;
    }

    public boolean isInRange(int number) {
        return number >= 1 && number <= 1000;
    }

    public int multiply(int multiplicand, int multiplier) {
        return multiplicand * multiplier;
    }

    public boolean isValidInput(int start, int end) {
        return isStartLessThanOrEqualToEnd(start, end) && isInRange(start) && isInRange(end);
    }

    public String generateMultiplicationTableElement(int startNumber, int endNumber) {
        return String.format("%d*%d=%d", startNumber, endNumber, multiply(startNumber, endNumber));
    }

    public String build(int start, int end) {
        return "";
    }
}
