package algorithms.dataStructures.que;

public class Que {

    private int maxSize; // initialize container with set number of slots
    private long[] queueArray; // slots to maintain data
    private int front; //front of que
    private int rear; // rear of que
    private int nItems; // counter to maintain number of items in the que.

    public Que(int size) {
        this.maxSize = size;
        this.queueArray = new long[size];
        front = 0; // index position of first slot of array
        rear = -1; // no item in array yet
        nItems = 0;
    }

    public void insert(long j) { // insert elements into the end of the que (like a line, new people go to the back)

        if (rear == maxSize -1) {
            rear = -1;
        }
        rear++;
        queueArray[rear] = j;
        nItems++;
    }

    public long remove() {// remove item from front of que
        long temp = this.queueArray[this.front];
        this.queueArray[this.front] = 0; // Just showing which has been removed.
        this.front = (this.front + 1) % this.queueArray.length;
        if(this.front == this.maxSize){
            this.front = 0;
        }
        this.nItems--;
        return temp;
    }

    public long peakFront() {
        return queueArray[front];
    }

    public void view() {
        for(int i = 0; i < queueArray.length; i++) {
            System.out.println(queueArray[i]);
        }
    }

}
