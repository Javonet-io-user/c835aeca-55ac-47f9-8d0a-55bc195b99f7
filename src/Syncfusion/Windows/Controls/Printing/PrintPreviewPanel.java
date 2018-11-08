package Syncfusion.Windows.Controls.Printing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Windows.Controls.*;
import Syncfusion.Windows.Controls.Printing.*;
import jio.System.Windows.Controls.Primitives.*;
import jio.System.Windows.Media.*;
import jio.System.Windows.*;public class PrintPreviewPanel extends Panel implements IScrollInfo {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setCanHorizontallyScroll (java.lang.Boolean value){ try { javonetHandle.set("CanHorizontallyScroll",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getCanHorizontallyScroll (){ try { return javonetHandle.get("CanHorizontallyScroll");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setCanVerticallyScroll (java.lang.Boolean value){ try { javonetHandle.set("CanVerticallyScroll",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getCanVerticallyScroll (){ try { return javonetHandle.get("CanVerticallyScroll");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.lang.Double getExtentHeight (){ try { return javonetHandle.get("ExtentHeight");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * GetProperty
	 */
            public java.lang.Double getExtentWidth (){ try { return javonetHandle.get("ExtentWidth");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * GetProperty
	 */
            public java.lang.Double getHorizontalOffset (){ try { return javonetHandle.get("HorizontalOffset");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * GetProperty
	 */
            public java.lang.Double getVerticalOffset (){ try { return javonetHandle.get("VerticalOffset");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * GetProperty
	 */
            public java.lang.Double getViewportHeight (){ try { return javonetHandle.get("ViewportHeight");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * GetProperty
	 */
            public java.lang.Double getViewportWidth (){ try { return javonetHandle.get("ViewportWidth");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * SetProperty
	 */
            public void setScrollOwner (ScrollViewer value){ try { javonetHandle.set("ScrollOwner",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public ScrollViewer getScrollOwner (){ try { return new ScrollViewer((NObject)javonetHandle.get("ScrollOwner"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PrintPreviewPanel (){  super((NObject) null); try {  javonetHandle = Javonet.New("PrintPreviewPanel"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PrintPreviewPanel (PrintManager printManager){  super((NObject) null); try {  javonetHandle = Javonet.New("PrintPreviewPanel",printManager); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PrintPreviewPanel(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void LineDown (){ try { javonetHandle.invoke("LineDown");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void LineUp (){ try { javonetHandle.invoke("LineUp");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void LineLeft (){ try { javonetHandle.invoke("LineLeft");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void LineRight (){ try { javonetHandle.invoke("LineRight");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void MouseWheelDown (){ try { javonetHandle.invoke("MouseWheelDown");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void MouseWheelUp (){ try { javonetHandle.invoke("MouseWheelUp");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void MouseWheelLeft (){ try { javonetHandle.invoke("MouseWheelLeft");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void MouseWheelRight (){ try { javonetHandle.invoke("MouseWheelRight");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void PageDown (){ try { javonetHandle.invoke("PageDown");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void PageUp (){ try { javonetHandle.invoke("PageUp");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void PageLeft (){ try { javonetHandle.invoke("PageLeft");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void PageRight (){ try { javonetHandle.invoke("PageRight");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public Rect MakeVisible (Visual visual,Rect rectangle){ try { return javonetHandle.invoke("MakeVisible",visual,rectangle);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void SetHorizontalOffset (java.lang.Double offset){ try { javonetHandle.invoke("SetHorizontalOffset",offset);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void SetVerticalOffset (java.lang.Double offset){ try { javonetHandle.invoke("SetVerticalOffset",offset);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}