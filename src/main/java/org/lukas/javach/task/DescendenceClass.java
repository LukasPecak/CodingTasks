package org.lukas.javach.task;

/**
 * Created by Lukas on 15.06.2016.
 */
public class DescendenceClass extends SuperTestClass {
    @Override
    public String doThis(int number, String text){
        return null;
    }

    public static void main(String[] args) {
        DescendenceClass dc = new DescendenceClass();
        System.out.println(dc.getIt("some"));
    }

    String getIt(Object o) {
        return "Ocject param";
    }

    String getIt(String s) {
        return "String param";
    }
}
