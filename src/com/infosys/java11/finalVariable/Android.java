package com.infosys.java11.finalVariable;

// Final Method
public class Android {
    final void ringtone(){
        System.out.println("Mobile phone is ringing.");
    }
}

class Samsung extends Android{
//    @Override
//    void ringtone(){
//        System.out.println("Samsung is ringing.");
//    }
}

class Tester1{
    public static void main(String[] args) {
        Android obj = new Android();
        obj.ringtone(); // will invoke the method in parent

        Samsung obj2 = new Samsung();
        obj2.ringtone(); // cant invoke ringtone() from child class as
                         // the parent class has ,arked it final
    }
}
