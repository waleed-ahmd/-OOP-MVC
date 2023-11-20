/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.cw2r2223.stock.operations.add;

import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import oop.cw2r2223.stock.model.Record;

/**
 *
 * @author childm
 */
public class AddUI extends JPanel {

    private final JTextField nameField = new JTextField(16);
    private final JComboBox<Record.Department> department = new JComboBox<>( Record.Department.values());
    private final JTextField priceField = new JTextField(16);

    public AddUI() {
        super( new GridLayout( 4, 2));
        add(new JLabel("Name"));
        add(this.nameField);
        add(new JLabel("Dept"));
        add(this.department);
        add(new JLabel("Price"));
        add(this.priceField);
   }

    public String getName() {
        return this.nameField.getText();
    }
    
    public Record.Department getDepartment() {
        return (Record.Department) this.department.getSelectedItem();
    }
    
    public double getPrice() {
        return Double.parseDouble( this.priceField.getText());
    }
}
