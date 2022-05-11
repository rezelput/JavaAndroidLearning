package lab3;

import java.util.Date;
import java.util.TimeZone;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


//
import second.TimeZoneList;
    
public class module1 
{
	private  final  String  TIMEZONE_utc   ;
	private  final  String  TIMEZONE_msc   ;
	private  final  String  DATETIME_format;
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public module1()
	{
        // TimeZone.setDefault(
        //           TimeZone.getTimeZone(TIMEZONE_utc));

	    TIMEZONE_utc    = "UTC";
	    TIMEZONE_msc    = "Europe/Moscow";
	    DATETIME_format = "yyyy-MM-dd HH:mm:ss.SS";

        Date date   = new Date();
        Date dt_msk = null;

        TimeZone tm_curr = TimeZone.getDefault();
        System.out.println ("Current TimeZone : \""
                                 + tm_curr.getID() + "\" ("
                                 + tm_curr.getDisplayName()
                                 + ")");
        System.out.println ("useDaylightTime : "
                                 + tm_curr.useDaylightTime()
                                 + "\n");
        TimeZone tm_utc;
        TimeZone tm_msk;
        tm_utc = TimeZone.getTimeZone(TIMEZONE_utc);
        tm_msk = TimeZone.getTimeZone(TIMEZONE_msc);

        DateFormat df_utc;
        DateFormat df_msk;
        df_utc = new SimpleDateFormat(DATETIME_format);
        df_msk = new SimpleDateFormat(DATETIME_format);

        df_utc.setTimeZone(tm_utc);
        df_msk.setTimeZone(tm_msk);

        String date_utc = df_utc.format(date);
        String date_msk = df_msk.format(date);

        try 
        {
            dt_msk = df_msk.parse(date_msk);
        } 
        
        catch (ParseException e) {}

        System.out.println ("UTC\n" + date);
        System.out.println (date_utc);
        System.out.println (tm_utc.getRawOffset());
        System.out.println ();
        System.out.println ("Moscow\n" + dt_msk);
        System.out.println (date_msk);
    }
   
	
    public static void main(String[] args) 
    {
    	//new TimeZoneList(TimeZoneList());
    	TimeZoneList tt = new TimeZoneList();
    	System.out.println(tt);
        new module1();
        System.exit(0);
    }
}
