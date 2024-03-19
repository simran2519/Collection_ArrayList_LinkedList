package CollectionFramework_ArrayList;

import java.util.ArrayList;

public class Q7_Increase_Size
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        list.ensureCapacity(500);
        System.out.println("Now we can store elements utpo 500 This capacity is reserved now ");
    }
}
