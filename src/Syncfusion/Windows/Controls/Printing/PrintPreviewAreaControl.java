package Syncfusion.Windows.Controls.Printing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Windows.Controls.*;
import Syncfusion.Windows.Controls.Printing.*;
import jio.System.*;
import jio.System.Windows.Input.*;
import jio.System.Windows.*;
import jio.System.ComponentModel.*;public class PrintPreviewAreaControl extends Control implements INotifyPropertyChanged,IDisposable {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.Integer getTotalPages (){ try { return javonetHandle.get("TotalPages");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setPrintManager (PrintManager value){ try { javonetHandle.set("PrintManager",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public PrintManager getPrintManager (){ try { return new PrintManager((NObject)javonetHandle.get("PrintManager"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setZoomFactor (java.lang.Double value){ try { javonetHandle.set("ZoomFactor",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Double getZoomFactor (){ try { return javonetHandle.get("ZoomFactor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * SetProperty
	 */
            public void setPageIndex (java.lang.Integer value){ try { javonetHandle.set("PageIndex",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getPageIndex (){ try { return javonetHandle.get("PageIndex");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public ICommand getFirstCommand (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("FirstCommand"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public ICommand getPreviousCommand (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("PreviousCommand"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public ICommand getNextCommand (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("NextCommand"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public ICommand getLastCommand (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("LastCommand"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetFiled
	 */
            public static DependencyProperty getZoomFactorProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("PrintPreviewAreaControl").get("ZoomFactorProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setZoomFactorProperty (DependencyProperty param){ try { Javonet.getType("PrintPreviewAreaControl").set("ZoomFactorProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getPageIndexProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("PrintPreviewAreaControl").get("PageIndexProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setPageIndexProperty (DependencyProperty param){ try { Javonet.getType("PrintPreviewAreaControl").set("PageIndexProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PrintPreviewAreaControl (){  super((NObject) null); try {  javonetHandle = Javonet.New("PrintPreviewAreaControl"); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("PropertyChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (PropertyChangedEventHandler handler : _PropertyChangedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], PropertyChangedEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PrintPreviewAreaControl(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void OnApplyTemplate (){ try { javonetHandle.invoke("OnApplyTemplate");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Dispose (){ try { javonetHandle.invoke("Dispose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Event
	 */
            private java.util.ArrayList< PropertyChangedEventHandler> _PropertyChangedListeners = new java.util.ArrayList<PropertyChangedEventHandler>();

            public void addPropertyChanged(PropertyChangedEventHandler toAdd)
            {
                _PropertyChangedListeners.add(toAdd);
            }
            public void removePropertyChanged(PropertyChangedEventHandler toRemove)
            {
                _PropertyChangedListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}