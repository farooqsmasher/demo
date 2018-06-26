package com.myProject.app;

import com.myProject.model.Awsservice;
import com.myProject.repository.AwsserviceDb;
import java.util.ArrayList;
import java.util.UUID;

public class Hello{


    public static String  test() {
    
        String s1=UUID.randomUUID().toString();
        return s1;
    }

    public static void lisbyid() {
        AwsserviceDb obj1 = new AwsserviceDb();
        ArrayList<Awsservice> li =obj1.getall();
  
        for(Awsservice te : li){
            if(te.getName().contains("c"))
                {
               System.out.println(te);
            }
        } 
    }

 public static void main(String[] args) {
    System.out.println(test());

    
    Awsservice ob = new Awsservice();
    AwsserviceDb obj = new AwsserviceDb();
       ob.setName("cfn");
       ob.setServiceId(3);
       ob.setDescription("infa as the code");
       obj.addAll(ob);
       
       
       ArrayList<Awsservice> li3 =obj.getbyName("");
       for (Awsservice var1 : li3) {
           System.out.println(var1);
           
       }        
       System.out.println("found at "+obj.getbyid(2));
      obj.addAllList(li3);

      // lisbyid();




    }
}

