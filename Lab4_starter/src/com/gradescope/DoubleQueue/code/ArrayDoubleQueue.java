package com.gradescope.DoubleQueue.code;

/**ArrayDoubleQueueContract
 * Array implementation for the Double queue.
 *
 * @invariant: queueMaxSize > 0
 *
 * @corresponds: max_queue_size = queueMaxSize
 *
 */
public class ArrayDoubleQueue <T> implements IDoubleQueue<T>
{
    private T[] queue;
    private int queueMaxSize;


    /**ArrayDoubleQueueConstructorContact
     * Constructor for the arrayListDouble queue.
     *
     * @param maxSize max size of the array
     *
     * @pre maxSize > 0
     *
     * @post queueMaxSize = maxSize AND self = new T[queueMaxSize].
     *
     */
    public ArrayDoubleQueue(int maxSize)
    {
        queueMaxSize = maxSize;
        queue = (T[]) new Object[queueMaxSize];
    }

    /**enqueueContract
     * Enqueue adds an item to the queue.
     *
     * @param val the type to be added
     *
     * @pre |self| < queueMaxSize
     *
     * @post [self = #self with val added to left-most unoccupied index] AND queueMaxSize = #queueMaxSize
     *
     */
    @Override
    public void enqueue(T val)
    {
        int back = length();
        queue[back] = val;
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public T dequeue()
    {
        T temp= queue[0];
        for (int i = 0; i < queueMaxSize - 1; i++) {
            queue[i] = queue[i+1];
        }
        queue[queueMaxSize - 1] = null;
        return temp;
    }

    @Override
    public int length()
    {
        int count = 0;
        while (queue[count] != null) {
            count++;
        }
        return count;
    }

    public String toString()
    {
        String ret = "";
        for (int i = 0; i < queueMaxSize; i++) {
            ret += ("[" + queue[i] + "] ");
        }
        return ret;
    }

    //-----------------Ignore the functions below this line-----------------------
    public int getQueueMaxSize()
    {
        return this.queueMaxSize;
    }

    public T[] getQueue()
    {
        return this.queue;
    }
}
