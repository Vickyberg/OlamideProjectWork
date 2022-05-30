package tdd.ChapterEight;

import ChapterEight.Rectangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class RectangleTest {
    Rectangle rectangle;

    @BeforeEach
    public void RectangleTest(){
     rectangle = new Rectangle();
    }
    @Test
    public void RectangleAreaTest(){
        double area = rectangle.calcAreaOfRectangle(2.5,15.0);
        assertEquals(37.5,area);
    }
    @Test
    public  void RectanglePerimeterTest(){
        double perimeter = rectangle.calcPerimeterOfRectangle(2.5,15.0);
        assertEquals(35,perimeter);
    }
    @Test
    void getWidth(){

        rectangle.setWidth(5.0);
        double result = rectangle.getWidth();
        assertEquals(5.0,result);

    }
    @Test
    void TestThatExceptionIsThrownWhenIllegalValuesProvided(){
        assertThrows(IllegalArgumentException.class,()-> {rectangle.setLength(150);});
    }

}
