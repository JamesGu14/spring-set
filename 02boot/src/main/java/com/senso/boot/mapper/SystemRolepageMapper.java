package com.senso.boot.mapper;

import com.senso.boot.entity.SystemRolepage;
import com.senso.boot.entity.SystemRolepageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemRolepageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_rolepage
     *
     * @mbg.generated
     */
    long countByExample(SystemRolepageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_rolepage
     *
     * @mbg.generated
     */
    int deleteByExample(SystemRolepageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_rolepage
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_rolepage
     *
     * @mbg.generated
     */
    int insert(SystemRolepage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_rolepage
     *
     * @mbg.generated
     */
    int insertSelective(SystemRolepage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_rolepage
     *
     * @mbg.generated
     */
    List<SystemRolepage> selectByExample(SystemRolepageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_rolepage
     *
     * @mbg.generated
     */
    SystemRolepage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_rolepage
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SystemRolepage record, @Param("example") SystemRolepageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_rolepage
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SystemRolepage record, @Param("example") SystemRolepageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_rolepage
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SystemRolepage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_rolepage
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SystemRolepage record);
}