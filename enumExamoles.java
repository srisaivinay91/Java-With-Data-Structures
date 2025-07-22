import java.util.*;


public class enumExamoles {
    enum Week{
        Monday,TuesdaY,Wednesday,Thursday,Friday,Saturday,Sunday

    // These are enum constants
    // publc , Static and final 
    // Since it is final we can create nums
    // The Type is week

        Week(){
             System.out.println("Constructor called for"+ this);
             // This is not protected or public , and it is private and default 
             // why? we dont want to Create new objects
             
        }
    }
    

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        for(Week day : Week.values() ){
            System.out.println(day);
        }
    }
}
