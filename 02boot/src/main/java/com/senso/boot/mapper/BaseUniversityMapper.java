package com.senso.boot.mapper;

import com.senso.boot.entity.BaseUniversity;
import com.senso.boot.entity.BaseUniversityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseUniversityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_university
     *
     * @mbg.generated
     */
    long countByExample(BaseUniversityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_university
     *
     * @mbg.generated
     */
    int deleteByExample(BaseUniversityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_university
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_university
     *
     * @mbg.generated
     */
    int insert(BaseUniversity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_university
     *
     * @mbg.generated
     */
    int insertSelective(BaseUniversity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_university
     *
     * @mbg.generated
     */
    List<BaseUniversity> selectByExample(BaseUniversityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_university
     *
     * @mbg.generated
     */
    BaseUniversity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_university
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") BaseUniversity record, @Param("example") BaseUniversityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_university
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") BaseUniversity record, @Param("example") BaseUniversityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_university
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(BaseUniversity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_university
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(BaseUniversity record);
}