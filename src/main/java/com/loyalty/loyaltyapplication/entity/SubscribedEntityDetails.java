package com.loyalty.loyaltyapplication.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Data
@Entity
@Table(name = "subscribed_entity_details")
public class SubscribedEntityDetails {
    @Id
    @Column(name = "id")
    public Integer id;
    @Column(name = "entity_name")
    public String entittod_mastery_name;
    @Column(name = "entity_logo_url")
    public String entity_logo_url;
    @Column(name = "address")
    public String address;
    @Column(name = "country")
    public String country;
    @Column(name = "provice_state")
    public String provice_state;
    @Column(name = "city")
    public String city;
    @Column(name = "registered_since")
    public String registered_since;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SubscribedEntityDetails)) return false;
        SubscribedEntityDetails that = (SubscribedEntityDetails) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getEntittod_mastery_name(), that.getEntittod_mastery_name()) && Objects.equals(getEntity_logo_url(), that.getEntity_logo_url()) && Objects.equals(getAddress(), that.getAddress()) && Objects.equals(getCountry(), that.getCountry()) && Objects.equals(getProvice_state(), that.getProvice_state()) && Objects.equals(getCity(), that.getCity()) && Objects.equals(getRegistered_since(), that.getRegistered_since());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEntittod_mastery_name(), getEntity_logo_url(), getAddress(), getCountry(), getProvice_state(), getCity(), getRegistered_since());
    }
}
