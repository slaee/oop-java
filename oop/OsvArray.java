package oop;

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

    public static void create(int array[], int n){
        array = new int[n];
        for(int val : array)
            System.out.println(val);
    }

    public static void unique(int array[], int input[]){
        //your code

        int i = 0;
        for(int val: input){
            int count = 0;
            for(int val2 : array){
                if(val == val2)
                    count++;
            }
            
            if(count == 0){
                array[i] = val;
                if(i < 4)
                    i++;
            }
        }
        for(int val : array)
            System.out.println(val);
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