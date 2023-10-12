package com.gradescope.DoubleQueue.code;

import java.util.ArrayList;

/**ListDoubleQueueContract
 *ArrayList implementation for the Double queue.
 *
 * @invariant: maxListSize > 0
 *
 * @corresponds: maxListSize = queueMaxSize
 *
 */
public class ListDoubleQueue<T> implements IDoubleQueue<T>
{
    private ArrayList<T> LQueue;
    private int maxListSize;

    /**ListDoubleQueueConstructorContact
     *
     *
     * @param maxSize Maximum size of the DoubleQueue
     *
     * @pre maxSize > 0
     *
     * @post maxListSize = maxSize AND [initializes LQueue]
     *
     */
    public ListDoubleQueue(int maxSize)
    {
        this.LQueue = new ArrayList<T>();
        this.maxListSize = maxSize;
    }

    /**enqueueContact
     * Override the enqueue function
     *
     * @param val value that will be added to the queue
     *
     * @pre None
     *
     * @post  [val is set or added to LQueue] AND maxListSize = #maxListSize
     *
     */
    @Override
    public void enqueue(T val)
    {
        if(LQueue.size() == this.maxListSize)
            LQueue.set(this.maxListSize - 1, val);
        else
            LQueue.add(val);
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public T dequeue()
    {
        return LQueue.remove(0);
    }


    @Override
    public int length()
    {
        return LQueue.size();
    }


    public String toString()
    {
        String ret = "";
        for(T d : LQueue)
        {
            ret += ("[" + d + "] ");
        }
        return ret;
    }

}
