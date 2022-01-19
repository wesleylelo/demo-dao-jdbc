/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import model.dao.impl.SellerDaoJDBC;

/**
 *
 * @author lelo0
 */
public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }
}
