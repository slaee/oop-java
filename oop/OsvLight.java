package osvclass;

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
