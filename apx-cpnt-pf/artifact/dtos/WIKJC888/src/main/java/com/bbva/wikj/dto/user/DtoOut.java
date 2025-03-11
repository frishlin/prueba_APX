package com.bbva.wikj.dto.user;

public class DtoOut {
    private Long id;
    private int nuip;
    private String fullname;
    private String phone;
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNuip() {
        return nuip;
    }

    public void setNuip(int nuip) {
        this.nuip = nuip;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
