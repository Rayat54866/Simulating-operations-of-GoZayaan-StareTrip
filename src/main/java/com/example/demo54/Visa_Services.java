package com.example.demo54;

public class Visa_Services {
    private String countryName, visaType, processingTime;
    private float serviceFee;
    private boolean isVisaAvailable;

    public Visa_Services(String countryName, String visaType, String processingTime, float serviceFee, boolean isVisaAvailable) {
        this.countryName = countryName;
        this.visaType = visaType;
        this.processingTime = processingTime;
        this.serviceFee = serviceFee;
        this.isVisaAvailable = isVisaAvailable;
    }

    public Visa_Services(String countryName, String visaType, String processingTime, String serviceFee) {
        this.countryName = countryName;
        this.visaType = visaType;
        this.processingTime = processingTime;
        this.serviceFee = Float.parseFloat(serviceFee);
    }

    public String getCountryName() {
        return countryName;
    }

    public String getVisaType() {
        return visaType;
    }

    public String getProcessingTime() {
        return processingTime;
    }

    public float getServiceFee() {
        return serviceFee;
    }

    public boolean getIsVisaAvailable() {
        return isVisaAvailable;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setVisaType(String visaType) {
        this.visaType = visaType;
    }

    public void setProcessingTime(String processingTime) {
        this.processingTime = processingTime;
    }

    public void setServiceFee(float serviceFee) {
        this.serviceFee = serviceFee;
    }

    public void setVisaAvailable(boolean visaAvailable) {
        isVisaAvailable = visaAvailable;
    }
}
