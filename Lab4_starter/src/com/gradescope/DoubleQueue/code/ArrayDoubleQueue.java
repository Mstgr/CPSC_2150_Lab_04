package com.gradescope.DoubleQueue.code;

/**ArrayDoubleQueueContract
 * Array implementation for the Double queue.
 *
 * @invariant: queueMaxSize > 0
 *
 * @corresponds: max_queue_size = queueMaxSize
 *
 */
public class ArrayDoubleQueue implements IDoubleQueue
{
    private Double[] queue;
    private int queueMaxSize;

    // introduce two new variables
    // need to mention these in contracts
    private int front = 0;
    private int back = 0;


    /**ArrayDoubleQueueConstructorContact
     * Constructor for the arrayListDouble queue.
     *
     * @param maxSize max size of the array
     *
     * @pre maxSize > 0
     *
     * @post queueMaxSize = maxSize AND self = new Double[queueMaxSize].
     *
     */
    public ArrayDoubleQueue(int maxSize)
    {
        queueMaxSize = maxSize;
        queue = new Double[queueMaxSize];

        for (int i = 0; i < queueMaxSize; i++) {
            queue[i] = 0.0;
            System.out.println(queue[i]);
        }
    }

    /**enqueueContact
     * Enqueue adds an item to the queue.
     *
     * @param val the Double to be added
     *
     * @pre |self| < queueMaxSize
     *
     * @post [self = #self with val added to left-most unoccupied index] AND queueMaxSize = #queueMaxSize
     *
     */
    @Override
    public void enqueue(Double val)
    {
        queue[back] = val;
        back++;
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public Double dequeue()
    {
        double temp = queue[front];
        queue[front] = 0.0;
        front++;
        queueMaxSize--;
        return temp;
    }

    @Override
    public int length()
    {
        int count = 0;
        for (int i = 0; i < queueMaxSize; i++){
            if (queue[i] != 0.0){
                count += 1;
            }
        }
        return count;
    }

    public String toString()
    {
        String ret = "";
        for (int i = 0; i < queueMaxSize; i++){
            if (queue[i] != 0){
                ret += ("[" + queue[i] + "] ");
            }
        }
        return ret;
    }

    //-----------------Ignore the functions below this line-----------------------
    public int getQueueMaxSize()
    {
        return this.queueMaxSize;
    }

    public Double[] getQueue()
    {
        return this.queue;
    }
}
