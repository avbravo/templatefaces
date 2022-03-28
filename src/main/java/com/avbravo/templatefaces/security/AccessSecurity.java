/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.avbravo.templatefaces.security;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author avbravo
 */
@Named(value = "accessSecurity")
@SessionScoped
public class AccessSecurity implements Serializable {

    /**
     * Creates a new instance of AccessSecurity
     */
    public AccessSecurity() {
     
    }
    
}
