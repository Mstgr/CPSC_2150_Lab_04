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
public interface IDoubleQueue <T>
{

    //This function's contracts are in the individual classes
    public void enqueue(T val);

    /**dequeueContract
     * Dequeue removes an item from the queue.
     *
     *@return the first value in queue (value that is removed)
     *
     *@pre maxListSize > 0 AND queueMaxSize > 0
     *
     *@post [remove first value of the queue]
     *@post dequeue = [value that was removed]
     *@post [queue size decreased by one] AND maxListSize = #maxListSize AND queueMaxSize = #queueMaxSize
     */
    public T dequeue();

    /**lengthContract
     *
     *
     *@return the size of the queue
     *
     *@pre None
     *
     *@post length = [size of the queue/list]
     *@post maxListSize = #maxListSize AND queueMaxSize = #queueMaxSize
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
     *@post maxListSize = #maxListSize AND queueMaxSize = #queueMaxSize
     */
    public String toString();

    /** peek() Contract
     *
     * @return the left-most item in the queue
     *
     * @pre length() > 0
     *
     * @post peek = [left-most item in queue] AND maxListSize = #maxListSize AND queueMaxSize = #queueMaxSize
     */
    default T peek(){
        T first = dequeue();
        enqueue(first);

        for (int i = 1; i < length(); i++){
            T item = dequeue();
            enqueue(item);
        }
        return first;
    }
}