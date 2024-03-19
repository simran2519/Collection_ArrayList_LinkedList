package CollectionFramework_ArrayList;

import java.util.ArrayList;

public class Q8_TrimSize
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        System.out.println("using trimToSize() we can trim the capacity of ArrayList");
        list.trimToSize();
    }
}
