package com.gradescope.DoubleQueue.code;

/**IDoubleQueueContract
 *
 *
 *@initialization Ensures: the queue is initialized and empty
 *
 *@defines: queueSize holds the size and max_queue_size holds the max size
 *
 *@constraints: queueSize is greater than or equal to 0 and queueSize is less than max size
 *
 */
public interface IDoubleQueue
{

    //This function's contracts are in the individual classes
    public void enqueue(Double val);

    /**dequeueContract
     * Dequeue removes an item from the queue.
     *
     *@return the first value in queue (value that is removed)
     *
     *@pre queueSize > 0
     *
     *@post
     * [remove first value of the queue]
     * degueue = [value that was removed]
     * queueSize -= 1
     * max_queue_size = #max_queue_size
     */
    public Double dequeue();

    /**lengthContract
     *
     *
     *@return the size of the queue
     *
     *@pre None
     *
     *@post length = queueSize
     * queueSize = #queueSize AND max_queue_size = #max_queue_size
     */
    public int length();

    /**toStringContract
     *
     *
     *@return a string version of the queue with the first value of the string = the first value in the queue
     *
     *@pre None
     *
     *@post
     * toString = [string representing the values in queue]
     * max_queue_size = #max_queue_size AND queueSize = #queueSize
     */
    public String toString();
}