package Syncfusion.Windows.Controls;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Syncfusion.Windows.Controls.*;
import jio.System.*;
import jio.System.Windows.Media.Animation.*;
import jio.System.Windows.*;public class RotateTransition extends ContentTransition {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setDuration (TimeSpan value){ try { javonetHandle.set("Duration",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public TimeSpan getDuration (){ try { return javonetHandle.get("Duration");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setEasing (EasingFunctionBase value){ try { javonetHandle.set("Easing",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public EasingFunctionBase getEasing (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("Easing"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetFiled
	 */
            public static DependencyProperty getEasingProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("RotateTransition").get("EasingProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setEasingProperty (DependencyProperty param){ try { Javonet.getType("RotateTransition").set("EasingProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getDurationProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("RotateTransition").get("DurationProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setDurationProperty (DependencyProperty param){ try { Javonet.getType("RotateTransition").set("DurationProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RotateTransition (){  super((NObject) null); try {  javonetHandle = Javonet.New("RotateTransition"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public RotateTransition(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}