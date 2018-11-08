package Syncfusion.Windows.Controls;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Syncfusion.Windows.Controls.*;
import jio.System.Windows.Media.*;
import jio.System.*;public class VisualUtils {protected NObject javonetHandle; public VisualUtils (){ try {  javonetHandle = Javonet.New("VisualUtils");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public VisualUtils(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static Visual FindDescendant (Visual startingFrom,Class typeDescendant){ try { return ConvertToConcreteInterfaceImplementation((NObject) Javonet.getType("VisualUtils").invoke("FindDescendant",startingFrom,Javonet.getType(getReturnObjectName(typeDescendant).getTypeName())));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}