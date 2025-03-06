# Unit 6 - Natural Language Processing Project

## Introduction

Natural language processing (NLP) is used in many apps and devices to interact with users and make meaning of text to determine how to respond, find information, or to create new text. Your goal is to use natural language processing techniques to identify structure, patterns, and meaning in a text to have conversations with a user, execute commands, perform manipulations on the text, or generate new text.

## Requirements

Use your knowledge of object-oriented programming, ArrayLists, the String class, and algorithms to create a program that uses natural language processing techniques:

- **Create at least two ArrayLists** – Create at least two ArrayLists to store the data used in your program, such as data from text files or entered by the user.
- **Implement one or more algorithms** – Implement one or more algorithms that use loops and conditionals to find or manipulate elements in an ArrayList or String object.
- **Use methods in the String classs** - Use one or more methods in the String class in your program, such as to divide text into sentences or phrases.
- **Use at least one natural language processing technique** – Use a natural language processing technique to process, analyze, and/or generate text.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one word, otherwise it might not properly get display on this README.

![UML Diagram for my project](https://github.com/user-attachments/assets/85992178-e9e2-4701-b496-e199e736f62a)


## Video

Record a short video of your project to display here on your README. You can do this by:

- Screen record your project running on Code.org.
- Upload that recording to YouTube.
- Take a thumbnail for your image.
- Upload the thumbnail image to your repo.
- Use the following markdown code:

[![Thumbnail for my projet](https://github.com/user-attachments/assets/4f2cce6c-9023-4a3f-a10c-510ae136ba6d)
)](https://www.youtube.com/watch?v=JR2DgNNK_0A)

## Project Description

In the Lorax Word Finder project, I wanted to create an application that allows the user to input a specific word to find the amount of times it shows up in the Lorax script. The text that is being analyzed is the Lorax script which I added as a text file. With the text file implemented, the application will go through each line of the script and break it up into individual words. With the individual words, there is a countWords method that finds the amount of times the specific word appears in the script using the words ArrayList. The Scanner method allows for user input that takes the users prompt word, counts how many time it appears throughout the whole script, and continues until the word "goodbye" is used, indicating the end of the program. 

## NLP Techniques

The NLP that I implemented in my project is the keyword extraction. Iterating over the word list, the countWords method determines whether each word matches the input word from the user. Then, it counts how many times the word appears in the script and returns the number. This is necessary in the NLP technique because it's a great method that can reveal the most common terms or words in texts. This NLP technique allows users to find the frequency of a word/ term/ information that they need.

