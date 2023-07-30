public class DemoTask6D {
     public static void main(String[] args) {

        String reffColour1 = "\033[33m";
        String reffColour2 = "\033[37m";
        String reffColout3 = "\033[32m";
        String reffColour4 = "\033[36m";
        String reffColour5 = "\033[31m";
        
        System.out.printf("%s",reffColour1 + "+"+ "-".repeat(15)+"+"+"-".repeat(14)+"+"+"-".repeat(14)+"+" +"\n");
        System.out.printf("%1$s| %2$s ITEM %1$12s | %2$s QUANTITY %1$7s | %2$s PRICE %1$10s |\n",reffColour1,reffColour2);
        
        System.out.printf("%s",reffColour1 + "+" );
        System.out.printf("%s",reffColout3 +  "-".repeat(15)+"+");
        System.out.printf("%s",reffColour1 +"-".repeat(14)+"+");
        System.out.printf("%s",reffColout3 +"-".repeat(14)+"+" + "\n");

        System.out.printf("%1$s| %2$s Apples %1$10s | %3$s 5 %1$14s | %4$s $  %5$s 0.99 %1$7s |\n",reffColour1,reffColour2,reffColour4,reffColout3,reffColour5);
        System.out.printf("%1$s| %2$s Orenges %1$9s | %3$s 10 %1$13s | %4$s $  %5$s 1.49 %1$7s |\n",reffColour1,reffColour2,reffColour4,reffColout3,reffColour5);

        System.out.printf("%s",reffColour1 + "+" );
        System.out.printf("%s",reffColout3 +  "-".repeat(15)+"+");
        System.out.printf("%s",reffColour1 +"-".repeat(14)+"+");
        System.out.printf("%s",reffColout3 +"-".repeat(14)+"+" + "\n");



     }
    
}
