public class MyArrayList {
    private int[] elements;
    private int size;
    public final int CAPACITY = 10;
    public MyArrayList() {
    elements = new int[CAPACITY];
    size = 0;    
    }
    public void AddStart(int elementToAdd){
        size++;
    }
    public void AddEnd(int elementToAdd) {
    size++;
    }
    private void EnsureCapacity() {
        if(size == elements.length) {
            
        }
    }
}