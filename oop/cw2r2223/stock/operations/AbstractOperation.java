/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.cw2r2223.stock.operations;

import javax.swing.JComponent;

import oop.cw2r2223.stock.model.Model;
import oop.cw2r2223.stock.model.Operation;
import oop.cw2r2223.stock.view.View;

/**
 *
 * @author childm
 */
public abstract class AbstractOperation implements Operation {

    private final String name;
    private final String description;

    public AbstractOperation(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public String description() {
        return this.description;
    }

    @Override
    public abstract JComponent settingsUI(View view);

    @Override
    public abstract void execute(Model model);

}
