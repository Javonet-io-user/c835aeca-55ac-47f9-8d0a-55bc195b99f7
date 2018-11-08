package Syncfusion.Windows.Controls;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Syncfusion.Windows.Controls.*;
import jio.System.Windows.Media.*;
import jio.System.Windows.*;public class ColorPickerHelper {protected NObject javonetHandle; public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static Color FromHsv (java.lang.Double hue,java.lang.Double saturation,java.lang.Double value,java.lang.Double alpha){ try { return Javonet.getType("ColorPickerHelper").invoke("FromHsv",hue,saturation,value,alpha);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static java.lang.Integer IntColorFromBytes (java.lang.Byte a,java.lang.Byte r,java.lang.Byte g,java.lang.Byte b){ try { return Javonet.getType("ColorPickerHelper").invoke("IntColorFromBytes",a,r,g,b);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public static Color UpdateColorValue (java.lang.Double hue,java.lang.Double x,java.lang.Double y,java.lang.Double ph,java.lang.Double pw,java.lang.Double invPh){ try { return Javonet.getType("ColorPickerHelper").invoke("UpdateColorValue",hue,x,y,ph,pw,invPh);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static Point GetCanvasPosition (HsvColor hsv,java.lang.Double ph,java.lang.Double pw){ try { return Javonet.getType("ColorPickerHelper").invoke("GetCanvasPosition",hsv,ph,pw);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static Color FromHsl (java.lang.Double hue,java.lang.Double saturation,java.lang.Double lightness,java.lang.Double alpha){ try { return Javonet.getType("ColorPickerHelper").invoke("FromHsl",hue,saturation,lightness,alpha);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}