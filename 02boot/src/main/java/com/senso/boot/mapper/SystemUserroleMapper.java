package com.senso.boot.mapper;

import com.senso.boot.entity.SystemUserrole;
import com.senso.boot.entity.SystemUserroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemUserroleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_userrole
     *
     * @mbg.generated
     */
    long countByExample(SystemUserroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_userrole
     *
     * @mbg.generated
     */
    int deleteByExample(SystemUserroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_userrole
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_userrole
     *
     * @mbg.generated
     */
    int insert(SystemUserrole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_userrole
     *
     * @mbg.generated
     */
    int insertSelective(SystemUserrole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_userrole
     *
     * @mbg.generated
     */
    List<SystemUserrole> selectByExample(SystemUserroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_userrole
     *
     * @mbg.generated
     */
    SystemUserrole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_userrole
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SystemUserrole record, @Param("example") SystemUserroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_userrole
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SystemUserrole record, @Param("example") SystemUserroleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_userrole
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SystemUserrole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_userrole
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SystemUserrole record);
}