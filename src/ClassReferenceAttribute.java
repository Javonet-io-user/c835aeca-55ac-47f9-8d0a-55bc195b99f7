import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import .*;public class ClassReferenceAttribute extends Attribute {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setIsReviewed (java.lang.Boolean value){ try { javonetHandle.set("IsReviewed",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsReviewed (){ try { return javonetHandle.get("IsReviewed");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setShouldInclude (java.lang.Boolean value){ try { javonetHandle.set("ShouldInclude",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getShouldInclude (){ try { return javonetHandle.get("ShouldInclude");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public ClassReferenceAttribute (){  super((NObject) null); try {  javonetHandle = Javonet.New("ClassReferenceAttribute"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ClassReferenceAttribute(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}