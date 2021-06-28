package com.loyalty.loyaltyapplication.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Data
@Entity
@Table(name = "membership_number_master")
public class MembershipNumberMaster {
    @Id
    @Column(name = "id")
    public Integer id;
    @Column(name = "membership_number")
    public String membership_number;
    @Column(name = "entity_used_for")
    public String entity_used_for;
    @Column(name = "subscribed_entity_details_id")
    public Integer subscribed_entity_details_id;
    @Column(name = "membership_type")
    public String membership_type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MembershipNumberMaster)) return false;
        MembershipNumberMaster that = (MembershipNumberMaster) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getMembership_number(), that.getMembership_number()) && Objects.equals(getEntity_used_for(), that.getEntity_used_for()) && Objects.equals(getSubscribed_entity_details_id(), that.getSubscribed_entity_details_id()) && Objects.equals(getMembership_type(), that.getMembership_type());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMembership_number(), getEntity_used_for(), getSubscribed_entity_details_id(), getMembership_type());
    }
}
