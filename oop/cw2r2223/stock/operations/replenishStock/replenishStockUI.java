package oop.cw2r2223.stock.operations.replenishStock;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class replenishStockUI extends JPanel {

    private final JTextField productIdField = new JTextField(8);
    private final JTextField amountField = new JTextField(8);

    public replenishStockUI() {
        add(new JLabel("Product ID:"));
        add(this.productIdField);
        add(new JLabel("Amount:"));
        add(this.amountField);
    }

    public int[] getIdAndAmount() {
        int productId = Integer.parseInt(this.productIdField.getText());
        int amount = Integer.parseInt(this.amountField.getText());
        return new int[]{productId, amount};
    }

}
