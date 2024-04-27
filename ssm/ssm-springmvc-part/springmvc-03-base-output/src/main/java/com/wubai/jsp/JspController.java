package com.wubai.jsp;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("jsp")
public class JspController {

    @GetMapping("index")
    public String index(HttpServletRequest request){
        request.setAttribute("data","hello jsp!!!");
        System.out.println("JspController.index");
        return "index";
    }

    //转发 ：只能是项目下的资源 keyi忽略applicationContext 使用springmvc 可以忽略
    @GetMapping("forward")
    public String forward(){
        return "forward:/jsp/index";
    }
    //重定向 ：不能忽略applicationContext
    @GetMapping("redirect/chatgpt")
    public String redirectgpt(){
        return "redirect:https://chat18.aichatos.xyz/#/chat/1713102397653";
    }
    @GetMapping("redirect")
    public String redirect(){
        return "redirect:/jsp/index";
    }
}
