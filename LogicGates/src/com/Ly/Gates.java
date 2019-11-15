package com.Ly;

public interface Gates {
    boolean output();
    boolean getInputa();
    boolean getInputb();
    boolean getInputc();
    boolean getInputd();
    void connectAGates(Gates gate);
    void connectBGates(Gates gate);
    void connectCGates(Gates gate);
    void connectDGates(Gates gate);
}
