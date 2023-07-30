public class Demo5 {
    public static void main(String args[]){
        
        int num1 = 978;
        int num2 = 3;
        int num3 = 16;
        int num4 = 1484100;

        String defC   = "\033[30;2m"; // default color
        String color1 = "\033[31;2m"; // color key
        String color2 = "\033[32;2m";
        String color3 = "\033[33;2m";
        String color4 = "\033[34;2m";

        String dash = "-";
        String form = "%s%d%s%s"; //place holder key

        System.out.print("ISBN Number is : ");
        System.out.printf(form,color1,num1,defC,dash);
        System.out.printf(form,color2,num2,defC,dash);
        System.out.printf(form,color3,num3,defC,dash);
        System.out.printf("%s%d\n",color4,num4);
    }
    
}
