package lab.oodp.challenge1;

import lab.oodp.Keyboard;

import java.util.Random;

/**
 * Write a program that prompts the user to enter a sentence, then prints out the sentence with a random character
 * missing. The program is to be written so that each task is in a separate method. See the comments below for the
 * different methods you have to write.
 */
public class RemoveCharacter {
	
	public String sentence;
    private int random_position;

    private void start() {

        sentence = getSentenceFromUser();
        int randomPosition = getRandomPosition(sentence);
        printCharacterToBeRemoved(sentence, randomPosition);
        String changedSentence = removeCharacter(sentence, randomPosition);
        printNewSentence(changedSentence);
    }

    /**z
     * TODO: Gets a sentence from the user.
     * @return
     */
    public String getSentenceFromUser()
    {
        System.out.print("Enter a sentence: ");
        String sentence = Keyboard.readInput();
        return sentence ;
    }

    /**
     * TODO: Gets an int corresponding to a random position in the sentence.
     */
    public int getRandomPosition(String sentence) {

        Random random = new Random();

        int length = sentence.length();

        random_position = random.nextInt(length);

        return random_position;
    }

    /**
     * TODO: Prints a message stating the character to be removed, and its position.
     */
    public void printCharacterToBeRemoved(String sentence, int position) {

        System.out.println("Removing \""+sentence.charAt(random_position)+"\" from position "+random_position);


       

    }

    /**
     * TODO: Removes a character from the given sentence, and returns the new sentence.
     */
    public String removeCharacter(String sentence, int position) {

        String str = "";

        for(int i = 0; i < sentence.length(); i++)
        {
            if(i == position)
            {
                continue;
            }

            str += sentence.charAt(i);

        }

        return str;

    }

    /**
     * Prints a message which shows the new sentence after the removal has occured.
     */
    public void printNewSentence(String changedSentence) {

        System.out.println("New sentence is: " + changedSentence);
    }

    public static void main(String[] args) {
        RemoveCharacter ex = new RemoveCharacter();
        ex.start();
    }
}
