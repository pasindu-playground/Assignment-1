public class DemoTask3 {

    public static void main(String[] args) {
        int areaCode = 123;
        int numFirstPart = 456;
        int numSecondPart = 789;

        System.out.printf("Telephone no- \033[35m(\033[36m%1$d\033[35m)\033[30m%2$d-%3$d \n",areaCode,numFirstPart,numSecondPart);
    }
    
}
