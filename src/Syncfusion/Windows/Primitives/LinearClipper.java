package Syncfusion.Windows.Primitives;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Syncfusion.Windows.Primitives.*;
import jio.System.Windows.*;public class LinearClipper extends Clipper {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setExpandDirection (ExpandDirection value){ try { javonetHandle.set("ExpandDirection",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public ExpandDirection getExpandDirection (){ try { return ExpandDirection.valueOf(((NEnum) javonetHandle.get("ExpandDirection")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetFiled
	 */
            public static DependencyProperty getExpandDirectionProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("LinearClipper").get("ExpandDirectionProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setExpandDirectionProperty (DependencyProperty param){ try { Javonet.getType("LinearClipper").set("ExpandDirectionProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LinearClipper (){  super((NObject) null); try {  javonetHandle = Javonet.New("LinearClipper"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LinearClipper(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}