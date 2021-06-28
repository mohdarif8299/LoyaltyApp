package com.loyalty.loyaltyapplication.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Data
@Entity
@Table(name = "points_master_ledger")
public class PointsMasterLedger {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "points_master_id")
    private Integer pointsMasterId;
    @Column(name = "membership_number")
    private String membership_number;
    @Column(name = "points_from_party_name")
    private String points_from_party_name;
    @Column(name = "transaction_date")
    private String transaction_date;
    @Column(name = "transaction_amount")
    private Double transaction_amount;
    @Column(name = "transaction_number")
    private String transaction_number;
    @Column(name = "transaction_type")
    private String transaction_type;
    @Column(name = "reason_for_points_allocation")
    private String reason_for_points_allocation;
    @Column(name = "approved")
    private String approved;
    @Column(name = "scheme_applied")
    private String scheme_applied;
    @Column(name = "point_allocated")
    private Integer point_allocated;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PointsMasterLedger)) return false;
        PointsMasterLedger that = (PointsMasterLedger) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getPointsMasterId(), that.getPointsMasterId()) && Objects.equals(getMembership_number(), that.getMembership_number()) && Objects.equals(getPoints_from_party_name(), that.getPoints_from_party_name()) && Objects.equals(getTransaction_date(), that.getTransaction_date()) && Objects.equals(getTransaction_amount(), that.getTransaction_amount()) && Objects.equals(getTransaction_number(), that.getTransaction_number()) && Objects.equals(getTransaction_type(), that.getTransaction_type()) && Objects.equals(getReason_for_points_allocation(), that.getReason_for_points_allocation()) && Objects.equals(getApproved(), that.getApproved()) && Objects.equals(getScheme_applied(), that.getScheme_applied()) && Objects.equals(getPoint_allocated(), that.getPoint_allocated());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPointsMasterId(), getMembership_number(), getPoints_from_party_name(), getTransaction_date(), getTransaction_amount(), getTransaction_number(), getTransaction_type(), getReason_for_points_allocation(), getApproved(), getScheme_applied(), getPoint_allocated());
    }
}
