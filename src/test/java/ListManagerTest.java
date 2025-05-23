import com.gevernova.ListManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {
    List<Integer> list;
    @BeforeEach
    void setUp(){
        list = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        ListManager.addElement(list, 10);
        assertTrue(list.contains(10));
    }

    @Test
    void testRemoveElement() {
        list.add(20);
        ListManager.removeElement(list, 20);
        assertFalse(list.contains(20));
    }

    @Test
    void testGetSize() {
        ListManager.addElement(list, 1);
        ListManager.addElement(list, 2);
        assertEquals(2, ListManager.getSize(list));
        ListManager.removeElement(list, 1);
        assertEquals(1, ListManager.getSize(list));
    }
}

