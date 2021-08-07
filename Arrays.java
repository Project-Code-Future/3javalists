//Java Workshop 3: Arrays and ArrayLists
/*KEY
+ Concept -> Make sure to read these out loud
@ Code Explanation -> Paraphrase these as necessary
& Interaction with Students -> These are suggestions, interact with students based on your best judgement
! Run the Code -> Press the run button and examine the output with students
*/


import java.util.*;
//@ Just like how a library has all types of books with separate sections for different genres,
//@ the Java platform includes a library (a set of built-in packages) that you can use for your own applications.
//@ This library is called the "Application Programming Interface" or API for short.
//@ You can think of the API as a library and a package from the API as a genre section.
//@ These packages contain specific classes or interfaces, like how genre sections in a library contain specific books of that genre.
//@ This line allows you to import the java.util package so you can use ALL of the classes and interfaces it includes.
//@ (This would be like checking out ALL of the books of a specific genre (e.g. ALL fantasy fiction books) from a library all at once!)
//@ OPTIONAL: You can view the classes and interfaces of this package at: https://docs.oracle.com/javase/8/docs/api/java/util/package-summary.html.
import java.util.ArrayList;
//@ This line allows you to import the specific class ArrayList from the java.util package.
//@ (This is like checking out a specific book from a genre section (e.g. Harry Potter and the Sorceror's Stone from the fantasy fiction section)).
//@ Either way, you now get access to the ArrayList class!
//@ We're going to be using this class to learn about arrays.  

//@ The class and public static void main method are necessary for any Java file, but not necessary to fully understand for this workshop
public class Arrays
{
    public static void main(String[] args)
    {
        int[] numbers = new int[3];
        //+ 'Int' is the array type so ALL elements of the array will be of this type
        //+ The first '[]' indicates that we are creating an array (otherwise we would just be creating an int variable)
        //+ We use the Java keyword 'new' to indicate that we are assigning a space in memory for this array
        //@ (It's like we're telling the computer that our array needs a "new" space to exist)
        //+ Arrays are objects and behave differently from regular variables, which is why we don't use the 'new' keyword when creating variables but we need to for arrays
        //+ We put the length of the array that we want it to be in the second '[]'
        //@ In this case, it's 3 which means this array has space for 3 elements
        //+ Once you initialize the array, its size CANNOT be changed!
        //@ This array will ALWAYS have space for exactly 3 elements, no more and no less
        //@ Since we haven't assigned values to the array's 3 elements yet and its type is 'int', by default all 3 of its elements are 0 (for Strings it would be en empty string: "", and so on)
        
        numbers[0] = 20;
        //+ Each array element has an index value - these indeces span from 0 (the first element) to the length of the array minus 1 (the last element)
        //@ Using negative indeces or indeces larger than the length-1 will throw an error
        //& To explain why the index of the last element is the array's length minus 1, the instructor can have the students count the array length on their fingers while starting from 0
        //& In this case they would count 3 fingers while reciting '0, 1, 2' - the last index would therefore be 2
        //& And they can't count "negative" fingers or try to count more because then they'd have more fingers out than the array length!
        //+ To assign a value to an index, we can do: arrayName[index] = value 
        //@ In this case we are assigning the value 20 to the numbers array's element with an index of 0 (the first element)
        //@ Remember: we can only assign int values to this array because it is an int array! Likewise with strings to a string array, etc. 
        numbers[1] = 30;
        //@ Now we're assigning the value 30 to the element with an index of 1 (the second element)
        numbers[2] = 40;
        //@ Now we're assigning the value 40 to the element with an index of 2 (the third and last element)
        //@ The array has been filled!

        int[] anotherNumbers = {20, 30, 40}; 
        //@ We can also simply combine all of the code we've just written into this one statement
        //+ Using brackets '{}' allows us to add all the elements we'd like to add to our array listed within the brackets and separated by a comma
        //@ The same rules still apply though - we can't change this array's length, for example

        System.out.println(numbers[0]);
        //!
        //@ This prints the first element of the numbers array
        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);
        //!
        //@ This prints all 3 elements of the array in order, separated by a space
        //+ In Java, we can use the '+' sign to join strings with strings or strings with numbers - this is called concatenation

        System.out.println(20 + 30);
        //!
        //@ Let's print out the sum of 20 and 30, which is 50
        //@ (This is NOT concatenation because we're not joining these numbers with strings, we're simply doing addition)
        System.out.println(numbers[0] + numbers[1]);
        //!
        //@ Since the first 2 elements of the numbers array are 20 and 30, this should also print out 50
        
        numbers[0] = 60;
        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);
        //!
        //+ We can change the value assigned to an array index - this is called overriding indeces
        //@ In this case we're changing the numbers array element with an index of 0 (the first element) from 20 to 60
        System.out.println(numbers[0] + numbers[1]);
        //!
        //@ Now when we print it out, we'll get the sum of 60 and 30, which is 90
        //+ Using arrays not only helps us organize our information, but also allows us to make value changes without having to hardcode anything
        //@ If we wanted to change the 20 in println(20 + 30) to 50, we'd have to manually replace it with 50
        //@ That would be hard to do if we were adding a thousand values and we had to look for a certain value among them
        //@ But with arrays if we know the index we can simply change the element!

        String[] wishList = {"Allowance", "Puppy", "Candy"};
        //+ Arrays can be of different types
        //@ This is an array of type String
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
        
        System.out.println(wishList);
        //!
        //@ If we try to print the array, we'll see a weird sequence of characters
        //+ This line is not printing the content of the wishList array but rather the address of where the array object is stored in memory

        ArrayList<String> wishList2 = new ArrayList<String>();
        //@ Now we're going to be using the ArrayList class we talked about earlier
        //+ To create an ArrayList, we need to declare it with ArrayList<type> where the type goes in between the < and >
        //@ The type of this ArrayList is String
        //+ After giving our ArrayList a name, we need to use the 'new' character (can recap what this means) and end the line with ArrayList<type>()

        System.out.println(wishList2);
        //!
        //+ Unlike how we had to specify array length with the arrays we previously worked with, ArrayLists are automatically initialized as empty lists with a length of 0
        //+ Also notice that when we directly print the ArrayList, it prints the actual empty ArrayList and not its memory address
        //@ We can't print the content of arrays like this, but we can do so for ArrayLists!

        wishList2.add("Allowance");
        System.out.println(wishList2);
        //!
        //+ The add() method allows us to add a value to the end of the ArrayList
        //& Can have students add their own item to their wishlist using the add() method
        //@ In this case, wishList2 is empty so "Allowance" will become its first value
        //@ If we try to add a value that doesn't match the ArrayList type, it'll throw an error
        //& Can have students try to add an int value and see what happens

        wishList2.add("Puppy");
        wishList2.add("Candy");
        System.out.println(wishList2);
        //!
        //& Can have students add 2 more items to their wishlist
        //@ The print line should automatically print the 3 elements in our ArrayList

        System.out.println(wishList2.get(0));
        //!
        //@ Indeces work the same way for ArrayLists as they do for arrays - between 0 and the ArrayList length minus 1
        //+ To get a value at a certain index, we can pass the index value into the get() method by doing .get(#) and it will return the value at that index in the ArrayList
        //@ In this example the get() method will return the value that is stored in the element with an index of 0 in wishList2 (the first element), or "Allowance"

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
        //@ Now we see 4 elements in our ArrayList and size() returns 4! Remember how we couldn't change the size of our arrays?
        //+ The length of arrays are immutable - in other words, they can't be changed whatsoever
        //+ However, the length of ArrayLists are mutable - they CAN be changed, like what we've just seen with wishList2
       
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
        //@ In this case, we are removing the element with an index of 0 in wishList2 (the first element), so "Allowance" will disappear from wishList2 since it is stored at index 0
        //+ All of the elements following this element will shift back by 1, which means that their index will decrease by 1
        //@ In this case, the element after "Allowance" - "Cake" - will go from an index of 1 to 0, "Puppy" will go from 2 to 1, and so on
        //& Can have students remove an element at an index of their choice using .remove(specified index)
        //+ If we try to remove a value at an index that is out of range, it will throw an error just like with arrays
        //& Can demonstrate this error if needed

        wishList2.remove("Stuffed Animal");
        System.out.println(wishList2);
        //!
        //@ We can also use the remove() method another way
        //+ To remove an element with a specified value entirely from the ArrayList, we can do: .remove(specified value)
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