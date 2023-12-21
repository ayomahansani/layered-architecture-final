package com.example.layeredarchitecture.dao.custom.impl;

import com.example.layeredarchitecture.dao.SQLUtill;
import com.example.layeredarchitecture.dao.custom.QueryDAO;
import com.example.layeredarchitecture.model.SearchOrderAddTblDTO;
import com.example.layeredarchitecture.model.SearchOrderByCustomerDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class QueryDAOImpl implements QueryDAO {

    public ArrayList<SearchOrderByCustomerDTO> searchOrder(String id) throws SQLException, ClassNotFoundException {

        ResultSet rst = SQLUtill.execute("SELECT c.name, o.oid, o.date from Customer c join Orders o on c.id = o.customerID where o.customerID = ?", id);

        ArrayList<SearchOrderByCustomerDTO> getAllsearch = new ArrayList<>();

        while (rst.next()) {
            SearchOrderByCustomerDTO searchDto = new SearchOrderByCustomerDTO(rst.getString(1), rst.getString(2), rst.getString(3));
            getAllsearch.add(searchDto);
        }

        return getAllsearch;
    }

    public ArrayList<SearchOrderAddTblDTO> addTable(String id) throws SQLException, ClassNotFoundException {

        ResultSet rst = SQLUtill.execute("SELECT od.oid, o.date, od.itemCode, i.description, od.qty, od.unitPrice from OrderDetails od join Item i on od.itemCode = i.code join Orders o on od.oid = o.oid where o.oid = ?", id);

        ArrayList<SearchOrderAddTblDTO> getAlldetails = new ArrayList<>();

        while (rst.next()) {
            SearchOrderAddTblDTO addtblDto = new SearchOrderAddTblDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6));
            getAlldetails.add(addtblDto);
        }

        return getAlldetails;
    }
}
