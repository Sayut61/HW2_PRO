package task2;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String>arrayList = new ArrayList<>();
        int num = 5;
        for (int i = 0; i < num; i++) {
            System.out.println("Введите букву: ");
            String symbolIn = in.next();
            arrayList.add(symbolIn);
        }
        doubleValues(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
    public static ArrayList<String> doubleValues (ArrayList<String> value){
        for (int i = 0; i < value.size(); i++) {
            String s = value.get(i);
            value.set(i,s+s);
        }
        return value;
    }
}
