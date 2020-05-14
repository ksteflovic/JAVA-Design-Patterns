/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nv_builder_form;

/**
 *
 * @author KI
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Form form = new Form.FormBuilder("Dave", "Carter", "DavCarter", "DAvCaEr123").passwordHint("MyName").city("NY").language("English").build();
        System.out.println(form);
    }
    
}
