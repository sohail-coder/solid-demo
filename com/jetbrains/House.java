package com.jetbrains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class House {

    String address ;
    Map<String, ArrayList<HouseList> > ll = new HashMap<String,ArrayList<HouseList>>();
    ArrayList<HouseList> list1 = new ArrayList<>();
    ArrayList<HouseList> list2 = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    void addHome(){
        HouseList[] arr = new HouseList[8];


        arr[0] = new HouseList();
        arr[0].addHome("Residence one","owner1",4000, 1);
        list1.add(arr[0]);
        arr[1] = new HouseList();
        arr[1].addHome("Residence 2","owner 2",5000, 2);
        list1.add(arr[1]);
        arr[2] = new HouseList();
        arr[2].addHome("Residence 3","owner 3",3000, 3);
        list1.add(arr[2]);
        arr[3] = new HouseList();
        arr[3].addHome("Residence 4","owner 4",9000, 4);
        list1.add(arr[3]);


        arr[4] = new HouseList();
        arr[4].addHome("Residence a","owner a",9000, 1);
        list2.add(arr[4]);
        arr[5] = new HouseList();
        arr[5].addHome("Residence b","owner b",3000, 2);
        list2.add(arr[5]);
        arr[6] = new HouseList();
        arr[6].addHome("Residence c","owner c",5000, 3);
        list2.add(arr[6]);


        ll.put("khammam",list1);
        ll.put("wyra",list2);
    }

    int showHouse(String address) {
        System.out.println("Entered Location is : "+address);
        boolean addressFlag = false;
        for(Map.Entry<String, ArrayList<HouseList>> entry : ll.entrySet()){
            if(entry.getKey().equals(address)){
                addressFlag = true;
                System.out.println("Below are the list of houses :");
                for(HouseList houseList : entry.getValue()){
                    System.out.println("Id: "+houseList.getId()+"\nHome Name: "+houseList.getHouseName()+"\nOwner Name: "+houseList.getOwnerName()+"\nRent is: "+houseList.getRent());
                    System.out.println();
                }
            }
        }
        if(addressFlag==false){
            System.out.println("Invlaid address....\nExiting");
            System.exit(1);
        }

        int option,cost=0;
        System.out.print("Enter the home id: ");
        option = scanner.nextInt();
            boolean idFlag=false;
        for(Map.Entry<String, ArrayList<HouseList>> entry : ll.entrySet()){

            if(entry.getKey().equals(address)){
                for(HouseList houseList : entry.getValue()){
                    if(houseList.getId()==option) {
                        System.out.println("Id: " + houseList.getId() + "\nHome Name: " + houseList.getHouseName() + "\nOwner Name: " + houseList.getOwnerName() + "\nRent is: " + houseList.getRent());
                        System.out.println("This house is selected");
                        System.out.println();
                        cost = houseList.getRent();
                        idFlag = true;
                    }
                }
            }
        }

        System.out.println();
        return cost;
    }


//    boolean getDiary(){
//        return true;
//    }
//    boolean getWatchMan(){
//        return false;
//    }
//    boolean getPlumber(){
//        return true;
//    }


//
//    @Override
//    public boolean getDiaryService() {
//        return true;
//    }
//
//    @Override
//    public boolean getWatchManService() {
//        return true;
//    }
//
//    @Override
//    public boolean getPlumberService() {
//        return true;
//    }
}
