package com.loyalty.loyaltyapplication.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Data
@Entity
@Table(name = "points_master")
public class PointsMaster {
    @Id
    @Column(name = "id")
    public Integer id;
    @Column(name = "membership_number")
    public String membershipNumber;
    @Column(name = "party_name")
    public String party_name;
    @Column(name = "transaction_amt_till_date")
    public Double transaction_amt_till_date;
    @Column(name = "currency_type")
    public String currency_type;
    @Column(name = "total_points_issued_till_date")
    public Integer total_points_issued_till_date;
    @Column(name = "amount_paid_till_date")
    public Double amount_paid_till_date;
    @Column(name = "total_points_claimed_till_date")
    public Integer total_points_claimed_till_date;
    @Column(name = "balance_points")
    public Integer balance_points;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PointsMaster)) return false;
        PointsMaster that = (PointsMaster) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getMembershipNumber(), that.getMembershipNumber()) && Objects.equals(getParty_name(), that.getParty_name()) && Objects.equals(getTransaction_amt_till_date(), that.getTransaction_amt_till_date()) && Objects.equals(getCurrency_type(), that.getCurrency_type()) && Objects.equals(getTotal_points_issued_till_date(), that.getTotal_points_issued_till_date()) && Objects.equals(getAmount_paid_till_date(), that.getAmount_paid_till_date()) && Objects.equals(getTotal_points_claimed_till_date(), that.getTotal_points_claimed_till_date()) && Objects.equals(getBalance_points(), that.getBalance_points());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMembershipNumber(), getParty_name(), getTransaction_amt_till_date(), getCurrency_type(), getTotal_points_issued_till_date(), getAmount_paid_till_date(), getTotal_points_claimed_till_date(), getBalance_points());
    }
}
