package com.loyalty.loyaltyapplication.dto;

import lombok.Data;

import java.util.Objects;

@Data
public class PointsMasterLedgerDto {

    private Integer id;
    private Integer points_master_id;
    private String membership_number;
    private String points_from_party_name;
    private String transaction_date;
    private Double transaction_amount;
    private String transaction_number;
    private String transaction_type;
    private String reason_for_points_allocation;
    private String approved;
    private String scheme_applied;
    private Integer point_allocated;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PointsMasterLedgerDto)) return false;
        PointsMasterLedgerDto that = (PointsMasterLedgerDto) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getPoints_master_id(), that.getPoints_master_id()) && Objects.equals(getMembership_number(), that.getMembership_number()) && Objects.equals(getPoints_from_party_name(), that.getPoints_from_party_name()) && Objects.equals(getTransaction_date(), that.getTransaction_date()) && Objects.equals(getTransaction_amount(), that.getTransaction_amount()) && Objects.equals(getTransaction_number(), that.getTransaction_number()) && Objects.equals(getTransaction_type(), that.getTransaction_type()) && Objects.equals(getReason_for_points_allocation(), that.getReason_for_points_allocation()) && Objects.equals(getApproved(), that.getApproved()) && Objects.equals(getScheme_applied(), that.getScheme_applied()) && Objects.equals(getPoint_allocated(), that.getPoint_allocated());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPoints_master_id(), getMembership_number(), getPoints_from_party_name(), getTransaction_date(), getTransaction_amount(), getTransaction_number(), getTransaction_type(), getReason_for_points_allocation(), getApproved(), getScheme_applied(), getPoint_allocated());
    }
}
