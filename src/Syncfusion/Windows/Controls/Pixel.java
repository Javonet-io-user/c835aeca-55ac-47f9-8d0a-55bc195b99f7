package Syncfusion.Windows.Controls;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Syncfusion.Windows.Controls.*;public class Pixel {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setR (java.lang.Byte value){ try { javonetHandle.set("R",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Byte getR (){ try { return javonetHandle.get("R");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setG (java.lang.Byte value){ try { javonetHandle.set("G",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Byte getG (){ try { return javonetHandle.get("G");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setB (java.lang.Byte value){ try { javonetHandle.set("B",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Byte getB (){ try { return javonetHandle.get("B");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setA (java.lang.Byte value){ try { javonetHandle.set("A",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Byte getA (){ try { return javonetHandle.get("A");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }public Pixel (java.lang.Byte r,java.lang.Byte g,java.lang.Byte b,java.lang.Byte a){ try {  javonetHandle = Javonet.New("Pixel",r,g,b,a);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Pixel (){ try {  javonetHandle = Javonet.New("Pixel");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Pixel(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}