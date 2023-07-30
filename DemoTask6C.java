public class DemoTask6C {

    public static void main(String[] args) {

        String reffColour1 = "\033[33m";
        String reffColour2 = "\033[37m";
        String reffColout3 = "\033[36m";
        String reffColour4 = "\033[32m";
        
        System.out.printf("%s",reffColour1 + "+"+ "-".repeat(15)+"+"+"-".repeat(14)+"+"+"-".repeat(14)+"+" +"\n");
        System.out.printf("%1$s| %2$s CITY %1$12s | %2$s STATE %1$10s | %2$s POPULATION %1$3s |\n",reffColour1,reffColour2);
        System.out.printf("%s",reffColour1 + "+"+ "-".repeat(15)+"+"+"-".repeat(14)+"+"+"-".repeat(14)+"+" +"\n");
        System.out.printf("%1$s| %2$s Los Angeles %1$s | %2$s California %1$3s | %3$s 3,966,936 %1$6s |\n",reffColour1,reffColour2,reffColout3);
        System.out.printf("%1$s| %4$s New %2$sYork %1$8s | %4$s New %2$s York %1$6s | %3$s 8,336,817 %1$6s |\n",reffColour1,reffColour2,reffColout3,reffColour4);
        System.out.printf("%s",reffColour1 + "+"+ "-".repeat(15)+"+"+"-".repeat(14)+"+"+"-".repeat(14)+"+" +"\n");

    }
    
}
