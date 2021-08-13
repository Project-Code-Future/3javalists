//Program Only for Java Workshop 3: Arrays and ArrayLists

import java.util.*;
import java.util.ArrayList;

public class Arrays
{
    public static void main(String[] args)
    {
        int[] numbers = new int[3];
        numbers[0] = 20;
        numbers[1] = 30;
        numbers[2] = 40;
      
        int[] anotherNumbers = {20, 30, 40}; 
      
        System.out.println(numbers[0]);
        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);
      
        System.out.println(20 + 30);
        System.out.println(numbers[0] + numbers[1]);
        
        numbers[0] = 60;
        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);
        System.out.println(numbers[0] + numbers[1]);

        String[] wishList = {"Allowance", "Puppy", "Candy"};
        System.out.println(wishList[0] + " " + wishList[1] + " " + wishList[2]);

        wishList[2] = "Stuffed Animal";
        System.out.println(wishList[0] + " " + wishList[1] + " " + wishList[2]);
        System.out.println(wishList.length);
        System.out.println(wishList);
       
        ArrayList<String> wishList2 = new ArrayList<String>();
        System.out.println(wishList2);

        wishList2.add("Allowance");
        System.out.println(wishList2);
       
        wishList2.add("Puppy");
        wishList2.add("Candy");
        System.out.println(wishList2);
        
        System.out.println(wishList2.get(0));
      
        System.out.println(wishList2.size());
    
        wishList2.add("Stuffed Animal");
        System.out.println(wishList2);
        System.out.println(wishList2.size()); 
       
        wishList2.add(1, "Pizza");
        System.out.println(wishList2);
     
        wishList2.set(1, "Cake");
        System.out.println(wishList2);
    
        wishList2.remove(0);
        System.out.println(wishList2);
     
        wishList2.remove("Stuffed Animal");
        System.out.println(wishList2);
      
        wishList2.clear();
        System.out.println(wishList2);
        System.out.println(wishList2.size()); 
    }
}
