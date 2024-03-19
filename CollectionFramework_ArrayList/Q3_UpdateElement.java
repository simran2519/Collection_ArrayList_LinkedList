package CollectionFramework_ArrayList;

import java.util.ArrayList;

public class Q3_UpdateElement
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Black");

        list.set(2,"Yellow");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}
