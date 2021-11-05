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

public class OsvLight {

    private int binaryVal;
    public OsvLight(){
        this.binaryVal = 0;
    }

    public void on(){
        this.binaryVal = 1;
    }

    public void off(){
        this.binaryVal = 0;
    }

    public void status(){
        System.out.print(this.binaryVal);
    }
}
