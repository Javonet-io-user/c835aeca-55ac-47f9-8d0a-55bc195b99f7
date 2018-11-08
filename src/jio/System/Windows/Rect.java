package jio.System.Windows;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Windows.*;public class Rect {public NObject javonetHandle; public Rect (Point location,Size size){ try {  javonetHandle = Javonet.New("Rect",location,size);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Rect (java.lang.Double x,java.lang.Double y,java.lang.Double width,java.lang.Double height){ try {  javonetHandle = Javonet.New("Rect",x,y,width,height);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Rect (Point point1,Point point2){ try {  javonetHandle = Javonet.New("Rect",point1,point2);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Rect (Point point,Vector vector){ try {  javonetHandle = Javonet.New("Rect",point,vector);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Rect (Size size){ try {  javonetHandle = Javonet.New("Rect",size);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Rect(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}