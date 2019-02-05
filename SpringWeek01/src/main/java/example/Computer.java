package example;

public class Computer {
    private Keyword keyword;

   /* public Computer() {
        //bu sekilde direk gobekten bagli oldu
        keyword=new Keyword();


    }*/
    //daha esnek
    public Computer(Keyword keyword) {
        this.keyword = keyword;
    }
}

class Keyword{

}
