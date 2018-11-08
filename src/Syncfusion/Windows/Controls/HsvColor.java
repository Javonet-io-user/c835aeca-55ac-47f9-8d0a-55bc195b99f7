package Syncfusion.Windows.Controls;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import Syncfusion.Windows.Controls.*;public class HsvColor extends ValueType {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public java.lang.Double getH (){ try { return javonetHandle.get("H");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * SetFiled
	 */
            public void setH (java.lang.Double param){ try { javonetHandle.set("H",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Double getS (){ try { return javonetHandle.get("S");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * SetFiled
	 */
            public void setS (java.lang.Double param){ try { javonetHandle.set("S",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Double getV (){ try { return javonetHandle.get("V");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * SetFiled
	 */
            public void setV (java.lang.Double param){ try { javonetHandle.set("V",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.Double getA (){ try { return javonetHandle.get("A");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * SetFiled
	 */
            public void setA (java.lang.Double param){ try { javonetHandle.set("A",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public HsvColor(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}