package com.myProject.repository;

import com.myProject.model.Awsservice;
import java.util.ArrayList;


public class AwsserviceDb{

public static ArrayList<Awsservice> testdb = new ArrayList<Awsservice>();

   public AwsserviceDb(){
    
      Awsservice a1 = new Awsservice();
       a1.setName("s3");
       a1.setServiceId(1);
       a1.setDescription("object storage");
        testdb.add(a1);

       Awsservice a2 = new Awsservice(); 
       a2.setName("ec2");
       a2.setServiceId(2);
       a2.setDescription("compute"); 
         testdb.add(a2);


   }
   
   public ArrayList<Awsservice> getall(){
       
       return testdb;
   }
    
   public void addAll(Awsservice awsservice){
   testdb.add(awsservice); 
   
   }


   
}  



