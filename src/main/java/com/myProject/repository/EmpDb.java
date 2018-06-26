package com.myProject.repository;

import com.myProject.model.Employee;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class EmpDb{
 
            static final ArrayList <Employee> al = new ArrayList<Employee>(); 
            static final List<Employee> list= new LinkedList<Employee>(); 

     public EmpDb(){
  
    
      Employee emp = new Employee();
          
              emp.setName("Mohammed Farooq");
              emp.setId(1);
              emp.setAge(25);
              emp.setAddress("Rt nagar");
              emp.setSalary(20.00);
              emp.setContact_no(23546);
             al.add(emp); 
             list.add(emp);
             Employee emp1 = new Employee();
          
              emp1.setName("Mohammed Farooq");
              emp1.setId(1);
              emp1.setAge(25);
              emp1.setAddress("Rt nagar");
              emp1.setSalary(20.00);
              emp1.setContact_no(23546);
             al.add(emp1);
          

     }
    public static ArrayList<Employee> listemp(){
           return al;
    }

   public static double sal(double sum){
       return sum*2;
   }

 public static void main(String[] args) {
     
    

    EmpDb obj =new EmpDb();
    ArrayList<Employee> list =listemp();
    
     

    for(Employee ll:list){
        
        
        //double tes =obj.sal(ll.getSalary());
        System.out.println(obj.sal(ll.getSalary()));
             
        System.out.println(ll.getName()+ll.getId()+ll.getContact_no());
    }


 }

}