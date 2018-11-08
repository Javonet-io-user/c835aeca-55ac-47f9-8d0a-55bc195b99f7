package Syncfusion.Windows.Controls;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Syncfusion.Windows.Controls.*;
import jio.System.Windows.Media.Animation.*;
import jio.System.*;
import Syncfusion.Windows.Primitives.*;
import jio.System.Windows.*;public class SlideTransition extends ContentTransition {protected NObject javonetHandle; /**
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
	 * SetProperty
	 */
            public void setDirection (SlideDirection value){ try { javonetHandle.set("Direction",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public SlideDirection getDirection (){ try { return SlideDirection.valueOf(((NEnum) javonetHandle.get("Direction")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetFiled
	 */
            public Position getPosition (){ try { return Position.valueOf(((NEnum) javonetHandle.get("Position")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setPosition (Position param){ try { javonetHandle.set("Position",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getEasingProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("SlideTransition").get("EasingProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setEasingProperty (DependencyProperty param){ try { Javonet.getType("SlideTransition").set("EasingProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getDirectionProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("SlideTransition").get("DirectionProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setDirectionProperty (DependencyProperty param){ try { Javonet.getType("SlideTransition").set("DirectionProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getDurationProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("SlideTransition").get("DurationProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setDurationProperty (DependencyProperty param){ try { Javonet.getType("SlideTransition").set("DurationProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SlideTransition (){  super((NObject) null); try {  javonetHandle = Javonet.New("SlideTransition"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SlideTransition(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public Timeline CreateExitAnimation (java.lang.Double toValue){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("CreateExitAnimation",toValue));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Timeline CreateEnterAnimation (java.lang.Double fromValue){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("CreateEnterAnimation",fromValue));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}