package Syncfusion.Windows.Controls;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Windows.Controls.*;
import Syncfusion.Windows.Controls.*;
import jio.System.Windows.*;public class TransitionContentControl extends ContentControl {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setTransition (ContentTransition value){ try { javonetHandle.set("Transition",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public ContentTransition getTransition (){ try { return new ContentTransition((NObject)javonetHandle.get("Transition"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setEnableAnimation (java.lang.Boolean value){ try { javonetHandle.set("EnableAnimation",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getEnableAnimation (){ try { return javonetHandle.get("EnableAnimation");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetFiled
	 */
            public static DependencyProperty getTransitionProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("TransitionContentControl").get("TransitionProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setTransitionProperty (DependencyProperty param){ try { Javonet.getType("TransitionContentControl").set("TransitionProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getEnableAnimationProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("TransitionContentControl").get("EnableAnimationProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setEnableAnimationProperty (DependencyProperty param){ try { Javonet.getType("TransitionContentControl").set("EnableAnimationProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TransitionContentControl (){  super((NObject) null); try {  javonetHandle = Javonet.New("TransitionContentControl"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TransitionContentControl(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Dispose (){ try { javonetHandle.invoke("Dispose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void OnApplyTemplate (){ try { javonetHandle.invoke("OnApplyTemplate");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}