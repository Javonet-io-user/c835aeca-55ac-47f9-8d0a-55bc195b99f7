package Syncfusion.Windows.Converters;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Syncfusion.Windows.Converters.*;
import jio.System.*;
import jio.System.Globalization.*;
import jio.System.Windows.Data.*;public class ColorToBrushConverter implements IValueConverter {protected NObject javonetHandle; public ColorToBrushConverter (){ try {  javonetHandle = Javonet.New("ColorToBrushConverter");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ColorToBrushConverter(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public NObject Convert (NObject value,Class targetType,NObject parameter,CultureInfo language){ try { return  (NObject) javonetHandle.invoke("Convert",value,Javonet.getType(getReturnObjectName(targetType).getTypeName()),parameter,language);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public NObject ConvertBack (NObject value,Class targetType,NObject parameter,CultureInfo language){ try { return  (NObject) javonetHandle.invoke("ConvertBack",value,Javonet.getType(getReturnObjectName(targetType).getTypeName()),parameter,language);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}