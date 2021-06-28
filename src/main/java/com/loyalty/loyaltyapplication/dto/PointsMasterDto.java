package com.loyalty.loyaltyapplication.dto;

import lombok.Data;

import java.util.Objects;

@Data
public class PointsMasterDto {

    public Integer id;
    public String membershipNumber;
    public String party_name;
    public Double transaction_amt_till_date;
    public String currency_type;
    public Integer total_points_issued_till_date;
    public Double amount_paid_till_date;
    public Integer total_points_claimed_till_date;
    public Integer balance_points;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PointsMasterDto)) return false;
        PointsMasterDto that = (PointsMasterDto) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getMembershipNumber(), that.getMembershipNumber()) && Objects.equals(getParty_name(), that.getParty_name()) && Objects.equals(getTransaction_amt_till_date(), that.getTransaction_amt_till_date()) && Objects.equals(getCurrency_type(), that.getCurrency_type()) && Objects.equals(getTotal_points_issued_till_date(), that.getTotal_points_issued_till_date()) && Objects.equals(getAmount_paid_till_date(), that.getAmount_paid_till_date()) && Objects.equals(getTotal_points_claimed_till_date(), that.getTotal_points_claimed_till_date()) && Objects.equals(getBalance_points(), that.getBalance_points());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMembershipNumber(), getParty_name(), getTransaction_amt_till_date(), getCurrency_type(), getTotal_points_issued_till_date(), getAmount_paid_till_date(), getTotal_points_claimed_till_date(), getBalance_points());
    }
}
