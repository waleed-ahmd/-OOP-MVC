/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.cw2r2223.stock.operations.delete;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import oop.cw2r2223.stock.model.Record;
import oop.cw2r2223.stock.model.Record.Department;

/**
 *
 * @author childm
 */
public class DeleteUI extends JPanel {

    private final JTextField idField = new JTextField(8);

    public DeleteUI() {
        add(new JLabel("Delete record"));
        add(this.idField);
    }

    public int getId() {
        return Integer.parseInt( this.idField.getText());
    }
    
}
