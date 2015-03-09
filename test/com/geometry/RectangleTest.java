package com.geometry;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by saylik on 3/6/2015.
 */
public class RectangleTest {
    @Test
    public void testRectangle_001 () {
        Rectangle rect = new Rectangle(5.0,2.0);
        double area = rect.getArea();
        assertEquals(10.0,area,0.01);
//        assertEquals(rect.length, 5.0, 0.0);
//        assertEquals(rect.breadth, 2.0, 0.0);
    }

    @Test
    public void testRectangle_002 () {
        Rectangle rect = new Rectangle(3.0,2.0);
        double area = rect.getArea();
        assertEquals(6.0,area,0.01);
//        assertEquals(rect.length, 3.0, 0.0);
//        assertEquals(rect.breadth, 2.0, 0.0);
    }

    @Test
    public void perimeter_should_give_10 (){
        Rectangle rect =  new Rectangle(3.0, 2.0);
        double perimeter = rect.getPerimeter();
        assertEquals(10.0, perimeter, 0.0);
    }

    @Test
    public void perimeter_should_give_12 (){
        Rectangle rect =  new Rectangle(4.0, 2.0);
        double perimeter = rect.getPerimeter();
        assertEquals(12.0, perimeter, 0.0);
    }

    @Test
    public void area_of_square_should_give_25_for_length_5() {
        Square square = new Square(5);
        double area = square.getArea();
        assertEquals(25.0, area, 0.1);
    }

    @Test
    public void area_of_square_should_give_16_for_length_4() {
        Square square = new Square(4);
        double area = square.getArea();
        assertEquals(16.0, area, 0.0);
    }

    @Test
    public void perimeter_of_square_should_give_16_for_length_4() {
        Square square = new Square(4);
        double perimeter = square.getPerimeter();
        assertEquals(16.0, perimeter, 0.0);
    }

}
