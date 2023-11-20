package oop.cw2r2223.stock.operations;

import oop.cw2r2223.stock.model.Operation;
import oop.cw2r2223.stock.operations.add.AddOperation;
import oop.cw2r2223.stock.operations.delete.DeleteOperation;
import oop.cw2r2223.stock.operations.replenishStock.replenishStockOperation;
import oop.cw2r2223.stock.operations.updateDepartment.UpdateDepartmentOperation;
import oop.cw2r2223.stock.operations.update.UpdatePriceOperation;
import oop.cw2r2223.stock.operations.setDiscount.SetDiscountOperation;


public class OperationFactory {

    public enum OpID {
        ADD, DELETE, REPLENISH, UPDATE_PRICE, UPDATE_DEPARTMENT, SET_DISCOUNT
    }

    public Operation createOperation(OpID operation) {
        switch (operation) {
            case ADD:
                return new AddOperation();
            case DELETE:
                return new DeleteOperation();
            case REPLENISH:
                return new replenishStockOperation();
            case UPDATE_PRICE:
                return new UpdatePriceOperation();
            case UPDATE_DEPARTMENT:
                return new UpdateDepartmentOperation();
            case SET_DISCOUNT:
                return new SetDiscountOperation();
            default:
                throw new IllegalArgumentException("Unknown operation: " + operation);
        }
    }
}
