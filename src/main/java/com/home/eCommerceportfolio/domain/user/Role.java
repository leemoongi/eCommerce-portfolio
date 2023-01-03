package com.home.eCommerceportfolio.domain.user;

public enum Role {
    ROLE_FREE_USER("ROLE_FREE_USER"),
    ROLE_LOGIN_USER("LOGIN_USER");

    String role;

    Role(String role) {
        this.role = role;
    }

    public String value() {
        return role;
    }
}
