package com.infosys.java11.objectClass;

public class EqualsAndHashCode {

    private String doorNo;
    private String street;

    public EqualsAndHashCode(String doorNo, String street){
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
    public boolean equals(Object address){
        EqualsAndHashCode otherAddress = (EqualsAndHashCode) address;
        if(this.doorNo.equals(otherAddress.doorNo) && this.street.equals(otherAddress.street)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        return 1+doorNo.hashCode()+street.hashCode();
    }
}

class Tester2 {
    public static void main(String[] args) {
        EqualsAndHashCode address = new EqualsAndHashCode("11","Oxford Street");
        EqualsAndHashCode addressOne = new EqualsAndHashCode("11","Oxford Street");

        // Checking the equality of two object using == operator
        if(address.equals(addressOne) ){
            System.out.println("The address objects are same.");
        } else{
            System.out.println("The address objects are different.");
        }


    }
}
