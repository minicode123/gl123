package cn.itrip.dao.itripAreaDic;
import cn.itrip.pojo.ItripAreaDic;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

public interface ItripAreaDicMapper {

	public List<ItripAreaDic> gethot(@Param("type") int type);

	public ItripAreaDic getItripAreaDicById(@Param(value = "id") Long id)throws Exception;

	public List<ItripAreaDic>	getItripAreaDicListByMap(Map<String, Object> param)throws Exception;

	public Integer getItripAreaDicCountByMap(Map<String, Object> param)throws Exception;

	public Integer insertItripAreaDic(ItripAreaDic itripAreaDic)throws Exception;

	public Integer updateItripAreaDic(ItripAreaDic itripAreaDic)throws Exception;

	public Integer deleteItripAreaDicById(@Param(value = "id") Long id)throws Exception;

}