public class DemoTask4 {

    public static void main(String[] args) {
        int day = 28;
        int month = 12;
        int year = 2023;
        int hour = 23;
        int minute = 59;
        int second = 59;

        System.out.printf("\033[34m%1$d\033[30m/\033[36m%2$d\033[30m/\033[38m%3$d \033[32m%4$d:\033[33m%5$d:\033[35m%6$d \n",day,month,year,hour,minute,second);
    }
    
}
