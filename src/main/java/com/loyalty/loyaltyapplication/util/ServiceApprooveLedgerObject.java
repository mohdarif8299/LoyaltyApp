package com.loyalty.loyaltyapplication.util;

import lombok.Data;

import java.util.Objects;

@Data
public class ServiceApprooveLedgerObject {
    public Object scheme_applied;
    public Integer points_master_id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ServiceApprooveLedgerObject)) return false;
        ServiceApprooveLedgerObject that = (ServiceApprooveLedgerObject) o;
        return Objects.equals(getScheme_applied(), that.getScheme_applied()) && Objects.equals(getPoints_master_id(), that.getPoints_master_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getScheme_applied(), getPoints_master_id());
    }
}
