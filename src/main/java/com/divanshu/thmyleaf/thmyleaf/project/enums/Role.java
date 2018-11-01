package com.divanshu.thmyleaf.thmyleaf.project.enums;

public enum  Role {

    SUPER_ADMIN("Super Admin"),
    ADMIN("Admin"),
    USER("User");

    String value;

    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
