package com.kl.enjoy.service.Impl;

import com.alibaba.fastjson2.JSONObject;
import com.kl.enjoy.mapper.KlMapper;
import com.kl.enjoy.service.KlService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class KlServiceImpl implements KlService {

    @Resource
    private KlMapper klMapper;


    public String qryName(String str){
        JSONObject jsonObject = JSONObject.parseObject(str);
        return klMapper.qryName(jsonObject.getString("id"));
    }
}
