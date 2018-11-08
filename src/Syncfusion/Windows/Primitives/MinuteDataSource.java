package Syncfusion.Windows.Primitives;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Syncfusion.Windows.Primitives.*;public class MinuteDataSource extends DataSource {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setInterval (java.lang.Integer value){ try { javonetHandle.set("Interval",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getInterval (){ try { return javonetHandle.get("Interval");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }public MinuteDataSource (){  super((NObject) null); try {  javonetHandle = Javonet.New("MinuteDataSource"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public MinuteDataSource (java.lang.Integer interval){  super((NObject) null); try {  javonetHandle = Javonet.New("MinuteDataSource",interval); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public MinuteDataSource(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}