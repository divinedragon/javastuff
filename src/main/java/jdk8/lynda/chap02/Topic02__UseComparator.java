package jdk8.lynda.chap02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Topic02__UseComparator {

    public static void main(String args[]) {

        List<String> strings = new ArrayList<String>();
        strings.add("AAA");
        strings.add("bbb");
        strings.add("CCC");
        strings.add("ddd");
        strings.add("EEE");

        // Simple case-sensitive sort operation
        Collections.sort(strings);
        System.out.println("Simple sort");
        for (String str : strings) {
            System.out.println(str);
        }

        // Case-insensitive sort with an anonymous class
        Collections.sort(strings, (str1, str2) -> {
            return str1.compareToIgnoreCase(str2);
        });

        /*
         * Collections.sort(strings, new Comparator<String>() {
         * 
         * @Override public int compare(String str1, String str2) { return
         * str1.compareToIgnoreCase(str2); } });
         */

        System.out.println("Sort with comparator");
        for (String str : strings) {
            System.out.println(str);
        }

    }

}
