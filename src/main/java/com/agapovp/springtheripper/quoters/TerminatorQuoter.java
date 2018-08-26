package com.agapovp.springtheripper.quoters;

import lombok.Setter;

public class TerminatorQuoter implements Quoter {

    @Setter
    private String message;

    @Override
    public void sayQuote() {
        System.out.println(String.format("message = %s", message));
    }
}
