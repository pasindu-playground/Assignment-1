public class DemoTask5 {

    public static void main(String[] args) {
        int firstInt = 978;
        int secondInt = 3;
        int thirdInt = 16;
        int fourthInt = 1484100;
        String reff = "\033[30m";

        System.out.printf("ISBN NO: \033[34m%1$d %5$s- \033[35m%2$d %5$s- \033[36m%3$d %5$s-\033[31m%4$d \n",firstInt,secondInt,thirdInt,fourthInt,reff);
    }
    
}
