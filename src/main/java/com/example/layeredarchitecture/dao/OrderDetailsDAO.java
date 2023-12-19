package com.example.layeredarchitecture.dao;

import java.math.BigDecimal;
import java.sql.SQLException;

public interface OrderDetailsDAO  {
    boolean insertOrderDetails(String orderId, String itemCode, BigDecimal unitPrice, int qty) throws SQLException, ClassNotFoundException;
}
