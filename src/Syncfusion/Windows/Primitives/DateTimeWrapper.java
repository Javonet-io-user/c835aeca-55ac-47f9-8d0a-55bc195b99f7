package Syncfusion.Windows.Primitives;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Syncfusion.Windows.Primitives.*;
import jio.System.*;public class DateTimeWrapper {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public static void setIsTwentyFourHourtimeline (java.lang.Boolean value){ try { Javonet.getType("DateTimeWrapper").set("IsTwentyFourHourtimeline",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public static java.lang.Boolean getIsTwentyFourHourtimeline (){ try { return Javonet.getType("DateTimeWrapper").get("IsTwentyFourHourtimeline");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.util.Date getDateTime (){ try { return javonetHandle.get("DateTime");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.String getYearNumber (){ try { return  (java.lang.String) javonetHandle.get("YearNumber");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getMonthNumber (){ try { return  (java.lang.String) javonetHandle.get("MonthNumber");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getMonthName (){ try { return  (java.lang.String) javonetHandle.get("MonthName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getDayNumber (){ try { return  (java.lang.String) javonetHandle.get("DayNumber");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getDayName (){ try { return  (java.lang.String) javonetHandle.get("DayName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getHourNumber (){ try { return  (java.lang.String) javonetHandle.get("HourNumber");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getMinuteNumber (){ try { return  (java.lang.String) javonetHandle.get("MinuteNumber");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getSecondNumber (){ try { return  (java.lang.String) javonetHandle.get("SecondNumber");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public java.lang.String getAmPmString (){ try { return  (java.lang.String) javonetHandle.get("AmPmString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public DateTimeWrapper (java.util.Date dateTime){ try {  javonetHandle = Javonet.New("DateTimeWrapper",dateTime);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DateTimeWrapper(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static java.lang.Boolean CurrentCultureUsesTwentyFourHourClock (){ try { return Javonet.getType("DateTimeWrapper").invoke("CurrentCultureUsesTwentyFourHourClock");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}