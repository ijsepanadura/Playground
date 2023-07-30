public class Demo6_d {
    public static void main(String args[]){

        String item1 = "Apples";
        int quantity1 = 5;
        float price1 = 0.99f;
        String item2 = "Oranges";
        int quantity2 = 10;
        float price2 = 1.49f;
        

        String blackB = "\033[40m";     //  background black color
        String orangeF = "\033[33;1m";  // font orange color
        String greenF = "\033[32m";  // font green color
        String whiteF = "\033[97m";  // font white color
        String whiteTF = "\033[97m";
        String blueF = "\033[34m";  // font blue color
        String magenF = "\033[35m";  // font magenta color

        System.out.printf("%s",blackB);
        System.out.printf("%s+%s+%2$s+%s+\n",orangeF,"-".repeat(10),"-".repeat(6));
        System.out.printf("|%s%-10S%s|%1$s%-10S%3$s|%1$s%-6S%3$s|\n",whiteTF," item",orangeF," quantity"," price");
        System.out.printf("%s+%s+%2$s+%s+\n",orangeF,"-".repeat(10),"-".repeat(6));
        System.out.printf("|%s%-10s%s|%s%9d%3$s | %s$%s%4.2f%3$s|\n",whiteF,item1,orangeF,blueF,quantity1,greenF,magenF,price1);
        System.out.printf("|%s%-10s%s|%s%9d%3$s | %s$%s%4.2f%3$s|\n",whiteF,item2,orangeF,blueF,quantity2,greenF,magenF,price2);
        System.out.printf("%s+%s+%2$s+%s+\n",orangeF,"-".repeat(10),"-".repeat(6));
    }
    
}
