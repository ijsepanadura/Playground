public class Demo6_c {
    public static void main(String args[]){

        String city1 = " Los Angeles";
        String state1 = " California";
        int pop1 = 3966936;
        String city2a = " new";
        String city2b = " York";
        int pop2 = 8336817;
        

        String blackB = "\033[40m";     //  background black color
        String orangeF = "\033[33;1m";  // font orange color
        String greenF = "\033[32m";  // font green color
        String whiteF = "\033[97m";  // font blue color
        String whiteTF = "\033[97m";
        String magenF = "\033[35m";  // font magenta color

        System.out.printf("%s",blackB);
        System.out.printf("%s+%s+%s+%3$s+\n",orangeF,"-".repeat(15),"-".repeat(12));
        System.out.printf("|%s%-15s%s|%1$s%-12s%3$s|%1$s%-12s%3$s|\n",whiteTF," CITY",orangeF," STATE"," POPULATION");
        System.out.printf("%s+%s+%s+%3$s+\n",orangeF,"-".repeat(15),"-".repeat(12));
        System.out.printf("|%s%-15s%s|%1$s%-12s%3$s|%s% -,12d%3$s|\n",whiteF,city1,orangeF,state1,magenF,pop1);
        System.out.printf("|%s%-4s%s%-11s%s|%1$s%2$-4s%3$s%4$-8s%5$s|%s% -,12d%3$s|\n",greenF,city2a,whiteF,city2b,orangeF,magenF,pop2);
        System.out.printf("%s+%s+%s+%3$s+\n",orangeF,"-".repeat(15),"-".repeat(12));
        //System.out.printf("");
    }



    
}
