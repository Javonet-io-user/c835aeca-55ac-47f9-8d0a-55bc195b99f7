package jio.System.Windows.Media.Imaging;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Windows.Media.Imaging.*;
import jio.System.Windows.Media.*;public class WriteableBitmap {public NObject javonetHandle; public WriteableBitmap (BitmapSource source){ try {  javonetHandle = Javonet.New("WriteableBitmap",source);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public WriteableBitmap (java.lang.Integer pixelWidth,java.lang.Integer pixelHeight,java.lang.Double dpiX,java.lang.Double dpiY,PixelFormat pixelFormat,BitmapPalette palette){ try {  javonetHandle = Javonet.New("WriteableBitmap",pixelWidth,pixelHeight,dpiX,dpiY,pixelFormat,palette);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public WriteableBitmap(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}