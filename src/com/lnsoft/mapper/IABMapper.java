package com.lnsoft.mapper;

import com.lnsoft.po.IAB;
import com.lnsoft.po.IABExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IABMapper {
    int countByExample(IABExample example);

    int deleteByExample(IABExample example);

    int insert(IAB record);

    int insertSelective(IAB record);

    List<IAB> selectByExample(IABExample example);

    int updateByExampleSelective(@Param("record") IAB record, @Param("example") IABExample example);

    int updateByExample(@Param("record") IAB record, @Param("example") IABExample example);
}