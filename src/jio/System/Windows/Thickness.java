package jio.System.Windows;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Windows.*;public class Thickness {public NObject javonetHandle; public Thickness (java.lang.Double uniformLength){ try {  javonetHandle = Javonet.New("Thickness",uniformLength);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Thickness (java.lang.Double left,java.lang.Double top,java.lang.Double right,java.lang.Double bottom){ try {  javonetHandle = Javonet.New("Thickness",left,top,right,bottom);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Thickness(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}