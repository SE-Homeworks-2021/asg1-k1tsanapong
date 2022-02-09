Assignment 1
==========

Before you start
----------
The purpose of assignment lab is to practice Java programming and basic object oriented programming. Please start this assignment by cloning this project you have previously done with the labs. Look for TODO comment in the source code that hints where the code should be added/modified.

Challenge One - Removing a character 
------------------------ 
The skeleton of this program is in lab.oodp.challenge1.RemoveCharacter. Write a program that prompts the user to enter a sentence, then prints out the sentence with
a random character missing. The program is to be written so that each task is in a separate
method.

Here is an example of how your program should behave:

```
Enter a sentence: ​ Have a nice day!
Removing "v" from position 2
New sentence is: Hae a nice day!
```
You need to complete the methods for the following tasks:
1. Printing the prompt and reading the input from the user: ​ *getSentenceFromUser()* using Keyboard class.
2. Generating an appropriate random number: ​ *getRandomPosition(String sentence)* using Math.random method (find more info about this method [here](https://www.freecodecamp.org/news/generate-random-numbers-java/)) to get the random integer number between 0 to sentence's length-1.
3. Printing the character that is going to be removed: *printCharacterToBeRemoved(String sentence, int randomPosition)*
4. Remove a character at given position from the sentence and return the sentence without that character: get *removeCharacter(String sentence, int position)*

Here is an example of using these methods so that the program behaves according to the previous example:

```java
String​ sentence ​ = ​ getSentenceFromUser​();
int​ randomPosition ​ = ​ getRandomPosition(sentence​);
printCharacterToBeRemoved​(sentence​, randomPosition​);
String​ changedSentence ​= ​removeCharacter​(sentence​, ​randomPosition​);
printNewSentence​(​changedSentence​);
```

Please run this program to test and use *TestRemoveCharacter* in src/test to test this program.

Challenge Two - Guessing game using a while loop
------------------------
The sekeleton of this challege is in *lab.oodp.challenge3 package*. Write a program so that the user can play the game of guessing a number between 1 and 100. Use the following sequence to write the code:
1. Generate a random number between 1 and 100 and store in a variable named ​ goal
2. Declare a variable named ​ guess
3. Initialise ​ guess ​ to 0
4. While the user’s guess is not correct (i.e. ​ while guess != goal​ ):
- Ask the user to enter their guess
- Store the guess in the ​ guess ​ variable
- If the ​ guess ​ is greater than the ​ goal​ , print “Too high, try again”
- Else if the ​ guess ​ is less than the ​ goal​ , print “Too low, try again”
- Else print the message “Perfect!!”
- Print “Goodbye”
	
Here is an example of the output of the game:

```
Enter your guess (1 – 100): ​ 50
Too low, try again
Enter your guess (1 – 100): ​ 75
Too high, try again
Enter your guess (1 – 100): 70
Perfect!
Goodbye
```



Challenge Three - Lecturer Class
-----------------------------
The skeleton code is found in the *lab.oodp.challenge3* ​ package.

Complete the ​ Lecturer class and uncomment marked lines in ​ *LecturerProgram.java* so that when ​ LecturerProgram ​ is run, it produces the output as per the console shown below.

You need to write the following methods:
- The ​ Lecturer()​ constructor
-  The ​ getName()​ and ​ setName()​ methods
-  The ​ getStaffId()​ and ​ setStaffId()​ methods
- The ​ getPapers() ​ and ​ setPapers()​ methods
- The​ isOnLeave() ​ and setOnLeave()​ methods
- The ​ teachesMorePapersThan()​ method
- The ​ toString()​ method

```
Current Lecturers
-----------------
1.  id:86302 Sad Sack is teaching 2 papers.
2.  id:49123 Ali Katt is teaching 2 papers.
3.  id:40879 Earl Lee Riser is teaching 3 papers.
4.  id:50876 Candy Kane is teaching 4 papers.
5.  id:30869 Tom Katt is teaching 0 papers.
6.  id:30987 Carrie Oakey is teaching 2 papers.

Lecturers Currently on Leave
----------------------------
Earl Lee Riser
Carrie Oakey

Updated details for changed lecturer number 2
---------------------------------------------
Name: Crystal Ball
Id: 23456
Papers: CompSci101 CompSci105 
Currently on leave

Most papers
-----------
Candy Kane teaches more papers than any other lecturer.
```

**Note:**
1. You will need to check the ​ printLecturers() method in the ​ LecturerProgram ​ class to see what needs to be done in your ​ toString()​ method.
2. You can use TestLecturer.java to test this program.


Submit this assignment
------------------
You can submit this assignment by simply pushing the code to the Github. Please make sure that *TestRemoveCharacter* and *TestLecturer* pass.
