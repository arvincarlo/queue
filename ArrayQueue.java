public class ArrayQueue {  
  int QSIZE;
  private int[] queue;
  private int nItems;
  public ArrayQueue(int size) {
    this.QSIZE = size;
    this.queue = new int[this.QSIZE];
  }
  public void showQueue() {
    for (int i = 0; i < this.QSIZE; i++) {
      System.out.printf("QUEUE[" + i + "] = " + this.queue[i] + "\n");
    }
  }
  public boolean isFull() {
    if (this.nItems == this.QSIZE) {
      System.out.println("QUEUE is FULL");
      return true;
    } else {
      return false;
    }
  }
  public boolean isEmpty() {
    if (this.nItems == 0) {
      System.out.println("QUEUE is EMPTY");
      return true;
    } else {
      return false;
    }
  }
  public boolean enqueue(int num) {
    System.out.println("Trying to enqueue " + num + "... ");
    if (!this.isFull()) {
      this.queue[nItems] = num;
      System.out.println("\t" + "Added " + num);
      this.nItems++;
      return true;
    } else {
      System.out.println("Failed to enqueue " + num);
      return false;
    }
  }
  public int dequeue() {
    System.out.print("Dequeueing... ");
    if (!this.isEmpty()) {
      int num = this.queue[0];
      System.out.println("\t" + "Removed " + num);
      this.rearrangeQueue();
    } else {
      System.out.println("Failed to dequeue.");
    }
    return 0;
  }
  private void rearrangeQueue() {
    System.out.println("Rearranging Queue");
    int[] temp = new int[this.nItems];
    int i;
    for (i = 0; i < (this.nItems-1); i++) {
      temp[i] = this.queue[i+1];
    }
    this.nItems--;
    if (i <= this.nItems) {
	  this.queue[i] = temp[i];
	} else {
	  this.queue[i] = 0;
	}
  }
  public int peekFront() {
    return this.queue[0];
 } 
  public int peekRear() {
    return this.queue[this.nItems-1];
  }
}