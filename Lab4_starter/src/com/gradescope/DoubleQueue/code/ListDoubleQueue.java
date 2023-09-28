package com.gradescope.DoubleQueue.code;

import java.util.ArrayList;

/**ListDoubleQueueContract
 *
 *
 * @invariant: maxListSize > 0
 *
 * @corresponds: maxListSize = queueMaxSize
 *
 */
public class ListDoubleQueue implements IDoubleQueue
{
    private ArrayList<Double> LQueue;
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
        this.LQueue = new ArrayList<Double>();
        this.maxListSize = maxSize;
    }

    /**enqueueContact
     * Override the enqueue function
     *
     * @param val value that will be added to the queue
     *
     * @pre None (for now)
     *
     * @post  AND maxSize = #maxListSize
     *
     */
    @Override
    public void enqueue(Double val)
    {
        if(LQueue.size() == this.maxListSize)
            LQueue.set(this.maxListSize-1, val);
        else
            LQueue.add(val);
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public Double dequeue()
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
        for(Double d : LQueue)
        {
            ret += ("[" + d + "] ");
        }
        return ret;
    }

}
