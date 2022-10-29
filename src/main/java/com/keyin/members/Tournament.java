// Worked on by Noah Gosse

package com.keyin.members;

public class Tournament {

    private String startDate;
    private String endDate;
    private String location;
    private double entryFee;
    private double cashPrize;
//declare members variable as Member obj(from member classfile)    
    private Member members;
    private String finalStandings;

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

    
/*
//parameterized tournament constructor -- may not need to be used
//creates a tournament based on the parameters given
   public Tournament(String tourName, String startDate, String endDate, String location, double entryFee,
                     double cashPrize, Member members, String finalStandings){
       this.tourName = tourName
       this.startDate = startDate;
       this.endDate = endDate;
       this.location = location;
       this.entryFee = entryFee;
       this.cashPrize = cashPrize;
       this.members = members;
       this.finalStandings = finalStandings;
   } 
*/
}
