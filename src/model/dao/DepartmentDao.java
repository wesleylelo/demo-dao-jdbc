/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.dao;

import model.entities.Department;

/**
 *
 * @author lelo0
 */
public interface DepartmentDao {
    void insert (Department obj);
    void update (Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
}
