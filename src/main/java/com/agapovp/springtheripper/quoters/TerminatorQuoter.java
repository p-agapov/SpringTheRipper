package com.agapovp.springtheripper.quoters;

import lombok.Setter;

public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    @Setter
    private String message;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(String.format("message = %s", message));
        }
    }
}
