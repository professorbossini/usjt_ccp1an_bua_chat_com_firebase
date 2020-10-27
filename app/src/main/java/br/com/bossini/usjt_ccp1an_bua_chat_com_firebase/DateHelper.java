package br.com.bossini.usjt_ccp1an_bua_chat_com_firebase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {

    private static SimpleDateFormat
            sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

    public static String format (Date date){
        return sdf.format(date);
    }
}
