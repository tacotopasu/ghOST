<<<<<<< HEAD
package util;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Print {

    public static void print(String s) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            System.out.println("[gh//OST] / " + dtf.format(now) + " / " + s);
    }
=======
package util;public class Print {
>>>>>>> 0f28ef12b2e143e9e70818efd202807609b88491
}
