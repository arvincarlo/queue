public class ArrayQueueApp {
  public static void main(String[] args) {
    ArrayQueue arayku = new ArrayQueue(10);
    System.out.println("QSIZE: " + arayku.QSIZE);    
      arayku.enqueue(1);
      arayku.enqueue(2);
      arayku.enqueue(3);
      arayku.enqueue(4);
      arayku.enqueue(5);
      arayku.enqueue(6);
      arayku.enqueue(7);
      arayku.enqueue(8);
      arayku.enqueue(9);
      arayku.enqueue(10);
      arayku.enqueue(11); // error, QSIZE isFull
    System.out.println();
    System.out.println("************************");
      arayku.showQueue();
    System.out.println();
    System.out.println("************************");
    System.out.println(arayku.dequeue());
    System.out.println(arayku.dequeue());
    System.out.println(arayku.dequeue());
      arayku.enqueue(11); // will be enqueued
    System.out.println();
    System.out.println("************************");
      arayku.showQueue();
    System.out.println();
    System.out.println("Queue Front: " + arayku.peekFront());
    System.out.println("Queue Rear: " + arayku.peekRear());
  }
}