package jio.System;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import jio.System.Reflection.*;public class ResolveEventArgs {public NObject javonetHandle; public ResolveEventArgs (java.lang.String name){ try {  javonetHandle = Javonet.New("ResolveEventArgs",name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ResolveEventArgs (java.lang.String name,Assembly requestingAssembly){ try {  javonetHandle = Javonet.New("ResolveEventArgs",name,requestingAssembly);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ResolveEventArgs(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}