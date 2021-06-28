package com.loyalty.loyaltyapplication.util;

import lombok.Data;

import java.util.Objects;

@Data
public class ResponseObject {
    public String message;

    public ResponseObject(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResponseObject)) return false;
        ResponseObject that = (ResponseObject) o;
        return Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }
}
