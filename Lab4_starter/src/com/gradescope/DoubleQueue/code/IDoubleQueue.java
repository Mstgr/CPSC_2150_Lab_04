package com.gradescope.DoubleQueue.code;

/**IDoubleQueueContract
 *
 *
 *@initialization Ensures: the queue is initialized and empty
 *
 *@defines: maxListSize: Z
 *          queueMaxSize: Z
 *
 *@constraints: maxSize > 0
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
     *@post [remove first value of the queue]
     *@post degueue = [value that was removed]
     *@psot queueSize -= 1 AND max_queue_size = #max_queue_size
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
     *@post queueSize = #queueSize AND max_queue_size = #max_queue_size
     */
    public int length();

    /**toStringContract
     *
     *
     *@return a string version of the queue with the first value of the string = the first value in the queue
     *
     *@pre None
     *
     *@post toString = [string representing the values in queue]
     *@post max_queue_size = #max_queue_size AND queueSize = #queueSize
     */
    public String toString();
}