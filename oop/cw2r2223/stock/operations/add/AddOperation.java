/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.cw2r2223.stock.operations.add;

import javax.swing.JComponent;

import oop.cw2r2223.stock.operations.AbstractOperation;
import oop.cw2r2223.stock.model.Model;
import oop.cw2r2223.stock.model.Record.Department;
import oop.cw2r2223.stock.view.View;

/**
 *
 * @author childm
 */
public class AddOperation extends AbstractOperation {

    private final AddUI ui = new AddUI();
    
    public AddOperation() {
        super("Add", "Add a record");
    }

    @Override
    public JComponent settingsUI(View view) {
        return this.ui;
    }

    @Override
    public void execute(Model model) {
        String name = this.ui.getName();
        Department department = this.ui.getDepartment();
        double price = this.ui.getPrice();
        model.add(name, department, price);
    }

}
