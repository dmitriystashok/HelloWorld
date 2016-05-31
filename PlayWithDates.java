import java.util.Date;

public class PlayWithDates {
    public static void main(String[] args) throws Exception {

        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1); // первое число
        yearStartTime.setMonth(0); // месяц январь, нумерация для месяцев 0-11

        Date currentTime = new Date();
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000; //сколько миллисекунд в одних сутках

        int dayCount = (int) (msTimeDistance/msDay); //количество целых дней
        System.out.println("Days from start of year: " + dayCount);


//        Date currentTime = new Date();
//        int hours = currentTime.getHours();
//        int mins = currentTime.getMinutes();
//        int secs = currentTime.getSeconds();
//
//        System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);

//        Date startTime = new Date();
//
//        long endTime = startTime.getTime() + 5000; //    +5 секунд
//        Date endDate = new Date(endTime);
//
//        Thread.sleep(3000);     // ждем 3 секунды
//
//        Date currentTime = new Date();
//        if (currentTime.after(endDate))  //проверяем что время currentTime после endDate
//        {
//            System.out.println("End time!");
//        }

        //Метод after() проверяет, что дата, у которой мы вызвали метод, идет после переданной в метод даты after.

//        Date currentTime = new Date();
//        Thread.sleep(3000);
//        Date newTime = new Date();
//
//        long msDelay = newTime.getTime() - currentTime.getTime();
//        System.out.println("Time distance is: " + msDelay + " in ms");
    }
}
