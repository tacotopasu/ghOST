package util;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Print {

    public static void print(String arg) {
        if(!(arg=="")){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            System.out.println("[gh//OST] / " + dtf.format(now) + " / " + arg);
        }
    }
}
