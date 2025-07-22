public class rec_string {
    public static void main(String[] args) {
        //skipa("", "babagggada");
        //System.out.println(skip1("babagggada"));
        System.out.println(skipapple("badaapplebhaiappravii"));
    }
    static void skipa(String p , String up){
    if(up.isEmpty()){
            System.out.println(p);
           return;
    }
    char ch = up.charAt(0);

    if(ch == 'a'){
        skipa(p, up.substring(1));
    }
    else{
        skipa(p+ ch, up.substring(1));
    }
 }

 static String skip1( String up){
    if(up.isEmpty()){
            
           return " "; 
    }
    char ch = up.charAt(0);

    if(ch == 'a'){
        return skip1(up.substring(1));
    }
    else{
        return ch+ skip1( up.substring(1));
    }
 }
 static String skipapple(String up){
    if(up.isEmpty()){
            //System.out.println(p);
           return " ";
    }
    //char ch = up.charAt(0);

    if(up.startsWith("app")){
            if(up.startsWith("apple")){
                return skipapple(up.substring(5));
            }
        return skipapple(up.substring(3));
    }
    /*same if case as skip app if it is not apple
     if(up.startsWith("app") && ! up.startsWith("apple")){
         return skipapple(up.substring(3));
         
     }
     */
    else{
        return up.charAt(0)+skipapple(up.substring(1));
    }
 }
}
