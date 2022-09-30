package com.infosys.java11.objectClass;

public class AddresstoString {
    private String doorNo;
    private String street;

    public AddresstoString(String doorNo, String street){
        this.doorNo = doorNo;
        this.street = street;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString(){
        return "Address\nDoor No: "+doorNo+"\nStreet: "+street;
    }
}

class Tester {
    public static void main(String[] args) {
        AddresstoString address = new AddresstoString("11","Oxford Street");
        AddresstoString addressOne = new AddresstoString("11","Oxford Street");

        System.out.println();
        System.out.println("Address details of address");
        System.out.println(address);

        // Checking the equality of two object using == operator
        if(address == addressOne){
            System.out.println("The address objects are equals.");
        } else{
            System.out.println("The address objects are different.");
        }


    }
}
