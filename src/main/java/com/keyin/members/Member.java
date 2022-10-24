package com.keyin.members;

public class Member {
    private String name;
    private String address;
    private String email;
    private String phone;
    private String startDate;
    private String duration;
    private String memberType;
    private String currentTour;
    private String pastTour;
    private String futureTour;


    public Member(){
        this.name = "";
        this.address = "";
        this.email = "";
        this.phone = "";
        this.startDate = "";
        this.duration = "";
        this.memberType = "";
        this.currentTour = "";
        this.pastTour = "";
        this.futureTour = "";
    }

    public Member(String name, String address, String email, String phone, String startDate,
                  String duration, String memberType, String currentTour, String pastTour,
                  String futureTour){
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.startDate = startDate;
        this.duration = duration;
        this.memberType = memberType;
        this.currentTour = currentTour;
        this.pastTour = pastTour;
        this.futureTour = futureTour;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getCurrentTour() {
        return currentTour;
    }

    public void setCurrentTour(String currentTour) {
        this.currentTour = currentTour;
    }

    public String getPastTour() {
        return pastTour;
    }

    public void setPastTour(String pastTour) {
        this.pastTour = pastTour;
    }

    public String getFutureTour() {
        return futureTour;
    }

    public void setFutureTour(String futureTour) {
        this.futureTour = futureTour;
    }
}
