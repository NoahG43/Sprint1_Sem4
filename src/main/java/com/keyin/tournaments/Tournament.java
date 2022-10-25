package com.keyin.tournaments;

public class Tournament {
//added name to access tournament easier
//added id field since data is to be in mock-up db
    private int id;
    private String name;
    private String startDate;
    private String endDate;
    private String location;
    private double entryFee;
    private double cashPrize;
    private String members;
    private String finalStandings;

    public Tournament(){
        this.name = "";
        this.startDate = "";
        this.endDate = "";
        this.location = "";
        this.entryFee = 0.00;
        this.cashPrize = 0.00;
        this.members = "";
        this.finalStandings = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    public String getFinalStandings() {
        return finalStandings;
    }

    public void setFinalStandings(String finalStandings) {
        this.finalStandings = finalStandings;
    }

    public Tournament(int id,String name, String startDate, String endDate, String location, double entryFee,
                      double cashPrize, String members, String finalStandings){
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.entryFee = entryFee;
        this.cashPrize = cashPrize;
        this.members = members;
        this.finalStandings = finalStandings;



    }
}
