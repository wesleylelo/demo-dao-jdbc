/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.dao;

import model.entities.Seller;

/**
 *
 * @author lelo0
 */
public interface SellerDao {
    void insert (Seller obj);
    void update (Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
}
