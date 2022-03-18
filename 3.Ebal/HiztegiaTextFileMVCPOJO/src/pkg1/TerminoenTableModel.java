/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lomana.markel
 */
public class TerminoenTableModel extends AbstractTableModel {

    String[] zutabeIzenak = {"ID", "Euskaraz", "Gazteleraz"};
    ArrayList<Terminoa> data = new ArrayList<>();

    private final String DB = "db/Hiztegia.db";

    public TerminoenTableModel(ArrayList<Terminoa> datuakArrayList) {
        this.data = datuakArrayList;
    }

    public Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:" + DB;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return zutabeIzenak.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return data.get(rowIndex).getId();
        } else if (columnIndex == 1) {
            return data.get(rowIndex).getEuskaraz();
        } else if (columnIndex == 2) {
            return data.get(rowIndex).getGazteleraz();
        }
        return "";
    }

    @Override
    public String getColumnName(int col) {
        return zutabeIzenak[col];
    }

    /**
     * Metodo hau definituta izatea komeni da, jTablean zutabe booleanoak
     * checkbox formatuan agertu daitezen. Double eskumara joaten da Boolean bat
     * checkbox bat egiten du...
     *
     * @param col Zutabe zenbakia
     * @return Boolean, integer, String ...
     */
    public Class getColumnClass(int col) {
        return getValueAt(0, col).getClass();
    }

    /**
     * Table-eko cell-ak editatzeko metodoa
     *
     * @param row
     * @param col
     * @return
     */
    @Override
    public boolean isCellEditable(int row, int col) {
        if (col == 2) {
            return true;
        }
        return false;
    }
    /**
     *
     * @param value
     * @param row
     * @param col
     * @return
     */
    /*@Override
    public void setValueAt(Object value,int row, int col) {
        data.get(row).setPrezioa((double) value);
    }
   /* public Object[][] getData(){
        
    }*/
}
