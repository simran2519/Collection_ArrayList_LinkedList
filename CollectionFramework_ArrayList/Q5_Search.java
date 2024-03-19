package CollectionFramework_ArrayList;

import java.util.ArrayList;

public class Q5_Search
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        for(int i=0;i<5;i++)
        {
            if(list.get(i)=="Red"){
                System.out.println("Element found at : "+ i+ " position");
                break;
            }
        }
    }
}
