package oop.cw2r2223.stock.operations.updateDepartment;
import oop.cw2r2223.stock.model.Record.Department;

import javax.swing.JComponent;

import oop.cw2r2223.stock.model.Model;
import oop.cw2r2223.stock.operations.AbstractOperation;
import oop.cw2r2223.stock.view.View;

/**
 * Operation to update the department of a product.
 * Prompts the user for a product ID and department to set.
 * Sets the department of the product with the given ID to the specified value.
 */
public class UpdateDepartmentOperation extends AbstractOperation {

    private final UpdateDepartmentUI ui = new UpdateDepartmentUI();

    public UpdateDepartmentOperation() {
        super("Update Department", "Update the department of a product");
    }

    @Override
    public JComponent settingsUI(View view) {
        return this.ui;
    }

    @Override
 public void execute(Model model) {
    String[] idAndDepartment = this.ui.getIdAndDepartment();
    int productId = Integer.parseInt(idAndDepartment[0]);
    String departmentName = idAndDepartment[1];
    Department department = Department.valueOf(departmentName.toUpperCase());
    model.updateDepartment(productId, department);
}


}
