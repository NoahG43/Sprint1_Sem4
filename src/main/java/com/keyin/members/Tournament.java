// Tournament class

package com.keyin.members;

public class Tournament {

    private String tourName;
    private String startDate;
    private String endDate;
    private String location;
    private double entryFee;
    private double cashPrize;
    private Member members;
    private String finalStandings;

    public String getTourName() {
        return tourName;
    }

    public void setTourName() { this.tourName = tourName; }
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(double entryFee) {
        this.entryFee = entryFee;
    }

    public double getCashPrize() {
        return cashPrize;
    }

    public void setCashPrize(double cashPrize) {
        this.cashPrize = cashPrize;
    }

    public Member getMembers() {
        return members;
    }

    public void setMembers(Member members) {
        this.members = members;
    }

    public String getFinalStandings() {
        return finalStandings;
    }

    public void setFinalStandings(String finalStandings) {
        this.finalStandings = finalStandings;
    }

    public String toString(){
        return ("Tournament Name: " + tourName +
                "Start Date: " + startDate +
                "End Date: " + endDate +
                "Location: " + location +
                "Entry Fee: " + entryFee +
                "Cash Prize: " + cashPrize +
                "Members: " + members +
                "Final Standings: " + finalStandings);
    }
}
