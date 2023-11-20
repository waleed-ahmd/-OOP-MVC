package oop.cw2r2223.stock.operations.replenishStock;

import javax.swing.JComponent;

import oop.cw2r2223.stock.operations.AbstractOperation;
import oop.cw2r2223.stock.model.Model;
import oop.cw2r2223.stock.view.View;

/**
 * Operation to replenish the stock of a product.
 * Prompts the user for a product ID and amount to add to stock.
 * Adds the specified amount to the existing stock of the product with the given ID.
 */
public class replenishStockOperation extends AbstractOperation {

    private final replenishStockUI ui = new replenishStockUI();

    public replenishStockOperation() {
        super("Replenish Stock", "Replenish the stock of a product");
    }

    @Override
    public JComponent settingsUI(View view) {
        return this.ui;
    }

    @Override
    public void execute(Model model) {
        int[] idAndAmount = this.ui.getIdAndAmount();
        int id = idAndAmount[0];
        int amount = idAndAmount[1];
        model.replenishStock(id, amount);
    }

}
