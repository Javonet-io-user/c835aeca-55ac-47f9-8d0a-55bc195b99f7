package Syncfusion.Windows.Controls.Printing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Syncfusion.Windows.Controls.Printing.*;public class PrintPageOrientation {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setOrientationName (java.lang.String value){ try { javonetHandle.set("OrientationName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getOrientationName (){ try { return  (java.lang.String) javonetHandle.get("OrientationName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setOrientation (PrintOrientation value){ try { javonetHandle.set("Orientation",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public PrintOrientation getOrientation (){ try { return PrintOrientation.valueOf(((NEnum) javonetHandle.get("Orientation")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setImagePath (java.lang.String value){ try { javonetHandle.set("ImagePath",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getImagePath (){ try { return  (java.lang.String) javonetHandle.get("ImagePath");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PrintPageOrientation (){ try {  javonetHandle = Javonet.New("PrintPageOrientation");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PrintPageOrientation(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}