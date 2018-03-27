package com.nf.usermanage.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Users{

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Long phone;
    private String email;
    private String education;
    private String graduationschool;
    private String profession;
    private String profile;

    public Users(){}


    public Users(String name, Long phone, String email, String education, String graduationschool, String profession, String profile) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.education = education;
        this.graduationschool = graduationschool;
        this.profession = profession;
        this.profile = profile;
    }

    public Users(Long id,String name, Long phone, String email, String education, String graduationschool, String profession, String profile) {
        this.id=id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.education = education;
        this.graduationschool = graduationschool;
        this.profession = profession;
        this.profile = profile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getGraduationschool() {
        return graduationschool;
    }

    public void setGraduationschool(String graduationschool) {
        this.graduationschool = graduationschool;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", education='" + education + '\'' +
                ", graduationschool='" + graduationschool + '\'' +
                ", profession='" + profession + '\'' +
                ", profile='" + profile + '\'' +
                '}';
    }
}
