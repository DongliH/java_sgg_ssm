package com.wubai.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("share")
@ResponseBody

public class ShareController {
    @Autowired
    private ServletContext servletContext;

    public  void  data(HttpServletRequest request, HttpSession session){

    }

    public void  data1(Model model){
        model.addAttribute("key","value"); //request

    }

    public void  data1(ModelMap modelMap){
        modelMap.addAttribute("key","value"); //request
    }
    public void  data1(Map map){
        map.put("key","value"); //request
    }

    public ModelAndView data1 (){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("key","value");
        modelAndView.setViewName("视图名 页面名称");
        return  modelAndView;
    }

}
