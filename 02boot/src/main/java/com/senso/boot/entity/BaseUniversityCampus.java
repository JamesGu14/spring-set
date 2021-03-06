package com.senso.boot.entity;

public class BaseUniversityCampus {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_university_campus.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_university_campus.university_id
     *
     * @mbg.generated
     */
    private Integer university_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_university_campus.campus_name
     *
     * @mbg.generated
     */
    private String campus_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_university_campus.campus_address
     *
     * @mbg.generated
     */
    private String campus_address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_university_campus.campus_telephone
     *
     * @mbg.generated
     */
    private String campus_telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_university_campus.campus_fax
     *
     * @mbg.generated
     */
    private String campus_fax;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_university_campus.isdeleted
     *
     * @mbg.generated
     */
    private Boolean isdeleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_university_campus.id
     *
     * @return the value of base_university_campus.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_university_campus.id
     *
     * @param id the value for base_university_campus.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_university_campus.university_id
     *
     * @return the value of base_university_campus.university_id
     *
     * @mbg.generated
     */
    public Integer getUniversity_id() {
        return university_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_university_campus.university_id
     *
     * @param university_id the value for base_university_campus.university_id
     *
     * @mbg.generated
     */
    public void setUniversity_id(Integer university_id) {
        this.university_id = university_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_university_campus.campus_name
     *
     * @return the value of base_university_campus.campus_name
     *
     * @mbg.generated
     */
    public String getCampus_name() {
        return campus_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_university_campus.campus_name
     *
     * @param campus_name the value for base_university_campus.campus_name
     *
     * @mbg.generated
     */
    public void setCampus_name(String campus_name) {
        this.campus_name = campus_name == null ? null : campus_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_university_campus.campus_address
     *
     * @return the value of base_university_campus.campus_address
     *
     * @mbg.generated
     */
    public String getCampus_address() {
        return campus_address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_university_campus.campus_address
     *
     * @param campus_address the value for base_university_campus.campus_address
     *
     * @mbg.generated
     */
    public void setCampus_address(String campus_address) {
        this.campus_address = campus_address == null ? null : campus_address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_university_campus.campus_telephone
     *
     * @return the value of base_university_campus.campus_telephone
     *
     * @mbg.generated
     */
    public String getCampus_telephone() {
        return campus_telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_university_campus.campus_telephone
     *
     * @param campus_telephone the value for base_university_campus.campus_telephone
     *
     * @mbg.generated
     */
    public void setCampus_telephone(String campus_telephone) {
        this.campus_telephone = campus_telephone == null ? null : campus_telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_university_campus.campus_fax
     *
     * @return the value of base_university_campus.campus_fax
     *
     * @mbg.generated
     */
    public String getCampus_fax() {
        return campus_fax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_university_campus.campus_fax
     *
     * @param campus_fax the value for base_university_campus.campus_fax
     *
     * @mbg.generated
     */
    public void setCampus_fax(String campus_fax) {
        this.campus_fax = campus_fax == null ? null : campus_fax.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_university_campus.isdeleted
     *
     * @return the value of base_university_campus.isdeleted
     *
     * @mbg.generated
     */
    public Boolean getIsdeleted() {
        return isdeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_university_campus.isdeleted
     *
     * @param isdeleted the value for base_university_campus.isdeleted
     *
     * @mbg.generated
     */
    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }
}