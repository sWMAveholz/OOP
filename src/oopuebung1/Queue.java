package oopuebung1;

public class Queue {
    private int numContacts;
    private Contact head;
    private Contact tail;

    public void Queue(){
        head = null;
        tail = null;
        this.numContacts = 0;
    }

    public void enqueue(Contact c){
        c.setNext(null);
        if (head != null){
            tail.setNext(c);
        }
        else {head = c;}

        tail = c;
        numContacts++;

    }

    public Contact dequeue(){
        if (numContacts >0){
            Contact c = head;
            head = head.getNext();
            numContacts--;
            if (numContacts ==0){
                tail = null;
            }
            return c;
        }
        return null;
    }

    public int getNumContacts(){
        return numContacts;
    }

    public Contact getTail(){
        return tail;
    }

    public Contact getHead(){
        return head;
    }



}
