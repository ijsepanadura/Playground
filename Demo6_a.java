public class Demo6_a{
    public static void main(String args[]){

        String redB  = "\033[101m";   // background red color
        String greenB = "\033[42m";   // background green color
        String defB = "\033[49m";     //  background black color
         

    
        System.out.printf(redB);
        System.out.printf("[%10d",5);
        System.out.printf(greenB);
        System.out.printf("%-10s]\n%s","0%",defB);
        
    }
    
}
