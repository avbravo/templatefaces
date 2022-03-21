/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.avbravo.templatefaces.controller;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 *
 * @author avbravo
 */
@Named
@ViewScoped
@Data
public class IndexController implements Serializable {

    /**
     * Creates a new instance of IndexController
     */
   
      private List<String> list;
    private String name;

     public IndexController() {
    }
    
    @PostConstruct
    public void init(){
        list = new ArrayList<>();
    }

    public void add(){
        list.add(name);
    }

    public void remove(String e){
        list.removeIf( x -> x.equals(e));
    }
}
