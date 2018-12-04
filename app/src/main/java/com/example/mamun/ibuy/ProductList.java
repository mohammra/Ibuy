package com.example.mamun.ibuy;

import java.util.ArrayList;

public class ProductList {

    private ArrayList<President> presidentName=new ArrayList<>();
    private static PresidentList presidentList=new PresidentList();
    private PresidentList() {

    }

    public static PresidentList getPresidentList() {
        return presidentList;
    }


    public void addPresident(String name,int startingYear, int finishingYear,String country){
        this.presidentName.add(new President(name,startingYear,finishingYear,country));
    }

    public President getPresident(int i){
        return this.presidentName.get(i);
    }

    public ArrayList<String> getAllPresident(){
        ArrayList<String> nameList=new ArrayList<>();
        for(President president: presidentName){
            nameList.add(president.getName());
        }
        return nameList;

    }

}
}
