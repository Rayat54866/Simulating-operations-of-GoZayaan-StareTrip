package com.example.demo54;

public class Country_Visa_Count {
    private String countryName;
    private int visaCount;

    public Country_Visa_Count(String countryName, int visaCount) {
        this.countryName = countryName;
        this.visaCount = visaCount;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getVisaCount() {
        return visaCount;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setVisaCount(int visaCount) {
        this.visaCount = visaCount;
    }

}
