class computer{
    public void playmusic(){
        // when we use void we didnt expect any thing in return but 
        // it may give u the result in int , and anyother datatype
        System.out.println("playing music");
    }
    public String getmeapen(int money){
        // the returning datatype should me mentioned before method_name
        if(money >= 10) return "pen";
        return "nothing";
    }
}

public class methods {
    public static void main(String[] args) {
        computer obj = new computer();
        obj.playmusic();
        //obj.getmeapen(10);
        // if u call like this u didnt get output bcz above gmeapen returning a string 
        // value so u have to store the value in another variable and get print
        String sc =  obj.getmeapen(8);
        System.out.println(sc);
    }
}
