import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class CohortTest {

    @Test
    public void testAddStudent() {
        Cohort cohort = new Cohort();
        cohort.addStudent(new Student(7, "Jim Johnly"));
        assertEquals(2, cohort.getStudents().size());
        Student stud = new Student(1, "Stud Body");
        cohort.addStudent(stud);
        assertEquals(stud, cohort.getStudents().get(2));
    }

    @Test
    public void testGetStudents() {
        Cohort cohort = new Cohort();
        cohort.addStudent(new Student(7, "Jim Johnly"));
        cohort.addStudent(new Student(7, "Jim Johnly"));
        cohort.addStudent(new Student(7, "Jim Johnly"));
        assertEquals(3, cohort.getStudents().size());
        assertEquals("Jim Johnly", cohort.getStudents().get(0).getName());
    }


}
