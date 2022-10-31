package com.kl.enjoy.mapper;

import org.apache.ibatis.annotations.Select;

public interface KlMapper {

    @Select("select name from testone where  id=#{str}")
    String qryName(String str);
}
