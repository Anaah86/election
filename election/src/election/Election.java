/*
This program will allow the user to enter idividual vote per line. If empty line is entered the program ends then 
displays how many votes ech candidate recieved, displays the winner and the votes.

I created this program using arraylists to store the candidate names, used scanner to input votes. Inside a while
loop I used if statement to exit the program. Hashset ,Collections and for loop is used to find each candidates votes.


* Name : Anaah Mohamed Farook
 * 
 * Course: Computer Science
 * Module : Programming
 * 
 */


package election;

import java.util.Scanner;//import scanner class
import java.util.ArrayList; // import Arraylist class

import java.util.*; // this will import all the classes in java, import collections class, import HashSet class

public class Election {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //make the scanner object
    
    
    ArrayList<String> candidate = new ArrayList<String>(); // empty arraylist called candidate to store votes
    
    //instruction for the user to vote
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("~Please enter the votes here~");
    System.out.println("~   End with empty line     ~");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    System.out.println("Enter vote:");

    String vote = input.nextLine() ; //read userinput

    while (true) {  //while true
      candidate.add(vote); //add every vote to candidate arraylist
      vote = input.nextLine(); //read userinput

      
      if (vote.isEmpty()) { //if input is empty line then break the while loop
        break;
      }

    }

     

     
      int max = 0; // initialize max to zero
      int currval = 0; //initilize currval to zero
      String key =  null; //key is undefined
      Set<String> count = new HashSet<>(candidate);//create a Hashset using arraylist elements. Hashset only keeps unique elements only. This will enable to find the number of votes recieved.


      for (String s : count) {// initialize count to s. then loops
      currval= Collections.frequency(candidate, s); // currval equals to the numer of votes each candidate gets

      System.out.println(s + " recieved " + Collections.frequency(candidate, s)+" votes.\n"); //prints the candidates name and number of votes(using Collections.frequency to find the occurence of object). each canddidates name and the vote is printed for every loop.

      

               if(max < currval){ //if max is less than currval
                 max = currval;  //max value gets updated once the heighest value is found in the loop 
                 key = s;  //key is equal to s
                }

      }

          //This will output the winner and he votes that they recieved.
          System.out.println("The Winner is "  + key + " with " + max + " votes.");
    
    }
    
    
}
