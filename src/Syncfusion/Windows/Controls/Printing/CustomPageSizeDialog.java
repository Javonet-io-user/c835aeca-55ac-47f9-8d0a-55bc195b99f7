package Syncfusion.Windows.Controls.Printing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Windows.*;
import Syncfusion.Windows.Controls.Printing.*;
import jio.System.Windows.Markup.*;
import jio.System.*;public class CustomPageSizeDialog extends Window implements IComponentConnector {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setPageHeight (java.lang.Double value){ try { javonetHandle.set("PageHeight",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Double getPageHeight (){ try { return javonetHandle.get("PageHeight");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * SetProperty
	 */
            public void setPageWidth (java.lang.Double value){ try { javonetHandle.set("PageWidth",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Double getPageWidth (){ try { return javonetHandle.get("PageWidth");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }public CustomPageSizeDialog (PrintOptionsControl printOptionsControl,Size pagesize){  super((NObject) null); try {  javonetHandle = Javonet.New("CustomPageSizeDialog",printOptionsControl,pagesize); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CustomPageSizeDialog(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void OnApplyTemplate (){ try { javonetHandle.invoke("OnApplyTemplate");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void InitializeComponent (){ try { javonetHandle.invoke("InitializeComponent");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void IComponentConnector_Connect (java.lang.Integer connectionId,NObject target){ try { javonetHandle.invoke("IComponentConnector_Connect",connectionId,target);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}