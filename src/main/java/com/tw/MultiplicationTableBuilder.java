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
    
    public String build(int start, int end) {
        return "";
    }
}
