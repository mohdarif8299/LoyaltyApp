package com.loyalty.loyaltyapplication.dto;

import lombok.Data;

import java.util.Objects;

@Data
public class TodMasterLedgerDto {
    public Integer id;
    public Integer tod_master_id;
    public String membershipNumber;
    public String points_from_party_name;
    public String transaction_date;
    public Double transaction_amount;
    public String transaction_number;
    public String transaction_type;
    public String approved;
    public String reason_for_points_allocation;
    public String scheme_applied;
    public Integer tod_allocated;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TodMasterLedgerDto)) return false;
        TodMasterLedgerDto that = (TodMasterLedgerDto) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getTod_master_id(), that.getTod_master_id()) && Objects.equals(getMembershipNumber(), that.getMembershipNumber()) && Objects.equals(getPoints_from_party_name(), that.getPoints_from_party_name()) && Objects.equals(getTransaction_date(), that.getTransaction_date()) && Objects.equals(getTransaction_amount(), that.getTransaction_amount()) && Objects.equals(getTransaction_number(), that.getTransaction_number()) && Objects.equals(getTransaction_type(), that.getTransaction_type()) && Objects.equals(getApproved(), that.getApproved()) && Objects.equals(getReason_for_points_allocation(), that.getReason_for_points_allocation()) && Objects.equals(getScheme_applied(), that.getScheme_applied()) && Objects.equals(getTod_allocated(), that.getTod_allocated());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTod_master_id(), getMembershipNumber(), getPoints_from_party_name(), getTransaction_date(), getTransaction_amount(), getTransaction_number(), getTransaction_type(), getApproved(), getReason_for_points_allocation(), getScheme_applied(), getTod_allocated());
    }
}
