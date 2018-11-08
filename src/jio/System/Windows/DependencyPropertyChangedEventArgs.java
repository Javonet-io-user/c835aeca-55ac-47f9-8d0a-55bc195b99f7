package jio.System.Windows;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Windows.*;
import jio.System.*;public class DependencyPropertyChangedEventArgs {public NObject javonetHandle; public DependencyPropertyChangedEventArgs (DependencyProperty property,NObject oldValue,NObject newValue){ try {  javonetHandle = Javonet.New("DependencyPropertyChangedEventArgs",property,oldValue,newValue);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DependencyPropertyChangedEventArgs(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}