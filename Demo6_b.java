public class Demo6_b {
    public static void main(String args[]){

        String name1 = "Alice", name2 = "Bob";
        int age1 = 24 , age2 = 30;
        

        String blackB = "\033[40m";     //  background black color
        String orangeF = "\033[33;1m";  // font orange color
        String blueF = "\033[34;1m";  // font blue color
        String whiteF = "\033[97m";  // font blue color
        String magenF = "\033[35m";  // font magenta color

        System.out.printf("%s",blackB);
        System.out.printf("%s+%s+%s+\n",orangeF,"-".repeat(15),"-".repeat(5));
        System.out.printf("|%s%-15s%s|%s%5s%s|\n",blueF," NAME",orangeF,blueF,"AGE ",orangeF);
        System.out.printf("%s+%15s+%5s+\n",orangeF,"-".repeat(15),"-".repeat(5));
        System.out.printf("| %s%-14s%s|%s%4s%s |\n",whiteF,name1,orangeF,magenF,age1,orangeF);
        System.out.printf("| %s%-14s%s|%s%4s%s |\n",whiteF,name2,orangeF,magenF,age2,orangeF);
        System.out.printf("%s+%s+%s+\n",orangeF,"-".repeat(15),"-".repeat(5));
    }
    
}
