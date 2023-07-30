public class Demo4 {
    public static void main(String args[]){

        int day = 28;
        int month = 12;
        int year = 2023;
        int hour = 23;
        int minute = 59;
        int second = 59;

        String defC   = "\033[30;2m"; //default color
        String color1 = "\033[31;2m"; // colors key
        String color2 = "\033[32;2m";
        String color3 = "\033[33;2m";
        String color4 = "\033[34;2m";
        String color5 = "\033[35;2m";
        String color6 = "\033[36;2m";

        String sep1 = "/"; // declare a separartor
        String sep2 = ":";

        System.out.printf("%s%d%s%s",color1,month,defC,sep1);
        System.out.printf("%s%d%s%s",color2,day,defC,sep1);
        System.out.printf("%s%d ",color3,year);
        System.out.printf("%s%d%s%s",color4,hour,defC,sep2);
        System.out.printf("%s%d%s%s",color5,minute,defC,sep2);
        System.out.printf("%s%d\n",color6,second);


        
    }
}
