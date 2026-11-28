package com.example.demo54;

public class Visa_Type_Count {
    private String visaType;
    private int countryCount;

    public Visa_Type_Count(int countryCount, String visaType) {
        this.countryCount = countryCount;
        this.visaType = visaType;
    }

    public String getVisaType() {
        return visaType;
    }

    public void setVisaType(String visaType) {
        this.visaType = visaType;
    }

    public int getCountryCount() {
        return countryCount;
    }

    public void setCountryCount(int countryCount) {
        this.countryCount = countryCount;
    }
}
