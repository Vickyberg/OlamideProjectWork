package CustomizedListTest;

import CustomizedList.ArrayList;
import CustomizedList.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
    List<S> list;
    @BeforeEach
    void setUp() {
        list = new ArrayList();
    }
    @Test
    void isEmptyTest(){
        assertTrue(list.isEmpty());
    }
    @Test
    void addItemTest(){
        list.add("Rice");
        assertFalse(list.isEmpty());
    }
}
