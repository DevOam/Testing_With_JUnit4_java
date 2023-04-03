package tp1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentListTest {
    StudentList list = null;
    @Before
    public void setUp() throws Exception{
        list = new StudentList();
    }
    @After
    public void tearDown () throws Exception{
        System.out.println("After");
    }
    @Test
    public void testAdd() {
        list.add("Ali");
        list.add("Amal");
        list.add("Kamal");
        list.add("Amine");
        assertEquals("Ajout de 4 étudiants à la liste", 4, list.sizeOfStudent());
    }
    @Test
    public void testRemove() {
        list.add("Fatima");
        list.add("Amine");
        list.remove("Amine");
        assertEquals("Suppression d'un étudiant de la liste", 1, list.sizeOfStudent());
    }
    @Test
    public void removeAll() {
        list.removeAll();
    }
}
