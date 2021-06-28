package com.loyalty.loyaltyapplication.util;

import com.loyalty.loyaltyapplication.entity.MemberCompanyMaster;
import lombok.Data;

import java.util.Objects;

@Data
public class RegisterMemberCompanyMasterObject {

    public Integer id;
    public MemberCompanyMaster memberCompanyMaster;
    public Integer subscribe_entity_details_id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegisterMemberCompanyMasterObject)) return false;
        RegisterMemberCompanyMasterObject that = (RegisterMemberCompanyMasterObject) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getMemberCompanyMaster(), that.getMemberCompanyMaster()) && Objects.equals(getSubscribe_entity_details_id(), that.getSubscribe_entity_details_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMemberCompanyMaster(), getSubscribe_entity_details_id());
    }
}
