package com._02.DI;

public class SetterInjection {
    IOutputGenerator outputGenerator;

    public void setOutputGenerator(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }
}
