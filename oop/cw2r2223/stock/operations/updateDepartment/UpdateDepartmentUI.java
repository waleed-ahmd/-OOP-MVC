package oop.cw2r2223.stock.operations.updateDepartment;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UpdateDepartmentUI extends JPanel {

    private final JTextField productIdField = new JTextField(8);
    private final JTextField departmentField = new JTextField(8);

    public UpdateDepartmentUI() {
        add(new JLabel("Product ID:"));
        add(this.productIdField);
        add(new JLabel("Department:"));
        add(this.departmentField);
    }

    public String[] getIdAndDepartment() {
        int productId = Integer.parseInt(this.productIdField.getText());
        String department = this.departmentField.getText();
        return new String[]{String.valueOf(productId), department};
    }

}
