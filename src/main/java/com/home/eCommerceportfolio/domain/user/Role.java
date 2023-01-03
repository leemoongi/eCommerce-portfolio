package com.home.eCommerceportfolio.domain.user;

public enum Role {
    FREE_USER("FREE_USER"),
    LOGIN_USER("LOGIN_USER");

    String role;

    Role(String role) {
        this.role = role;
    }

    public String value() {
        return role;
    }
}
