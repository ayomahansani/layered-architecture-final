package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;
import java.time.LocalDate;

public interface OrderDAO extends CrudDAO<OrderDTO> {

    /*String generateNextOrderId() throws SQLException, ClassNotFoundException;
    public boolean checkOrderExist(String orderId) throws SQLException, ClassNotFoundException;
    boolean saveOrder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException;*/
    boolean save(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException;

}
