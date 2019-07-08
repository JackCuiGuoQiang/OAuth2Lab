package my.projectlab.myprojectone;

import org.junit.Test;


public class MyprojectoneApplicationTests {
    public static void main(String[] args) {
        String str = "FH123465.txt";
        System.out.println(str.substring(2, str.indexOf(".")));
        System.out.println(str.indexOf("."));
    }
}
