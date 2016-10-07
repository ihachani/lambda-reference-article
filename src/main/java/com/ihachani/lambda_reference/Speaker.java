package com.ihachani.lambda_reference;

public class Speaker {
    private Speech speech;

    public Speaker(Speech speech) {
        this.speech = speech;
    }

    public void talk() {
        speech.speak("A speech");
    }
}
