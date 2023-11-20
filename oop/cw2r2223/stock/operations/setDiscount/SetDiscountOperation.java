package oop.cw2r2223.stock.operations.setDiscount;
import oop.cw2r2223.stock.model.Record.Department;
import javax.swing.JOptionPane;

import javax.swing.JComponent;

import oop.cw2r2223.stock.operations.AbstractOperation;
import oop.cw2r2223.stock.model.Model;
import oop.cw2r2223.stock.view.View;

public class SetDiscountOperation extends AbstractOperation {

    private final SetDiscountUI ui = new SetDiscountUI();

    public SetDiscountOperation() {
        super("Set Discount", "Apply a discount to all products in a department");
    }

    @Override
    public JComponent settingsUI(View view) {
        return this.ui;
    }

  
    @Override
    
public void execute(Model model) {
    int discount = ui.getDiscount();
    Department department = ui.getDepartment();
    model.applyDiscount(department, discount);
}



}
