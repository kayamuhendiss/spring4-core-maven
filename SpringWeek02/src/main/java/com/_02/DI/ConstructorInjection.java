package com._02.DI;

public class ConstructorInjection {

        IOutputGenerator outputGenerator;

        ConstructorInjection(IOutputGenerator outputGenerator){
            this.outputGenerator = outputGenerator;
        }

}
class IOutputGenerator{


}
