/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.cw2r2223.stock.view;

import java.awt.BorderLayout;
import java.util.Collection;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import oop.cw2r2223.stock.model.Model;
import oop.cw2r2223.stock.model.Record;

/**
 *
 * @author childm
 */
public class RecordsPanel extends JPanel {

    private JTable table = new JTable();

    public RecordsPanel() {
        super(new BorderLayout());
        JScrollPane sp = new JScrollPane(this.table);
        add(sp);
    }

    public void display(Model model) {
        Object[] columns = new Object[]{"Id", "Name", "Department", "Stock", "Price", "Discount"};
        Collection<Record> records = model.getRecords();

        DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };

        for (Record r : records) {
            Object[] cells = new Object[6];
            cells[0] = r.getId();
            cells[1] = r.getName();
            cells[2] = r.getDepartment();
            cells[3] = r.getStock();
            cells[4] = "£" + r.getPrice();
            cells[5] = r.getDiscount() + "%";
            dtm.addRow(cells);
        }
        this.table.setModel(dtm);
    }

}
