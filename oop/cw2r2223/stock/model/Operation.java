/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.cw2r2223.stock.model;

import javax.swing.JComponent;

import oop.cw2r2223.stock.view.View;

/**
 *
 * @author childm
 */
public interface Operation {

    /** Returns the name of this operation. */
    String name();

    /** Returns the description of this operation. */
    String description();

    /** Returns a subclass of JComponent that will be used in the OperationUI dialog. */
    JComponent settingsUI(View view);

    /** 
     * Executes the operation using the given model. 
     */
    void execute(Model model);

}
