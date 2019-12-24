package service;

import java.util.ArrayList;
import java.util.HashSet;

public class CalculatorImpl implements Calculator {
    private HashSet<String> list = new HashSet<>();
    @Override
    public int add(int i, int j) {
        System.out.println("-->" + (i + j));
        return i + j;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("-->" + (i - j));
        return i - j;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("-->" + (i * j));
        return i * j;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("-->" + (i / j));
        return i / j;
    }
}
