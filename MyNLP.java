import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class MyNLP {

  // TODO: Create 1-2 meaningful ArrayList 
  private ArrayList<String> script;
  private ArrayList<String> words;
  

  // TODO: assigned initial values for your instance variables
  public MyNLP(String script) {
    this.script = FileReader.toStringList(script);
    this.words = getWordsFromScript(this.script);
  }
  
 // Method that goes through the script and makes each line an individual word

  /**
  * This is method from Lesson 9
  * Breaks each line of the script into individual words and returns
  * an ArrayList containing each individual word
  */
  public ArrayList<String> getWordsFromScript(ArrayList<String> script) {
    ArrayList<String> words = new ArrayList<String>();

    for (int index = 0; index < script.size(); index++) {
      String currentLine = script.get(index);
      int space = currentLine.indexOf(" ");

      while (space != -1) {
        String currentWord = currentLine.substring(0, space);
        words.add(currentWord);
        currentLine = currentLine.substring(space + 1);
        space = currentLine.indexOf(" ");
      }

      words.add(currentLine);
    }

    return words;
  }
  
 // Method that counts the amount of times the specific word shows up
  /**
  * This is a student-devloped method
  * @param word contains all words from script
  * @return returns the amount of times the word appears
  * Finds the count of how many times a specific word shows up and
  * returns the number
  */
  public int countWords(String word){
    int count = 0;
    
    for (int i = 0; i < words.size(); i++) {
      String currentWord = words.get(i).toLowerCase();

      if (word.toLowerCase().equals(currentWord)) {
        count++;
      }
    }
    return count;
  }
 
  /*
  * This is a student-developed method
  * Takes the user input and returns 
  * the number of times the word appears
  */
  public void scanner() {
    Scanner input = new Scanner(System.in);

    System.out.println("Which word would you like to see how many times it appears in the Lorax script? ");
    String userInput = input.nextLine();
    System.out.println(countWords(userInput));

    // TODO: add logic based on the user input
    if (!(userInput.toLowerCase().equals("goodbye"))) {
      scanner();
    }

    input.close();
  }

}
