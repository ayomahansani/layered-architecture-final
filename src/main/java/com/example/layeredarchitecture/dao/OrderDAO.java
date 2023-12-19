package com.example.layeredarchitecture.dao;

import java.sql.SQLException;
import java.time.LocalDate;

public interface OrderDAO {

    String generateNextOrderId() throws SQLException, ClassNotFoundException;

    public boolean checkOrderExist(String orderId) throws SQLException, ClassNotFoundException;


    boolean saveOrder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException;
}
