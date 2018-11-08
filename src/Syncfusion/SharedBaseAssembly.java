package Syncfusion;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Syncfusion.*;
import jio.System.*;
import jio.System.Reflection.*;public class SharedBaseAssembly {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public static java.lang.String getName (){ try { return  (java.lang.String) Javonet.getType("SharedBaseAssembly").get("Name");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public static void setName (java.lang.String param){ try { Javonet.getType("SharedBaseAssembly").set("Name",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static Assembly getAssembly (){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("SharedBaseAssembly").get("Assembly"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setAssembly (Assembly param){ try { Javonet.getType("SharedBaseAssembly").set("Assembly",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static java.lang.String getRootNamespace (){ try { return  (java.lang.String) Javonet.getType("SharedBaseAssembly").get("RootNamespace");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public static void setRootNamespace (java.lang.String param){ try { Javonet.getType("SharedBaseAssembly").set("RootNamespace",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SharedBaseAssembly (){ try {  javonetHandle = Javonet.New("SharedBaseAssembly");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SharedBaseAssembly(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static Assembly AssemblyResolver (NObject sender,ResolveEventArgs e){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("SharedBaseAssembly").invoke("AssemblyResolver",sender,e));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}