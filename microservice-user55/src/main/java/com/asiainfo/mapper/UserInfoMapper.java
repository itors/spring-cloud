package com.asiainfo.mapper;

import java.sql.Date;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.asiainfo.entity.UserInfo;

@Mapper
public interface UserInfoMapper {

    @Select("select * from user_info where user_name=#{userName} and password=#{password}")
    @Results(
            id = "userInfoMap" ,
            value={
            @Result(column="user_id", property="userId", javaType = Integer.class),
            @Result(column="user_name", property="userName", javaType = String.class),
            @Result(column="password", property="password", javaType = String.class),
            @Result(column="teacher_code", property="teacherCode", javaType = String.class),
            @Result(column="college_id", property="collegeId", javaType = Integer.class),
            @Result(column="college_name", property="collegeName", javaType = String.class),
            @Result(column="user_email", property="userEmail", javaType = String.class),
            @Result(column="create_time", property="createTime", javaType = Date.class),
            @Result(column="create_time_str", property="createTimeStr", javaType = String.class),
            @Result(column="status", property="status", javaType = Integer.class),
            }
        )
	public UserInfo getByUserid(UserInfo userInfo)throws Exception;
}
