/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.cw2r2223.stock.model;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import oop.cw2r2223.stock.model.Record.Department;
import oop.cw2r2223.stock.operations.OperationFactory;
import oop.cw2r2223.stock.operations.OperationFactory.OpID;
import oop.cw2r2223.stock.view.View;

/**
 *
 * @author childm
 */
public class Model {

    private final View view;

    private Map<Integer, Record> records = new TreeMap<Integer, Record>();

    private final Map<OpID, Operation> operations = new TreeMap<>();

    public Model(View view, OperationFactory factory) {
        this.view = view;
        for (OpID identifier : OpID.values()) {
            this.operations.put(identifier, factory.createOperation(identifier));
            this.view.addMenuOperation(identifier.toString());
        }
        frug();
    }

    public Collection<Record> getRecords() {
        return this.records.values();
    }

    public void add(String name, Record.Department department, double unitPrice) {
        Record record = new Record(name, department, unitPrice);
        this.records.put(record.getId(), record);
        this.view.update(this);
    }

    public Record get(int id) {
        return this.records.get(id);
    }

    public void delete(int id) {
        this.records.remove(id);
        this.view.update(this);
    }

    public void updateDepartment(int id, Record.Department department) {
        this.records.get(id).setDepartment(department);
        this.view.update(this);
    }

    public void updatePrice(int id, double price) {
        this.records.get(id).setPrice(price);
        this.view.update(this);
    }

    public void replenishStock(int id, int amount) {
        Record record = this.records.get(id);
        record.setStock(record.getStock() + amount);
        this.view.update(this);
    }

    public void applyDiscount(Department department, int discount) {
        for (Record record : this.records.values()) {
            if (record.getDepartment() == department) {
                record.setDiscount(discount);
            }
        }
        this.view.update(this);
    }

    public Operation getOperation(String name) {
        return this.operations.get(OpID.valueOf(name));
    }

    private void frug() {
        add("Liebherr CNSL3033 Freestanding Fridge-Freezer", Department.ELECTRICAL, 349.00);
        add("Zanussi ZFG06400WA Freezer", Department.ELECTRICAL, 129.00);
        add("Indesit CAA55", Department.ELECTRICAL, 219.00);
        add("Lec R5010W Fridge", Department.ELECTRICAL, 129.00);
        add("Indesit CAA55S, Silver", Department.ELECTRICAL, 249.99);
        add("Modern Rarity Balloon Sleeve Shirt, White", Department.WOMEN, 100.00);
        add("Olivia Blouse, Ivory", Department.WOMEN, 69.00);
        add("Ivy Floral Print Blouse, Black/Ochre", Department.WOMEN, 69.00);
        add("Hobbs Charlie Polka Dot Shirt, Ivory/Navy", Department.WOMEN, 79.00);
        add("Modern Rarity Vee Neck Blouse, Sage", Department.WOMEN, 95.00);
        add("Ivy Floral Cold Shoulder Top, Black/Ochre", Department.WOMEN, 55.00);
        add("John Lewis Padded Foldaway Jacket, Navy", Department.MEN, 79.00);
        add("Barbour Chelsea Sportsquilt Water-Resistant Quilted Jacket, Black", Department.MEN, 96.00);
        add("John Lewis Hooded Sports Jacket, Navy", Department.MEN, 99.00);
        add("Barbour Lifestyle Powell Quilted Jacket, Black", Department.MEN, 119.20);
        add("JOHN LEWIS & Co. Parka Jacket, Khaki", Department.MEN, 149.00);
        add("GANT Windcheater Collared Jacket, Stone", Department.MEN, 175.00);
        add("John Lewis Hannah Leather Large 3 Seater Sofa, Dark Leg, Milan Dark Brown", Department.FURNITURE, 999.00);
        add("John Lewis Bailey Leather Large 3 Seater Sofa, Dark Leg, Milan Chestnut", Department.FURNITURE, 1159.00);
        add("G Plan Vintage The Fifty Three Large 3 Seater Sofa, Fleck Blue", Department.FURNITURE, 1550.00);
        add("John Lewis Sacha Large Sofa Bed with Foam Mattress, Light Leg, Erin Grey", Department.FURNITURE, 1249.00);
        add("Innovation Cubed 140 Sofa Bed with Serpentine Sprung Foam Mattress, Nist Blue", Department.FURNITURE, 1199.00);
        add("John Lewis Malone 2 Seater Small Sofa Bed with Open Sprung Mattress", Department.FURNITURE, 1299.00);
        add("John Lewis Lustre Velvet Lined Eyelet Curtains, Steel", Department.HOME, 180.00);
        add("John Lewis Oakley Trees Eyelet Lined Curtains, Natural", Department.HOME, 160.00);
        add("John Lewis Eyelet Blackout Curtain Linings", Department.HOME, 60.00);
        add("John Lewis Arlo Lined Eyelet Curtains, Putty", Department.HOME, 100.00);
        add("John Lewis Barathea Lined Eyelet Curtains, Duck Egg", Department.HOME, 110.00);
        add("John Lewis Chester Lined Eyelet Curtains, Brick", Department.HOME, 180.00);
        for(Record record : records.values()) {
            replenishStock( record.getId(), (int)(Math.random() * 50));
        }
    }
}
