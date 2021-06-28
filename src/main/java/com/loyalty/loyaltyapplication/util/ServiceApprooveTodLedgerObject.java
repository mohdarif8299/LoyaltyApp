package com.loyalty.loyaltyapplication.util;

import lombok.Data;

import java.util.Objects;

@Data
public class ServiceApprooveTodLedgerObject {
    public Object scheme_applied;
    public Integer tod_master_id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ServiceApprooveTodLedgerObject)) return false;
        ServiceApprooveTodLedgerObject that = (ServiceApprooveTodLedgerObject) o;
        return Objects.equals(getScheme_applied(), that.getScheme_applied()) && Objects.equals(getTod_master_id(), that.getTod_master_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getScheme_applied(), getTod_master_id());
    }
}
