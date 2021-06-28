package com.loyalty.loyaltyapplication.dto;

import lombok.Data;

import java.util.Objects;

@Data
public class SubscribedEntityDetailsDto {

    public Integer id;
    public String entity_name;
    public String entity_logo_url;
    public String address;
    public String country;
    public String provice_state;
    public String city;
    public String registered_since;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SubscribedEntityDetailsDto)) return false;
        SubscribedEntityDetailsDto that = (SubscribedEntityDetailsDto) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getEntity_name(), that.getEntity_name()) && Objects.equals(getEntity_logo_url(), that.getEntity_logo_url()) && Objects.equals(getAddress(), that.getAddress()) && Objects.equals(getCountry(), that.getCountry()) && Objects.equals(getProvice_state(), that.getProvice_state()) && Objects.equals(getCity(), that.getCity()) && Objects.equals(getRegistered_since(), that.getRegistered_since());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEntity_name(), getEntity_logo_url(), getAddress(), getCountry(), getProvice_state(), getCity(), getRegistered_since());
    }
}
