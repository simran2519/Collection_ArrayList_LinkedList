package CollectionFramework_ArrayList;

import java.util.ArrayList;

public class Q2_RetreiveElements
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        System.out.println("1st Element is : "+ list.get(0));
    }
}
