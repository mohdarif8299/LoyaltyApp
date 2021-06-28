package com.loyalty.loyaltyapplication.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Data
@Entity
@Table(name = "member_company_master")
public class MemberCompanyMaster {
    @Id
    @Column(name = "id")
    public Integer id;
    @Column(name = "company_name")
    public String company_name;
    @Column(name = "phone_number")
    public String phone_number;
    @Column(name = "email")
    public String email;
    @Column(name = "web_site")
    public String web_site;
    @Column(name = "contact_person")
    public String contact_person;
    @Column(name = "membership_number")
    public String membership_number;
    @Column(name = "city")
    public String city;
    @Column(name = "country")
    public String country;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MemberCompanyMaster)) return false;
        MemberCompanyMaster that = (MemberCompanyMaster) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getCompany_name(), that.getCompany_name()) && Objects.equals(getPhone_number(), that.getPhone_number()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getWeb_site(), that.getWeb_site()) && Objects.equals(getContact_person(), that.getContact_person()) && Objects.equals(getMembership_number(), that.getMembership_number()) && Objects.equals(getCity(), that.getCity()) && Objects.equals(getCountry(), that.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCompany_name(), getPhone_number(), getEmail(), getWeb_site(), getContact_person(), getMembership_number(), getCity(), getCountry());
    }
}
