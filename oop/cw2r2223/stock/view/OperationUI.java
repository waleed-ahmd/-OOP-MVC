/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.cw2r2223.stock.view;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

import oop.cw2r2223.stock.control.Controller;
import oop.cw2r2223.stock.model.Operation;

/**
 *
 * @author childm
 */
public class OperationUI extends JDialog {

    private final JButton applyButton = new JButton("Apply");
    private final JButton cancelButton = new JButton("Cancel");
    
    private final Controller controller;
    private final Operation operation;

    public OperationUI(MainWindow frame, Controller controller, Operation operation) {
        super(frame, operation.name(), true);

        this.controller = controller;
        this.operation = operation;
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(this.applyButton);
        buttonPanel.add(this.cancelButton);

        add(operation.settingsUI(frame), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        this.applyButton.addActionListener(ev -> doApplyButton());
        this.cancelButton.addActionListener(ev -> setVisible(false));

        pack();
    }

    private void doApplyButton() {
        setVisible(false);
        this.operation.execute(this.controller.getModel());
    }
}
