package com.senso.boot.entity;

public class BaseCampususerStatus {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_campususer_status.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_campususer_status.status_name
     *
     * @mbg.generated
     */
    private String status_name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_campususer_status.id
     *
     * @return the value of base_campususer_status.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_campususer_status.id
     *
     * @param id the value for base_campususer_status.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_campususer_status.status_name
     *
     * @return the value of base_campususer_status.status_name
     *
     * @mbg.generated
     */
    public String getStatus_name() {
        return status_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_campususer_status.status_name
     *
     * @param status_name the value for base_campususer_status.status_name
     *
     * @mbg.generated
     */
    public void setStatus_name(String status_name) {
        this.status_name = status_name == null ? null : status_name.trim();
    }
}