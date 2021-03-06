package com.raizlabs.android.databasecomparison.greendao.gen;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table SIMPLE_ADDRESS_ITEM.
 */
public class SimpleAddressItem {

    private Long id;
    private String name;
    private String address;
    private String city;
    private String state;
    private Long phone;

    public SimpleAddressItem() {
    }

    public SimpleAddressItem(Long id) {
        this.id = id;
    }

    public SimpleAddressItem(Long id, String name, String address, String city, String state, Long phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

}
