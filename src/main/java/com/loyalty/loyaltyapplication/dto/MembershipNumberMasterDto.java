package com.loyalty.loyaltyapplication.dto;

import lombok.Data;

import java.util.Objects;

@Data
public class MembershipNumberMasterDto {
    public Integer id;
    public String membership_number;
    public String entity_used_for;
    public Integer subscribed_entity_details_id;
    public String membership_type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MembershipNumberMasterDto)) return false;
        MembershipNumberMasterDto that = (MembershipNumberMasterDto) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getMembership_number(), that.getMembership_number()) && Objects.equals(getEntity_used_for(), that.getEntity_used_for()) && Objects.equals(getSubscribed_entity_details_id(), that.getSubscribed_entity_details_id()) && Objects.equals(getMembership_type(), that.getMembership_type());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMembership_number(), getEntity_used_for(), getSubscribed_entity_details_id(), getMembership_type());
    }
}
