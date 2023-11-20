package oop.cw2r2223.stock.operations.setDiscount;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import oop.cw2r2223.stock.model.Record.Department;

public class SetDiscountUI extends JPanel {

    private final JTextField discountField = new JTextField(8);
    private final JTextField departmentField = new JTextField(8);

    public SetDiscountUI() {
        add(new JLabel("Discount (%):"));
        add(this.discountField);
        add(new JLabel("Department:"));
        add(this.departmentField);
    }

    public int getDiscount() {
        return Integer.parseInt(this.discountField.getText());
    }

    public Department getDepartment() {
        return Department.valueOf(this.departmentField.getText().toUpperCase());
    }

    public boolean showDialog() {
        int result = JOptionPane.showConfirmDialog(null, this, "Set Discount", JOptionPane.OK_CANCEL_OPTION);
        return result == JOptionPane.OK_OPTION;
    }
}
