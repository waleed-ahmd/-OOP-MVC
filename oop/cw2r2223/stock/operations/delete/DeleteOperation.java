/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.cw2r2223.stock.operations.delete;

import javax.swing.JComponent;

import oop.cw2r2223.stock.operations.AbstractOperation;
import oop.cw2r2223.stock.model.Model;
import oop.cw2r2223.stock.view.View;

/**
 *
 * @author childm
 */
public class DeleteOperation extends AbstractOperation {

    private final DeleteUI ui = new DeleteUI();

    public DeleteOperation() {
        super("Delete", "Delete a record");
    }

    @Override
    public JComponent settingsUI(View view) {
        return this.ui;
    }

    @Override
    public void execute(Model model) {
        int id = this.ui.getId();
        model.delete( id);
    }

}
