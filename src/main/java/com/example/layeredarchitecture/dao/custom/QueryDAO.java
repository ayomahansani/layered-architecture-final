package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.model.SearchOrderAddTblDTO;
import com.example.layeredarchitecture.model.SearchOrderByCustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface QueryDAO {

    ArrayList<SearchOrderByCustomerDTO> searchOrder(String id) throws SQLException, ClassNotFoundException;
    ArrayList<SearchOrderAddTblDTO> addTable(String id) throws SQLException, ClassNotFoundException;
}
