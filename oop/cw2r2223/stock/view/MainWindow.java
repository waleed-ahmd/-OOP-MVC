/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.cw2r2223.stock.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import oop.cw2r2223.stock.control.Controller;
import oop.cw2r2223.stock.model.Model;

/**
 *
 * @author childm
 */
public class MainWindow extends JFrame implements View {

    private final RecordsPanel recordsPanel = new RecordsPanel();

    private final JMenu opMenu = new JMenu("Operations");
    private final Controller controller;

    public MainWindow(Controller controller) {
        this.controller = controller;

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        menuBar.add(fileMenu);
        menuBar.add(opMenu);
        setJMenuBar(menuBar);

        add(this.recordsPanel, BorderLayout.CENTER);
        pack();
    }

    @Override
    public void update(Model model) {
        this.recordsPanel.display(model);
        repaint();
    }
    
    @Override
    public void addMenuOperation(String identifier) {
        JMenuItem item = new JMenuItem(identifier);
        item.addActionListener(ev -> controller.doOperation(identifier));
        this.opMenu.add(item);
    }
}
