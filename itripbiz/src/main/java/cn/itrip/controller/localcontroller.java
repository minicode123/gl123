package cn.itrip.controller;

import cn.itrip.dao.itripAreaDic.ItripAreaDicMapper;
import cn.itrip.dao.itripLabelDic.ItripLabelDicMapper;
import cn.itrip.pojo.ItripAreaDic;
import cn.itrip.pojo.ItripLabelDic;
import itrip.common.Dto;
import itrip.common.DtoUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller

public class localcontroller {
    @Resource
    ItripAreaDicMapper dao;
    @Resource
    ItripLabelDicMapper dd;
    @RequestMapping("api/hotel/queryhotcity/{type}")
    @ResponseBody
    public Dto getlist(@PathVariable("type")int type){

        List<ItripAreaDic> list=dao.gethot(type);

    return DtoUtil.returnDataSuccess(list);
}
    @RequestMapping("/api/hotel/queryhotelfeature")
    @ResponseBody
    public  Dto list1() throws Exception {
        List<ItripLabelDic> list1=dd.top();
        return DtoUtil.returnDataSuccess(list1);
    }
 }
