package HelloWord;

public class HelloWord2 {
    private  String message;

    //Her sekilde calisiyor neden? Ogren!!

    public void setMessage(String message){
        this.message=message;
        System.out.println("setMessage metodunu cagirdim"+ message);
    }
    public void getMessage(){

        System.out.println("Your Message "+message);
    }

}
