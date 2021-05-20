package com.company;

import java.util.ArrayList;
import java.util.List;

public class ManyMethods {
    public static void main(String[] args) {

    }

    public int solution(int number) {
        if (number < 0) return 0;

        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if (i%3 == 0 || i%5 == 0) {
                list.add(i);
            }
        }

        for (Integer a : list
             ) {
            sum += a;
        }

        return sum;
    }
}
