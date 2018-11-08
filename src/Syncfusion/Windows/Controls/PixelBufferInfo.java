package Syncfusion.Windows.Controls;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Syncfusion.Windows.Controls.*;public class PixelBufferInfo {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void set_Item (java.lang.Integer i,java.lang.Integer value){ try { javonetHandle.invoke("set_Item",i,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer get_Item (java.lang.Integer i){ try { return javonetHandle.invoke("get_Item",i);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetFiled
	 */
            public java.lang.Integer[] getpixels (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.get("pixels"),java.lang.Integer[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setpixels (java.lang.Integer[] param){ try { javonetHandle.set("pixels",new Object[] {param});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PixelBufferInfo (java.lang.Integer[] pixelBuffer){ try {  javonetHandle = Javonet.New("PixelBufferInfo",new Object[] {pixelBuffer});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PixelBufferInfo(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}