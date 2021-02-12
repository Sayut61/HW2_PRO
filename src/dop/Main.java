package dop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        String wordInput;
        System.out.println("Введите слово: ");
        wordInput = in.next();
        while (!wordInput.equals("end")){
            System.out.println("Введите слово: ");
            wordInput = in.next();
            arrayList.add(wordInput);
        }
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String end = "end";
            if(end.equals(iterator.next())){
                iterator.remove();
            }
        }
        for (int j = 0; j < arrayList.size(); j++) {
            System.out.println(arrayList.get(j));
        }
    }

}
