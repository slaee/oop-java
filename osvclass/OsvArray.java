package osvclass;

class ArrayList {
    
}

public class OsvArray {

    private int array[];
    private int count;

    public OsvArray(){
        array = new int[5];// 5 entries
        count = 0;
    }

    public void add(int num){
        array[count] = num;
        count++;
    }

    /**
     * Remove the first occurence number in the array
     * 
     * @param num
     */
    public void remove(int num){
        
    }

    public void addAt(int pos){

        count++;
    }

    public void removeAt(int pos){

    }

    public boolean isEmpty(){
        return count == 0;
    }

    public void print(int[] arr){

    }
}