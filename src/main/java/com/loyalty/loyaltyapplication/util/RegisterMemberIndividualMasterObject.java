package com.loyalty.loyaltyapplication.util;

import com.loyalty.loyaltyapplication.entity.MemberIndividualMaster;
import lombok.Data;

import java.util.Objects;

@Data
public class RegisterMemberIndividualMasterObject {

    public Integer id;
    public MemberIndividualMaster memberIndividualMaster;
    public Integer subscribe_entity_details_id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegisterMemberIndividualMasterObject)) return false;
        RegisterMemberIndividualMasterObject that = (RegisterMemberIndividualMasterObject) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getMemberIndividualMaster(), that.getMemberIndividualMaster()) && Objects.equals(getSubscribe_entity_details_id(), that.getSubscribe_entity_details_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMemberIndividualMaster(), getSubscribe_entity_details_id());
    }
}
