package com.loyalty.loyaltyapplication.util;

public class UniqueNumberGenerator {
    public static String number() {
        String S = System.nanoTime() + "";
        return S.substring(0, 12);
    }
}
