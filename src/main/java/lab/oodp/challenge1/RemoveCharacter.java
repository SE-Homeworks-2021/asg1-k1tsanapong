package lab.oodp.challenge1;

import lab.oodp.Keyboard;

/**
 * Write a program that prompts the user to enter a sentence, then prints out the sentence with a random character
 * missing. The program is to be written so that each task is in a separate method. See the comments below for the
 * different methods you have to write.
 */
public class RemoveCharacter {
	
	public String sentence;

    private void start() {

        sentence = getSentenceFromUser();
        int randomPosition = getRandomPosition(sentence);
        printCharacterToBeRemoved(sentence, randomPosition);
        String changedSentence = removeCharacter(sentence, randomPosition);
        printNewSentence(changedSentence);
    }

    /**
     * TODO: Gets a sentence from the user.
     * @return
     */
    public String getSentenceFromUser() {
        return "";
    }

    /**
     * TODO: Gets an int corresponding to a random position in the sentence.
     */
    public int getRandomPosition(String sentence) {
    	
        return 0;
    }

    /**
     * TODO: Prints a message stating the character to be removed, and its position.
     */
    public void printCharacterToBeRemoved(String sentence, int position) {

       

    }

    /**
     * TODO: Removes a character from the given sentence, and returns the new sentence.
     */
    public String removeCharacter(String sentence, int position) {

        return "";

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
