package com.agapovp.springtheripper;

import com.agapovp.springtheripper.quoters.Quoter;
import com.agapovp.springtheripper.quoters.TerminatorQuoter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    }
}
