import java.util.jar.Attributes.Name;

public class DemoTask6B {

    public static void main(String[] args) {

    
        String reff1 = "\033[34;2m";
        String reff2 = "\033[33m";
        String reff3 = "\033[30m";
        String reff4 = "\033[35m";
        
        System.out.printf("%s+-----------------+-----+ \n",reff2);
        System.out.printf("| %1$s NAME %2$15s| %1$sAGE %2$s|\n",reff1,reff2);
        System.out.printf("%s+-----------------+-----+ \n",reff2);
        System.out.printf("| %1$s Alice %2$13s | %3$s 24 %2$s|\n",reff3,reff2,reff4);
        System.out.printf("| %1$s Bob %2$15s | %3$s 30 %2$s|\n",reff3,reff2,reff4);
        System.out.printf("%s+-----------------+-----+ \n",reff2);
        

    }
    
}
