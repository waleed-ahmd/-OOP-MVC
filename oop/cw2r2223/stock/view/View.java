/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.cw2r2223.stock.view;

import oop.cw2r2223.stock.model.Model;

/**
 *
 * @author childm
 */
public interface View {

    void addMenuOperation(String toString);

    void update(Model model);
    
}
