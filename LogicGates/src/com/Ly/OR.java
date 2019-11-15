package com.Ly;

public class OR implements Gates {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean output;
    private int type;

    public OR(boolean a, boolean b) {
        this(a,b,false);
        type = 0;
    }

    public OR(boolean a, boolean b, boolean c) {
        this(a,b,c,false);
        type = 1;
    }

    public OR(boolean a, boolean b, boolean c, boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        type = 2;
    }

    @Override
    public boolean output() {
        if (type == 0)
        {
            this.output = this.a | this.b;
            return getOutput();
        }
        else if(type == 1)
        {
            this.output = this.a | this.b | this.c;
            return getOutput();
        }else
            {
                this.output = this.a | this.b | this.c | this.d;
                return getOutput();
            }
    }

    @Override
    public boolean getInputa() {
        return this.a;
    }

    @Override
    public boolean getInputb() {
        return false;
    }

    @Override
    public boolean getInputc() {
        return false;
    }

    @Override
    public boolean getInputd() {
        return false;
    }


    public boolean getOutput()
    {
        return this.output;
    }

    public void setA(boolean a) {
        this.a = a;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public void setC(boolean c) {
        this.c = c;
    }

    public void setD(boolean d) {
        this.d = d;
    }

    public void connectAGates(Gates gate)
    {
        setA(gate.output());
    }

    public void connectBGates(Gates gate)
    {
        setB(gate.output());
    }

    public void connectCGates(Gates gate)
    {
        setC(gate.output());
    }

    public void connectDGates(Gates gate)
    {
        setD(gate.output());
    }

}
