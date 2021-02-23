package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.beans.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author viter
 */
public class MessageBean implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -8266471152053172467L;
    private String msg;

    public MessageBean(String lang) {
        setMsg(lang);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String value) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        String hrString = sdf.format(new Date());

        int hr = Integer.parseInt(hrString);

        switch (value) {
            case "":
            case "pt":
                if (hr >= 0 && hr <= 11) {
                    msg = "Bom dia";
                } else if (hr >= 12 && hr <= 18) {
                    msg = "Boa tarde";
                } else {
                    msg = "Boa noite";
                }
                break;
            case "en":
                if (hr >= 0 && hr <= 11) {
                    msg = "Good morning";
                } else if (hr >= 12 && hr <= 18) {
                    msg = "Good afternoon";
                } else {
                    msg = "Goodnight";
                }
                break;
            case "de":
                if (hr >= 0 && hr <= 11) {
                    msg = "Guten morgen";
                } else if (hr >= 12 && hr <= 18) {
                    msg = "Guten tag";
                } else {
                    msg = "Gute nacht";
                }
                break;
            case "fr":
                if (hr >= 0 && hr <= 11) {
                    msg = "Bonjour";
                } else if (hr >= 12 && hr <= 18) {
                    msg = "Bon après-midi";
                } else {
                    msg = "Bonne nuit";
                }
                break;
        }
        msg = "Hora Atual: " + hrString + " | " + msg + " ";
    }
}
