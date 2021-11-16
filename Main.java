/**
 * @author: Sly The Great
 * @date: 2019/7/10
 * @description: oop/OsvArray.java
 * @version: 1.0
 * @classname: OsvArray
 * @github: https://github.com/slyg3nius/oop-java.git
 */

import java.util.*;
import oop.*;

class  M {
    int i = 51;
    public M(int j){
        System.out.println(i);
        this.i = j * 10;
    }
}

class N extends M {
    public N(int j){
        super(j);
        System.out.println(i);
        this.i = j * 20;
    }
}

public class Main extends S{
    private static int count = 1;

    public Main(){
        ++count;
    }

    private void display() {
        System.out.println("display2");
    }
    public static void main(String[] args) {
        N n = new N(26);
        System.out.println(n.i);
    }
}   
