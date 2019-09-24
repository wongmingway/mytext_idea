package com.itheima.mapper;

import com.itheima.bean.account;
import com.itheima.bean.accountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface accountMapper {
    int countByExample(accountExample example);

    int deleteByExample(accountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(account record);

    int insertSelective(account record);

    List<account> selectByExample(accountExample example);

    account selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") account record, @Param("example") accountExample example);

    int updateByExample(@Param("record") account record, @Param("example") accountExample example);

    int updateByPrimaryKeySelective(account record);

    int updateByPrimaryKey(account record);
}