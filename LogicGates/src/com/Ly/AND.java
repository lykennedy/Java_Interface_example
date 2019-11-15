package com.Ly;

public class AND implements Gates {

    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean output;
    private int type;

    public AND(boolean a, boolean b)
    {
        this(a,b,false);
        type = 0;
    }

    public AND(boolean a, boolean b, boolean c)
    {
        this(a,b,c,false);
        type = 1;
    }

    public AND(boolean a, boolean b, boolean c, boolean d)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        type = 2;
    }

    public boolean getInputa()
    {
        return this.a;
    }

    public boolean getInputb()
    {
        return this.b;
    }

    public boolean getInputc()
    {
        return this.c;
    }

    public boolean getInputd()
    {
        return this.d;
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

    public boolean getOutput() {
        return this.output;
    }

    public boolean output()
    {
        if (this.type == 0)
        {
            this.output = this.a & this.b;
            return getOutput();
        }
        else if(this.type == 1)
        {
            this.output =  this.a & this.b & this.c;
            return getOutput();
        }
        else
            {
                this.output = this.a & this.b & this.c & this.d;
                return getOutput();
            }
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
