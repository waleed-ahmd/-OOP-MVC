/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.cw2r2223.stock.model;

/**
 *
 * @author childm
 */
public class Record {

    public enum Department {
        HOME, FURNITURE, ELECTRICAL, MEN, WOMEN
    };

    private static int idCounter = 10000;

    private final int id;
    private final String name;
    private Department department;
    private int stock;
    private double unitPrice;

    private int discount;

    public Record(String name, Department department, double unitPrice) {
        this.id = idCounter++;
        this.name = name;
        this.department = department;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return this.stock;
    }

    public void setPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getPrice() {
        return this.unitPrice;
    }

    public int getDiscount() {
        return this.discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getDiscountPrice() {
        return this.unitPrice - this.unitPrice * (this.discount / 100);
    }

}
