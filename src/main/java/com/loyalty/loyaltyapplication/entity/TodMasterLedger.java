package com.loyalty.loyaltyapplication.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Data
@Entity
@Table(name = "")
public class TodMasterLedger {
    @Id
    @Column(name = "id")
    public Integer id;
    @Column(name = "tod_master_id")
    public Integer todMasterId;
    @Column(name = "membershipNumber")
    public String membershipNumber;
    @Column(name = "points_from_party_name")
    public String points_from_party_name;
    @Column(name = "transaction_date")
    public String transaction_date;
    @Column(name = "transaction_amount")
    public Double transaction_amount;
    @Column(name = "transaction_number")
    public String transaction_number;
    @Column(name = "transaction_type")
    public String transaction_type;
    @Column(name = "approved")
    public String approved;
    @Column(name = "reason_for_points_allocation")
    public String reason_for_points_allocation;
    @Column(name = "scheme_applied")
    public String scheme_applied;
    @Column(name = "tod_allocated")
    public Integer tod_allocated;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TodMasterLedger)) return false;
        TodMasterLedger that = (TodMasterLedger) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getTodMasterId(), that.getTodMasterId()) && Objects.equals(getMembershipNumber(), that.getMembershipNumber()) && Objects.equals(getPoints_from_party_name(), that.getPoints_from_party_name()) && Objects.equals(getTransaction_date(), that.getTransaction_date()) && Objects.equals(getTransaction_amount(), that.getTransaction_amount()) && Objects.equals(getTransaction_number(), that.getTransaction_number()) && Objects.equals(getTransaction_type(), that.getTransaction_type()) && Objects.equals(getApproved(), that.getApproved()) && Objects.equals(getReason_for_points_allocation(), that.getReason_for_points_allocation()) && Objects.equals(getScheme_applied(), that.getScheme_applied()) && Objects.equals(getTod_allocated(), that.getTod_allocated());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTodMasterId(), getMembershipNumber(), getPoints_from_party_name(), getTransaction_date(), getTransaction_amount(), getTransaction_number(), getTransaction_type(), getApproved(), getReason_for_points_allocation(), getScheme_applied(), getTod_allocated());
    }
}
