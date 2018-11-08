package Syncfusion.Windows.Controls;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Syncfusion.Windows.Controls.*;
import jio.System.Windows.Media.Imaging.*;public class WriteableBitmapExtention {protected NObject javonetHandle; public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static void RenderSaturationValue (WriteableBitmap target,java.lang.Double hue){ try { Javonet.getType("WriteableBitmapExtention").invoke("RenderSaturationValue",target,hue);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static PixelBufferInfo GetPixels (java.lang.Integer[] pixelBuffer){ try { return new PixelBufferInfo((NObject)Javonet.getType("WriteableBitmapExtention").invoke("GetPixels",new Object[] {pixelBuffer}));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}