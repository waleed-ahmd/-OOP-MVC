package oop.cw2r2223.stock.operations.update;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UpdatePriceUI extends JPanel {

    private final JTextField idField = new JTextField(8);
    private final JTextField priceField = new JTextField(8);

    public UpdatePriceUI() {
        add(new JLabel("Product ID:"));
        add(this.idField);
        add(new JLabel("Price:"));
        add(this.priceField);
    }

    public double[] getIdAndPrice() {
        int productId = Integer.parseInt(this.idField.getText());
        double price = Double.parseDouble(this.priceField.getText());
        return new double[]{productId, price};
    }

}
