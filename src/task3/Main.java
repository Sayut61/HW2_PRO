package task3;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        getIntegerList(integers);
        System.out.println(getMinimum(integers));
    }

    public static LinkedList<Integer> getIntegerList(LinkedList<Integer> value){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество переменных: ");
        int N = in.nextInt();
        for (int i = 0; i < N; i++){
            System.out.println("Введите число: ");
            value.add(in.nextInt());
        }
        return value;
    }
    public static int getMinimum(LinkedList<Integer> value){
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < value.size(); i++) {
            if(value.get(i)<minValue)
                minValue = value.get(i);
        }
        return minValue;
    }
}
