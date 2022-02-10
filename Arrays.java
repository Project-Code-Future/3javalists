//Java Workshop 3: Arrays and ArrayLists
/*KEY
+ Concept -> Make sure to read these out loud
@ Code Explanation -> Paraphrase these as necessary
& Interaction with Students -> These are suggestions, interact with students based on your best judgement
! Run the Code -> Press the run button and examine the output with students
(everything within parenthesis are notes for whomever is running the lesson)
*/

/* Imports (Explain this before going over ArrayList section, skip for beginning)*/

//@ Just like how a library has all types of books with separate sections for different genres, the Java platform includes a library (a set of built-in packages) that you can use.
import java.util.*;
import java.util.ArrayList;
//@ This line allows you to use something called an ArrayList which doesn't come right away with Java
public class Arrays
{
    public static void main(String[] args)
    {
      //(Students have not learned for loops yet, if they ask about printing arrays explain they will learn that in a later lesson)
      /* Creating Arrays and Indexing */
      
        int[] numbers = new int[3];
        //+ 'int' is the array type so ALL elements of the array will be of this type
        //+ The '[]' indicates that we are creating an array
        //+ We use the Java keyword 'new' to indicate that we are assigning a space in memory for this array
        //@ (It's like we're telling the computer that our array needs a "new" space to exist)
        //+ The '[3]' indicates how many things will be in the array
        //+ Once you initialize the array, its size CANNOT be changed!
        //+ Each array element is held at a certain "index", (you can think of this as the elements place in line, however the first person is in the 0th place, NOT 1st)
        //& To show that the index of the last element is the array's length minus 1, the instructor can have the students count the array length on their fingers while starting from 0
        
        //(write out the comment below so the students understand how the array is changing, modify it as the array changes)
        /**
          [ 0, 0, 0 ]
        */
        
        numbers[0] = 20;
        /**
          [ 20, 0, 0 ]
        */

        //+ To assign a value at an index, we use: arrayName[index] = value 
        //@ In this case we are assigning the value 20 to the numbers array's element at place 0
        //@ Remember: we can only assign int values to this array because it is an int array!
        
        numbers[1] = 30;
        /**
          [ 20, 30, 0 ]
        */
        //@ Now we're assigning the value 30 to the element with an index of 1
        
        numbers[2] = 40;
        /**
          [ 20, 30, 40 ]
        */
        //@ Now we're assigning the value 40 to the element with an index of 2

        System.out.println(numbers[0]);
        //!
        //@ This prints the first element of the numbers array
        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);
        //!
        //@ This prints all 3 elements of the array in order, separated by a space

        

        int[] anotherNumbers = {20, 30, 40}; 
        //@ We can also simply combine all of the code we've just written into this one statement
        //+ Using brackets '{}' allows us to create an array with all the elements we'd like to add 
        //+ we do this by listing the elements we want within the brackets and separated by a comma
        //@ The same rules still apply though - we can't change this array's length, for example

       
        /* Operations with Arrays */
        System.out.println(numbers[0] + numbers[1]);
        //!
        //@ Since the first 2 elements of the numbers array are 20 and 30, this should print out 50
        
        numbers[0] = 60;
        /**
          [ 60, 30, 40 ]
        */
        //+ We can change the value assigned to an array index
        //@ In this case we're changing the numbers array element with an index of 0 (the first element) from 20 to 60

        

        System.out.println(numbers[0] + numbers[1]);
        //!
        //@ Now when we print it out, we'll get the sum of 60 and 30, which is 90
        //+ Using arrays helps us organize our information
        //+ Instead of making 3 seperate variables and changing them we only need one array
        //+ Now imagine if you wanted to use 100 values, or even 1000, it might become hard to rembr which variable is which
        //@ But with arrays we do not need to remember values as long we know the index we can retrive and change the element however we want!

        String[] wishList = {"Allowance", "Puppy", "Candy"};
        //@ Our new array is of type String
        //& Can have students come up with three items to add to their wishlist

        System.out.println(wishList[0] + " " + wishList[1] + " " + wishList[2]);
        //!
        //@ This prints out all of the items in our wishlist

        wishList[2] = "Stuffed Animal";
        System.out.println(wishList[0] + " " + wishList[1] + " " + wishList[2]);
        //!
        //@ This changes the last element of our wishlist to something else, in this case "Stuffed Animal"
        //& Can have students pick the index of the element they want to change and what they want to change the element to

        System.out.println(wishList.length);
        //!
        //+ To find the length of an array, we can do arrayName.length 
        //@ This line should print out 3 since the length of the wishList array is 3 elements

        /* ArrayLists */

        //(talk to students about imports then come back to this line)

        ArrayList<String> wishList2 = new ArrayList<String>();
        //@ Now we're going to be using the ArrayList class we talked about
        //+ To create an ArrayList, we need to declare it with ArrayList<type> where the type goes in between the < and >
        //@ The type of this ArrayList is String
        //+ After giving our ArrayList a name, we need to use the 'new' character (can recap what this means) and end the line with ArrayList<type>()

        System.out.println(wishList2);
        //!
        //+ Unlike how we had to specify array length with the arrays we previously worked with, ArrayLists are automatically initialized as empty lists with a length of 0
        //@ We can't print the content of arrays like this, but we can do so for ArrayLists!

        wishList2.add("Allowance");
        System.out.println(wishList2);
        //!
        //+ The add() method allows us to add a value to the end of the ArrayList
        //& Can have students add their own item to their wishlist using the add() method
        //@ In this case, wishList2 is empty so "Allowance" will become its first value
        //@ If we try to add a value that doesn't match the ArrayList type, it'll throw an error, since this ArrayList has the String type we can only add Strings
        //& Can have students try to add an int value and see what happens

        wishList2.add("Puppy");
        wishList2.add("Candy");
        System.out.println(wishList2);
        //!
        //& Can have students add 2 more items to their wishlist
        //@ The print line should print all 3 elements in our ArrayList

        System.out.println(wishList2.get(0));
        //!
        //@ Indeces work the same way for ArrayLists as they do for arrays - between 0 and the ArrayList length minus 1
        //+ To get a value at a certain index, instead of [] we use the get() method
        //@ In this example the get() method will return the value that is stored in the element with an index of 0 in wishList2 (the first element), or "Allowance"
        //& Have students try the .get() method on other indices

        System.out.println(wishList2.size());
        //!
        //@ Remember how we used .length to find the length of an array?
        //+ For ArrayLists, we call the size() method to get the length of the ArrayList
        //@ Since we've added 3 elements to wishList2, size() should return 3 which is what you'll see printed

        wishList2.add("Stuffed Animal");
        //@ Let's add one more element to our wishList2
        //& Have students choose one more item and add it to their wishlist
        System.out.println(wishList2);
        System.out.println(wishList2.size()); 
        //!
        //@ Now we see 4 elements in our ArrayList and size() returns 4!
        //+ The length of arrays CAN'T be changed whatsoever
        //+ However, the length of ArrayLists CAN be changed, like what we've just seen with wishList2

        /* ArrayList Methods */
       
        wishList2.add(1, "Pizza");
        System.out.println(wishList2);
        //!
        //@ The add() method can be used another way
        //+ If we specify the index of the ArrayList we want to add our new value to by doing .add(index #, new value), our value is added at the index we specified instead of being added to the end of the ArrayList as usual
        //@ In this case, "Pizza" is added at the index position of 1 and becomes the second value of the ArrayList
        //+ All of the elements following "Pizza" will shift over by 1, which means that their index will increase by 1 to make space for "Pizza"
        //@ In this case, the element after "Pizza" - "Puppy" - will go from an index of 1 to 2, "Candy" will go from an index of 2 to 3, and so on
        //& Can have students pick a new item and add it to their wishlist using .add(index, new value)

        wishList2.set(1, "Cake");
        System.out.println(wishList2);
        //!
        //+ To change the value of an element in the ArrayList, we use the set() method and do: .set(index #, new value)
        //@ In this case, the value of the element with an index of 1 in wishList2 (the second element) will be changed from "Pizza" to "Cake"
        //& Can have students set an element of their choice using .set(index, new value)

        wishList2.remove(0);
        System.out.println(wishList2);
        //!
        //+ To remove an element at a specified index entirely from the ArrayList, we can use the remove() method by doing: .remove(specified index)
        //@ In this case, we are removing the element with an index of 0 in wishList2, so "Allowance" will disappear from wishList2 since it is stored at index 0
        //+ All of the elements following this element will shift back by 1, which means that their index will decrease by 1
        //@ In this case, the element after "Allowance" - "Cake" - will go from an index of 1 to 0, "Puppy" will go from 2 to 1, and so on
        //& Can have students remove an element at an index of their choice using .remove(specified index)
        //+ If we try to remove a value at an index that doesn't exist, it will throw an error just like with arrays
        //& Can demonstrate this error if needed

        wishList2.remove("Stuffed Animal");
        System.out.println(wishList2);
        //!
        //@ We can also use the remove() method another way
        //+ To remove an element with a specified value entirely from the ArrayList, we can do: .remove(value)
        //@ In this case, we are removing the element with the value "Stuffed Animal" from wishList2 - no matter where it is located in wishList2, the element will automatically be removed
        //& Can have students remove an element with a value of their choice using .remove(specified value)
        //+ If we try to remove a value that doesn't exist in the ArrayList, no error will be thrown and nothing will happen to the ArrayList
        //& Can demonstrate this if needed

        wishList2.clear();
        System.out.println(wishList2);
        System.out.println(wishList2.size()); 
        //!
        //+ We can use the clear() method to erase the contents of our ArrayList
        //@ In this case, all of the values in wishList2 will be deleted and it will return to an ArrayList of length 0
        //@ We can see how the size() method returns 0, indicating that wishList2 has been cleared

        //& With remaining time, the instructor can challenge students to experiment with creating more lists using both arrays and ArrayLists
        //& For example: grocery list (String), list of the students' ages (int), list of whether or not the students have pets (boolean), etc.
        //& The instructor can have students complete tasks such as: changing the value of an element at the index __, adding a value at the index __, removing the value _____, etc.
    }
}
