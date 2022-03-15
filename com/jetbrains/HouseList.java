package com.jetbrains;

public class HouseList {
    String houseName,ownerName;
    int rent,id;
    void addHome(String houseName,String ownerName,int rent,int id){
        this.id = id;
        this.houseName=houseName;
        this.ownerName=ownerName;
        this.rent=rent;
    }
    String getHouseName(){
        return houseName;
    }
    String getOwnerName(){
        return ownerName;
    }
    int getRent(){
        return rent;
    }
    int getId(){
        return id;
    }

}
