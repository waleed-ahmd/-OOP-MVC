/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.cw2r2223.stock.control;

import javax.swing.SwingUtilities;

import oop.cw2r2223.stock.model.Model;
import oop.cw2r2223.stock.model.Operation;
import oop.cw2r2223.stock.operations.OperationFactory;
import oop.cw2r2223.stock.view.MainWindow;
import oop.cw2r2223.stock.view.OperationUI;
import oop.cw2r2223.stock.view.View;

/**
 *
 * @author childm
 */
public class Controller {

    private final MainWindow view;
    private final Model model;

    public Controller(OperationFactory factory) {
        this.view = new MainWindow(this);
        this.model = new Model(this.view, factory);
        this.view.setVisible(true);
    }

    public Model getModel() {
        return this.model;
    }

    public View getView() {
        return this.view;
    }

    public void doOperation(String name) {
        Operation operation = this.model.getOperation(name);
        OperationUI ui = new OperationUI(this.view, this, operation);
        ui.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Controller(new OperationFactory()));
    }

}
