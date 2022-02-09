package lab.oodp.oop.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import lab.oodp.challenge1.RemoveCharacter;

public class TestRemoveCharacter {
	RemoveCharacter rm;
	
	@Before
	public void setUp() {
		rm = new RemoveCharacter();
	}
	
	@Test
	public void test() {
		rm.sentence = "Hello Test Java Runtime";
		int randompos = rm.getRandomPosition(rm.sentence);
		String newSentence = rm.removeCharacter(rm.sentence, randompos);
		assertEquals(rm.sentence.length()-1, newSentence.length());
		assertNotEquals(rm.sentence.charAt(randompos), newSentence.charAt(randompos));
	}

}
