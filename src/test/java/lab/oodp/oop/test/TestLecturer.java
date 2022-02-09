package lab.oodp.oop.test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import lab.oodp.challenge3.Lecturer;
import lab.oodp.challenge3.LecturerProgram;

public class TestLecturer {
	LecturerProgram rm;
	
	@Before
	public void setUp() {
		rm = new LecturerProgram();
		lecturers = rm.createLecturersArray();
	}
	
	private ByteArrayOutputStream outContent;
	Lecturer[] lecturers;

    @Before
    public void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
	
	@Test
	public void testprintLecturers() {
		rm.printLecturers(lecturers);
		
		 assertEquals("Current Lecturers\n"
		 		+ "-----------------\n"
		 		+ "1.  id:86302 Sad Sack is teaching 2 papers.\n"
		 		+ "2.  id:49123 Ali Katt is teaching 2 papers.\n"
		 		+ "3.  id:40879 Earl Lee Riser is teaching 3 papers.\n"
		 		+ "4.  id:50876 Candy Kane is teaching 4 papers.\n"
		 		+ "5.  id:30869 Tom Katt is teaching 0 papers.\n"
		 		+ "6.  id:30987 Carrie Oakey is teaching 2 papers.",outContent.toString().trim());
	}
	
	@Test
	public void testprintOnLeaveList() {
		rm.printOnLeaveList(lecturers);
		 assertEquals("Lecturers Currently on Leave\n"
		 		+ "----------------------------\n"
		 		+ "Earl Lee Riser\n"
		 		+ "Carrie Oakey",outContent.toString().trim());
	}
	
	@Test
	public void testprintLecturerWithMostPapers() {
		rm.printLecturerWithMostPapers(rm.getLecturerWithMostPapers(lecturers));
		assertEquals("Most papers\n"
				+ "-----------\n"
				+ "Candy Kane teaches more papers than any other lecturer.",outContent.toString().trim());
	}
	
}
