package com.loyalty.loyaltyapplication.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
@Table(name = "member_individual_master")
public class MemberIndividualMaster {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "first_name")
    public String first_name;
    @Column(name = "last_name")
    public String last_name;
    @Column(name = "contact_number")
    public String contact_number;
    @Column(name = "email")
    public String email;
    @Column(name = "member_since")
    public String member_since;
    @Column(name = "membership_number")
    public String membershipNumber;
    @Column(name = "address")
    public String address;
    @Column(name = "country")
    public String country;
    @Column(name = "provice_state")
    public String provice_state;
    @Column(name = "city")
    public String city;
    @Column(name = "member_type")
    public String member_type;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MemberIndividualMaster)) return false;
        MemberIndividualMaster that = (MemberIndividualMaster) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getFirst_name(), that.getFirst_name()) && Objects.equals(getLast_name(), that.getLast_name()) && Objects.equals(getContact_number(), that.getContact_number()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getMember_since(), that.getMember_since()) && Objects.equals(getMembershipNumber(), that.getMembershipNumber()) && Objects.equals(getAddress(), that.getAddress()) && Objects.equals(getCountry(), that.getCountry()) && Objects.equals(getProvice_state(), that.getProvice_state()) && Objects.equals(getCity(), that.getCity()) && Objects.equals(getMember_type(), that.getMember_type());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirst_name(), getLast_name(), getContact_number(), getEmail(), getMember_since(), getMembershipNumber(), getAddress(), getCountry(), getProvice_state(), getCity(), getMember_type());
    }
}
