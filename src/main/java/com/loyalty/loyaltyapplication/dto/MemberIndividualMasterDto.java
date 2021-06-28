package com.loyalty.loyaltyapplication.dto;


import lombok.Data;

import java.util.Objects;

@Data
public class MemberIndividualMasterDto {
    private Integer id;
    public String first_name;
    public String last_name;
    public String contact_number;
    public String email;
    public String member_since;
    public String membership_number;
    public String address;
    public String country;
    public String provice_state;
    public String city;
    public String member_type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MemberIndividualMasterDto)) return false;
        MemberIndividualMasterDto that = (MemberIndividualMasterDto) o;
        return Objects.equals(id, that.id) && Objects.equals(first_name, that.first_name) && Objects.equals(last_name, that.last_name) && Objects.equals(contact_number, that.contact_number) && Objects.equals(email, that.email) && Objects.equals(member_since, that.member_since) && Objects.equals(membership_number, that.membership_number) && Objects.equals(address, that.address) && Objects.equals(country, that.country) && Objects.equals(provice_state, that.provice_state) && Objects.equals(city, that.city) && Objects.equals(member_type, that.member_type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name, contact_number, email, member_since, membership_number, address, country, provice_state, city, member_type);
    }
}
