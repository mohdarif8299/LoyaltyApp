package com.loyalty.loyaltyapplication.dto;

import lombok.Data;

import java.util.Objects;

@Data
public class MemberCompanyMasterDto {
    public Integer id;
    public String company_name;
    public String phone_number;
    public String email;
    public String web_site;
    public String contact_person;
    public String membership_number;
    public String city;
    public String country;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MemberCompanyMasterDto)) return false;
        MemberCompanyMasterDto that = (MemberCompanyMasterDto) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getCompany_name(), that.getCompany_name()) && Objects.equals(getPhone_number(), that.getPhone_number()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getWeb_site(), that.getWeb_site()) && Objects.equals(getContact_person(), that.getContact_person()) && Objects.equals(getMembership_number(), that.getMembership_number()) && Objects.equals(getCity(), that.getCity()) && Objects.equals(getCountry(), that.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCompany_name(), getPhone_number(), getEmail(), getWeb_site(), getContact_person(), getMembership_number(), getCity(), getCountry());
    }
}
