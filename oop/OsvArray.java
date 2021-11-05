/**
 * @author: Sly The Great
 * @date: 2019/7/10
 * @description: oop/OsvArray.java
 * @version: 1.0
 * @classname: OsvArray
 * @github: https://github.com/slyg3nius/oop-java.git
 * @csdn: https://blog.csdn.net/sly_g3nius
 */

package oop;

public class OsvArray {
    private int array[];
    private int count;
    /**
     * Constructor
     */
    public OsvArray(){
        array = new int[5];// 5 entries
        count = 0;
    }

    /**
     * Constructor
     * @param size
     */
    public OsvArray(int size){
        array = new int[size];
        count = 0;
    }
    
    /**
     * Adds an element to the array
     * @param element
     * @return
     */
    public void add(int element){
        if(count == array.length){
            //array is full
            int[] temp = new int[array.length * 2];
            for(int i = 0; i < array.length; i++){
                temp[i] = array[i];
            }
            array = temp;

        }
        array[count] = element;
        count++;
    }

    /**
     * Returns the index of the element
     * @param element
     * @return
     */
    public int indexOf(int element){
        for(int i = 0; i < count; i++){
            if(array[i] == element){
                return i;
            }
        }
        return -1;
    }

    /**
     * Removes an element from the array
     * @param index
     * @return
     */
    public void remove(int element){
        int index = indexOf(element);
        if(index == -1){
            System.out.println("Element not found");
        } else {
            for(int i = index; i < count - 1; i++){
                array[i] = array[i + 1];
            }
            count--;
        }
    }

    /**
     * Removes an element from the array
     * O(log n) time complexity
     * @param index
     * @return
     */
    public void remove2(int element){
        int index = indexOf(element);
        if(index == -1){
            System.out.println("Element not found");
        } else {
            array[index] = array[count - 1];
            count--;
        }
    }

    /**
     * Initializes the array
     * @param array
     * @param n
     */
    public static void create(int array[], int n){
        array = new int[n];
        for(int val : array)
            System.out.println(val);
    }

    /**
     * prints the unique elements int the array
     * @param array
     * @param input
     */
    public static void unique(int array[], int input[]){
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
     * Adds an element to the specified index
     * @param index
     * @param element
     */
    public void addAt(int element, int index){
        if(count == array.length){
            //array is full
            int[] temp = new int[array.length * 2];
            for(int i = 0; i < array.length; i++){
                temp[i] = array[i];
            }
        }
        for(int i = count; i > index; i--){
            array[i] = array[i - 1];
        }
        array[index] = element;
        count++;
    }

    /**
     * Removes an element from the specified index
     * @param index
     */
    public void removeAt(int index){
        if(index >= count){
            System.out.println("Index out of bounds");
        } else {
            for(int i = index; i < count - 1; i++){
                array[i] = array[i + 1];
            }
            count--;
        }
    }

    /**
     * Removes all specified elements from the array
     * @param element
     * @return count of removed elements
     */
    public int removeAll(int element){
        int cnt = 0;
        for(int i = 0; i < count; i++){
            if(array[i] == element){
                cnt++;
                removeAt(i);
                i--;
            }
        }
        return cnt;
    }

    /**
     * Reverse the array
     */
    public void reverse(){
        int[] temp = new int[array.length];
        for(int i = 0; i < count; i++){
            temp[i] = array[count - 1 - i];
        }
        array = temp;
    }

    /**
     * Sorts the array
     * using Sleep sort algorithm
     */
    public void sleepSort(){
        int[] temp = new int[count];
        for(int i = 0; i < count; i++){
            temp[i] = array[i];
        }
        for(int i = 0; i < count; i++ ){
            int min = temp[i];
            int minIndex = i;
            for(int j = i + 1; j < count; j++){
                if(temp[j] < min){
                    min = temp[j];
                    minIndex = j;
                }
            }
            int temp2 = temp[i];
            temp[i] = temp[minIndex];
            temp[minIndex] = temp2;
        }
        array = temp;
    }
    
    /**
     * Checks if the array is empty
     * @return true if the array is empty and false otherwise
     */
    public boolean isEmpty(){
        return count == 0;
    }

    public void print(){
        for(int i = 0; i < count; i++){
            System.out.print(array[i]);
            if(i != count - 1){
                System.out.print(", ");
            } 
        }
    }
}