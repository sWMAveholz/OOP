package oopuebung1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    private Queue q;
    private Contact c1;
    private Contact c2;
    private Contact c3;

    @Before
    public void setUp(){
        q = new Queue();
        c1 = new Contact("Berger", 31232);
        c2 = new Contact("Huber", 83882);
        c3 = new Contact("Maier", 29399);
    }

    @Test
    public void testCreateQueue(){
        assertNull("Tail",q.getTail());
        assertNull("Head", q.getHead());
        assertEquals("NumContacts", 0, q.getNumContacts());
    }

    @Test
    public void testEnqueue(){
        q.enqueue(c1);
        q.enqueue(c2);
        q.enqueue(c3);

        assertEquals("NumContacts", 3 ,q.getNumContacts());

        assertSame("Tail", c3,q.getTail());
        assertSame("Head",c1,q.getHead());
    }

    @Test
    public void testDequeue(){
        q.enqueue(c1);
        q.enqueue(c2);
        q.enqueue(c3);

        Contact deq = q.dequeue();

        assertSame("Entnommen", c1, deq);
        assertSame("Head",c2,q.getHead());
        assertSame("Tail",c3,q.getTail());
        assertEquals("NumContacts",2,q.getNumContacts());

    }

    @Test
    public void testDequeueLastElement(){
        q.enqueue(c1);

        Contact deq = q.dequeue();

        assertEquals("NumContacts",0,q.getNumContacts());
        assertNull(q.getHead());
        assertNull(q.getTail());
    }

    @Test(timeout = 50)
    public void testPerformance(){
        for (int i = 0; i<1000;i++){
            Contact c = new Contact(""+i,i);
            q.enqueue(c);
        }
    }

    @Test
    public void testContactCounter(){
        int bef = Contact.getCounter();
        Contact c = new Contact("A",111);
        int after = Contact.getCounter();

        assertEquals("ContactCounter",1,after-bef);
    }




}
