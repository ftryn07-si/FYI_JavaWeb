package com.juaracoding.FYI_JavaWeb.utils;/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Moh. Ikhsan a.k.a. Fitriyani
Java Developer
Created on 2/28/2023 8:54 PM
@Last Modified 2/28/2023 8:54 PM
Version 1.0
*/


import org.springframework.ui.Model;

import java.util.Date;
import java.util.Map;

public class MappingAttribute {

    public void setAttribute(Model model,Map<String,Object> mapz)
    {
        model.addAttribute("message", mapz.get("message"));
        model.addAttribute("status", mapz.get("status"));
        model.addAttribute("data", mapz.get("responseObj")==null?"":mapz.get("responseObj"));
        model.addAttribute("timestamp", new Date());
        model.addAttribute("success",mapz.get("success"));
        if(mapz.get("errorCode") != null)
        {
            model.addAttribute("errorCode",mapz.get("errorCode"));
            model.addAttribute("path",mapz.get("path"));
        }
    }
}
