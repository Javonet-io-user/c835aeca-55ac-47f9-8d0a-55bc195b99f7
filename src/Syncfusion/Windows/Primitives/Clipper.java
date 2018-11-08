package Syncfusion.Windows.Primitives;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Windows.Controls.*;
import Syncfusion.Windows.Primitives.*;
import jio.System.Windows.*;public abstract class Clipper extends ContentControl {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setRatioVisible (java.lang.Double value){ try { javonetHandle.set("RatioVisible",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Double getRatioVisible (){ try { return javonetHandle.get("RatioVisible");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * GetFiled
	 */
            public static DependencyProperty getRatioVisibleProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("Clipper").get("RatioVisibleProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setRatioVisibleProperty (DependencyProperty param){ try { Javonet.getType("Clipper").set("RatioVisibleProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Clipper(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}