package com.beingjavaguys.services;  
  
import java.util.List;  
  
import org.springframework.beans.factory.annotation.Autowired;  
  
import com.beingjavaguys.dao.DataDao;  
import com.beingjavaguys.domain.Employee;  
  
public class DataServiceImpl implements DataService {  
   
 @Autowired  
 DataDao dataDao;  
  
 @Override  
 public int insertRow(Employee employee) {  
  return dataDao.insertRow(employee);  
 }  
  
 @Override  
 public List<Employee> getList() {  
  return dataDao.getList();  
 }  
  
 @Override  
 public Employee getRowById(int id) {  
  return dataDao.getRowById(id);  
 }  
  
 @Override  
 public int updateRow(Employee employee) {  
  return dataDao.updateRow(employee);  
 }  
  
 @Override  
 public int deleteRow(int id) {  
  return dataDao.deleteRow(id);  
 }  
  
}  