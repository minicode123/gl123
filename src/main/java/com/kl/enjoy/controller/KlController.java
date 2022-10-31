package com.kl.enjoy.controller;

import com.alibaba.fastjson2.JSONObject;
import com.kl.enjoy.service.KlService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class KlController {


   @Resource
   private KlService klService;

   /*public String qryById(String json){
      JSONObject jsonObject = JSONObject.parseObject(json);
      String name = jsonObject.get("name").toString();
      return name;
   }

   public static void main(String[] args) {
      KlController klController=new KlController();
      String s = klController.qryById("{\n" +
              "    \"name\":\"123\"\n" +
              "}");
      System.out.println(s);
   }*/
   @PostMapping("qryName")
   public String qryName(@RequestBody String str){
      return klService.qryName(str);
   }

}
