/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy_Main;

import Numbers.BinaryFormatter;
import Numbers.IntegerNumber;
import Operations.Add;
import Operations.Divide;
import Operations.NumberOperate;

/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*  IntegerNumber n = new IntegerNumber(16);
        n.setFi(new BinaryFormatter());
        n.show();

       */

        NumberOperate n = new NumberOperate(5, 0);
        n.setOperator(new Add());
        n.show();

        n.setOperator(new Divide());
        n.show();
    }
    
}
