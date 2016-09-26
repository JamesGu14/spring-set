package com.senso.boot.entity;

public class SystemUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_user.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_user.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_user.emailaddress
     *
     * @mbg.generated
     */
    private String emailaddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_user.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_user.firstname
     *
     * @mbg.generated
     */
    private String firstname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_user.lastname
     *
     * @mbg.generated
     */
    private String lastname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_user.userrole
     *
     * @mbg.generated
     */
    private Integer userrole;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_user.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_user.id
     *
     * @return the value of system_user.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_user.id
     *
     * @param id the value for system_user.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_user.username
     *
     * @return the value of system_user.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_user.username
     *
     * @param username the value for system_user.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_user.emailaddress
     *
     * @return the value of system_user.emailaddress
     *
     * @mbg.generated
     */
    public String getEmailaddress() {
        return emailaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_user.emailaddress
     *
     * @param emailaddress the value for system_user.emailaddress
     *
     * @mbg.generated
     */
    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress == null ? null : emailaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_user.password
     *
     * @return the value of system_user.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_user.password
     *
     * @param password the value for system_user.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_user.firstname
     *
     * @return the value of system_user.firstname
     *
     * @mbg.generated
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_user.firstname
     *
     * @param firstname the value for system_user.firstname
     *
     * @mbg.generated
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_user.lastname
     *
     * @return the value of system_user.lastname
     *
     * @mbg.generated
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_user.lastname
     *
     * @param lastname the value for system_user.lastname
     *
     * @mbg.generated
     */
    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_user.userrole
     *
     * @return the value of system_user.userrole
     *
     * @mbg.generated
     */
    public Integer getUserrole() {
        return userrole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_user.userrole
     *
     * @param userrole the value for system_user.userrole
     *
     * @mbg.generated
     */
    public void setUserrole(Integer userrole) {
        this.userrole = userrole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_user.description
     *
     * @return the value of system_user.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_user.description
     *
     * @param description the value for system_user.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}