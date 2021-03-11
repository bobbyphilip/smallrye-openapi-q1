package org.acme;

import javax.json.bind.annotation.JsonbProperty;

public class Greet {

    private String greetingText;

    public Greet() {

    }

    // @JsonbProperty(value = "greetingText")
    public String getGreetingText() {
        return greetingText;
    }

    @JsonbProperty(value = "externalServiceText")
    public void setGreetingText(String greetingText) {
        this.greetingText = greetingText;
    }

}
