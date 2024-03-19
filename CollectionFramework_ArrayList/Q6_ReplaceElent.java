package CollectionFramework_ArrayList;

import java.util.ArrayList;

public class Q6_ReplaceElent
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");

        list.set(1,"White");
        System.out.println(list);

    }
}
