package jio.System.Windows.Media.Imaging;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Windows.Media.Imaging.*;
import jio.System.Windows.Media.*;
import jio.System.Collections.Generic.*;public class BitmapPalette {public NObject javonetHandle; public BitmapPalette (IList<Color> colors){ try {  javonetHandle = Javonet.New("BitmapPalette",colors);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public BitmapPalette (BitmapSource bitmapSource,java.lang.Integer maxColorCount){ try {  javonetHandle = Javonet.New("BitmapPalette",bitmapSource,maxColorCount);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public BitmapPalette(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}