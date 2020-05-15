/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numbers;

/**
 *
 * @author Student
 */
public class IntegerNumber {
    private int value;
    private Formatter fi;

    public IntegerNumber(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "IntegerNumber { " + "value=" + value + ", fi=" + fi.format(value) + " }.";
    }
    
    public void show(){
        System.out.println(toString());
    }

    public void setFi(Formatter fi) {
        this.fi = fi;
    }

}
