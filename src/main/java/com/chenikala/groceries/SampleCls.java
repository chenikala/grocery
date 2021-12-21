package com.chenikala.groceries;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleCls {

    @RequestMapping("/")
    public List<String> getEmployees() 
    {
      List<String> employeesList = new ArrayList<String>();
      employeesList.add("one");
      employeesList.add("two");
      employeesList.add("three");
      employeesList.add("four");
      return employeesList;
    }
}
