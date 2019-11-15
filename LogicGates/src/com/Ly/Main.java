package com.Ly;

public class Main {

    public static void main(String[] args) {
	    Gates AND1 = new AND(false, false);
        Gates AND2 = new AND(true, true);
        Gates OR1 = new OR(false, false);

        OR1.connectAGates(AND1);
        OR1.connectBGates(AND2);

        System.out.println(OR1.output());
    }
}
