package oop.cw2r2223.stock.operations.update;

import javax.swing.JComponent;

import oop.cw2r2223.stock.operations.AbstractOperation;
import oop.cw2r2223.stock.model.Model;
import oop.cw2r2223.stock.view.View;

/**
 * Operation to update the price of a product.
 * Prompts the user for a product ID and new price.
 * Sets the price of the product with the given ID to the new price.
 */
public class UpdatePriceOperation extends AbstractOperation {

    private final UpdatePriceUI ui = new UpdatePriceUI();

    public UpdatePriceOperation() {
        super("Update Price", "Update the price of a product");
    }

    @Override
    public JComponent settingsUI(View view) {
        return this.ui;
    }

    @Override
    public void execute(Model model) {
        double[] getIdAndPrice = this.ui.getIdAndPrice();
        int productId = (int) getIdAndPrice[0];
        double price = getIdAndPrice[1];
        model.updatePrice(productId, price);
    }

}
