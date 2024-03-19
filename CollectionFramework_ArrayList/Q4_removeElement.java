package CollectionFramework_ArrayList;

import java.util.ArrayList;

public class Q4_removeElement
{
    public static void main(String[] args){
    ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");

        list.remove(list.get(2));
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}
