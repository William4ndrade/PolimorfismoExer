package Ex3;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        item i = new DVD("sdsad", 213, Arrays.asList("horrivel", "muito ruim"), "jack");
        item i2 = new CD("sdsad", 213, Arrays.asList("horrivel", "muito ruim"), "jack diretor");
        item i3 = new item("sdsad", 213, Arrays.asList("horrivel", "muito ruim"));
        i.print();

        i2.print();
        i3.print();
    }
}
