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
public class DecimalFormatter implements Formatter{
    @Override
    public String format(int x) {
        return Integer.toString(x);
    }
}
