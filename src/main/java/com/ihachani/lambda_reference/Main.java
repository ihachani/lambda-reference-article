package com.ihachani.lambda_reference;

public class Main {

    public static void main(String[] argv) {
        oldWay();
    }


    public static void oldWay() {
        Speaker speaker = new Speaker(new Speech() {
            public void speak(String speech) {
                System.out.println("Introduction " + speech);
            }
        });
        speaker.talk();
    }


}
