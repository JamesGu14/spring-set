package com.senso.boot.entity;

public class BaseUniversity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_university.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_university.university_name
     *
     * @mbg.generated
     */
    private String university_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_university.state
     *
     * @mbg.generated
     */
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_university.abbr
     *
     * @mbg.generated
     */
    private String abbr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_university.isDeleted
     *
     * @mbg.generated
     */
    private Boolean isDeleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_university.id
     *
     * @return the value of base_university.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_university.id
     *
     * @param id the value for base_university.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_university.university_name
     *
     * @return the value of base_university.university_name
     *
     * @mbg.generated
     */
    public String getUniversity_name() {
        return university_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_university.university_name
     *
     * @param university_name the value for base_university.university_name
     *
     * @mbg.generated
     */
    public void setUniversity_name(String university_name) {
        this.university_name = university_name == null ? null : university_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_university.state
     *
     * @return the value of base_university.state
     *
     * @mbg.generated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_university.state
     *
     * @param state the value for base_university.state
     *
     * @mbg.generated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_university.abbr
     *
     * @return the value of base_university.abbr
     *
     * @mbg.generated
     */
    public String getAbbr() {
        return abbr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_university.abbr
     *
     * @param abbr the value for base_university.abbr
     *
     * @mbg.generated
     */
    public void setAbbr(String abbr) {
        this.abbr = abbr == null ? null : abbr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_university.isDeleted
     *
     * @return the value of base_university.isDeleted
     *
     * @mbg.generated
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_university.isDeleted
     *
     * @param isDeleted the value for base_university.isDeleted
     *
     * @mbg.generated
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}