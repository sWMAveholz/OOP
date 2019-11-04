package oopuebung1;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShapeTest {

    private static Logger logger =
            Logger.getLogger(ShapeTest.class.getName());

    @Test
    public void testCircleArea() {
        Circle c = new Circle(2.0);
        assertEquals("Area", 12.6, c.getArea(), 0.1);
    }

    @Test
    public void testSquare() {
        // beide Seiten gleich lang
        Square s = new Square(5.0);
        s.setLength(2);
        assertTrue("Equal side length", s.getLength() == s.getWidth());
    }

    @Test
    public void testPolymorphism() {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Shape("red");
        shapes[1] = new Circle(1.0, "green");
        shapes[2] = new Rectangle(1.0, 2.0, "blue");
        shapes[3] = new Square(1.0, "yellow");

        for (Shape s : shapes) {
            logger.info(s.toString());          // alternative to jusing System.out.println(.)
        }
    }

    @Test
    public void testWasGeht(){
        Rectangle o = new Rectangle(1,2);
        Square u = new Square(3);

        o = u;
        //u = o;

        //u = new Rectangle(1,2);

        o = new Square(3);

        Rectangle o1 = u;
        Square u1 = (Square) o1;

        Square u2 = u;
        Rectangle o2 = u2;


    }




}
