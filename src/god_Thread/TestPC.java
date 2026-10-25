package god_Thread;

/**
 * Monitor (管程) implementation for producer-consumer problem
 * Encapsulates all shared state and synchronization logic to guarantee thread safety
 */
class MonitorBuffer {
    // Underlying storage for the bounded circular buffer
    private final int[] buffer;
    // Maximum capacity of the buffer
    private final int capacity;
    // Index where next producer will write data
    private int in = 0;
    // Index where next consumer will read data
    private int out = 0;
    // Current count of items stored in the buffer
    private int count = 0;

    /**
     * Constructor to create monitor with specified buffer size
     * @param capacity maximum number of items the buffer can hold
     */
    public MonitorBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
    }

    /**
     * Called by producer threads to add an item to the buffer
     * Automatically blocks when buffer is full
     * @param item the product item to add
     * @throws InterruptedException if thread is interrupted while waiting
     */
    public synchronized void produce(int item) throws InterruptedException {
        // Wait condition: block until buffer has free space
        // Use while loop instead of if to handle spurious wakeups correctly
        while (count == capacity) {
            wait();
        }
        // Write item to current producer position in circular buffer
        buffer[in] = item;
        // Move producer pointer forward, wrap around when reaching end
        in = (in + 1) % capacity;
        // Increment active item count
        count++;
        System.out.println(Thread.currentThread().getName() + " produced: " + item + " | buffer: " + count + "/" + capacity);
        // Notify all waiting threads that buffer state has changed
        notifyAll();
    }

    /**
     * Called by consumer threads to retrieve an item from the buffer
     * Automatically blocks when buffer is empty
     * @return the consumed product item
     * @throws InterruptedException if thread is interrupted while waiting
     */
    public synchronized int consume() throws InterruptedException {
        // Wait condition: block until buffer has available items
        while (count == 0) {
            wait();
        }
        // Read item from current consumer position
        int item = buffer[out];
        // Move consumer pointer forward, wrap around when reaching end
        out = (out + 1) % capacity;
        // Decrement active item count
        count--;
        System.out.println(Thread.currentThread().getName() + " consumed: " + item + " | buffer: " + count + "/" + capacity);
        // Notify all waiting threads that buffer state has changed
        notifyAll();
        return item;
    }
}

/**
 * Producer thread worker class
 * Runs in separate thread to generate products and add to shared buffer
 */
class Producer implements Runnable {
    private final MonitorBuffer buffer;

    public Producer(MonitorBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        // Produce 15 items total
        for (int i = 0; i < 15; i++) {
            try {
                buffer.produce(i);
                // Random delay to simulate production time
                Thread.sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

/**
 * Consumer thread worker class
 * Runs in separate thread to consume products from shared buffer
 */
class Consumer implements Runnable {
    private final MonitorBuffer buffer;

    public Consumer(MonitorBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        // Consume 15 items total
        for (int i = 0; i < 15; i++) {
            try {
                buffer.consume();
                // Random delay to simulate consumption time
                Thread.sleep((int)(Math.random() * 200));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

/**
 * Main test class to run the producer-consumer demo
 */
public class TestPC {
    public static void main(String[] args) {
        // Create shared monitor with buffer size of 5
        MonitorBuffer sharedBuffer = new MonitorBuffer(5);

        // Start 2 producer threads and 2 consumer threads
        new Thread(new Producer(sharedBuffer), "Producer-1").start();
        new Thread(new Producer(sharedBuffer), "Producer-2").start();
        new Thread(new Consumer(sharedBuffer), "Consumer-1").start();
        new Thread(new Consumer(sharedBuffer), "Consumer-2").start();
    }
}
