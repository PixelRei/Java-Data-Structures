public class Stack{
    private int index;
    private int max_dimension;
    private static final int max_default = 7;
    private int[] array;

    public Stack(int max_dimension){
        index = 0;
        this.max_dimension = max_dimension;
        array = new int[max_dimension];
    }
    public Stack(){
        index = 0;
        max_dimension = max_default;
        array = new int[max_dimension];
    }
    //methods of the stack
    public boolean IsFull(){
        return index == max_dimension;
    }
    public boolean IsEmpty(){
        return index == 0;
    }
    public void Clear(){
        index = 0;
    }
    public boolean Push(int value){
        if(IsFull()){
            return false;
        }
        array[index++] = value;
        return true;
    }
    public int Pop(){
        if(IsEmpty()){
            return 0;
        }
        return array[--index];
    }
    public int TopElem(){
        if(IsEmpty()){
            return 0;
        }
        return array[index-1];
    }

}