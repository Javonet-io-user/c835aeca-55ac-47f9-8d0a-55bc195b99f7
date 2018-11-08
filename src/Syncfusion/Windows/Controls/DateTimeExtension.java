package Syncfusion.Windows.Controls;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Syncfusion.Windows.Controls.*;
import jio.System.*;
import jio.System.Collections.Generic.*;public class DateTimeExtension {protected NObject javonetHandle; public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static IEnumerable<java.util.Date> EachDayInMonth (java.util.Date datetime){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("DateTimeExtension").invoke("EachDayInMonth",datetime));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static java.util.Date FirstDay (java.util.Date dateTime){ try { return Javonet.getType("DateTimeExtension").invoke("FirstDay",dateTime);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static java.lang.Integer StartOfWeek (java.util.Date dt,DayOfWeek startOfWeek){ try { return Javonet.getType("DateTimeExtension").invoke("StartOfWeek",dt,NEnum.fromJavaEnum(startOfWeek));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public static java.util.Date LastDay (java.util.Date dateTime){ try { return Javonet.getType("DateTimeExtension").invoke("LastDay",dateTime);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static java.util.Date ToDateTime (NObject dateTime){ try { return Javonet.getType("DateTimeExtension").invoke("ToDateTime",dateTime);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}