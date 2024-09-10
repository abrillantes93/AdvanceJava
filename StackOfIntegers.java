public class StackOfIntegers
{
    private int[] elements;
    private int size;
    private static final int DEAFULT_CAPACITY = 16;

    public StackOfIntegers(){
        this(DEAFULT_CAPACITY);
    }

    public StackOfIntegers(int capacity)
    {
        elements = new int[capacity];
    }

    public void push(int value)
    {
        if (size >=elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;

            elements[size++] = value;
        }
    }

    // return and remove top element
    public int pop()
    {
        return elements[--size];
    }
    // return top element from stack
    public int peek()
    {
        return elements[size - 1];
    }
    // test if stack is empty
    public boolean empty()
    {
        return size == 0;
    }
    public int getSize()
    {
        return size;
    }
    
}

