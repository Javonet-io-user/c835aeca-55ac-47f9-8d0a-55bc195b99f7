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
import jio.System.Collections.Generic.*;
import jio.System.Windows.Input.*;
import jio.System.Windows.*;
import jio.System.ComponentModel.*;public class PrintOptionsControl extends Control implements IDisposable,INotifyPropertyChanged {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public List<PrintPageOrientation> getOrientationOptions (){ try { return new List<PrintPageOrientation>((NObject)javonetHandle.get("OrientationOptions"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public List<PrintScaleInfo> getScaleOptions (){ try { return new List<PrintScaleInfo>((NObject)javonetHandle.get("ScaleOptions"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setMarginOptions (List<PrintPageMargin> value){ try { javonetHandle.set("MarginOptions",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public List<PrintPageMargin> getMarginOptions (){ try { return new List<PrintPageMargin>((NObject)javonetHandle.get("MarginOptions"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setPageSizeOptions (List<PrintPageSize> value){ try { javonetHandle.set("PageSizeOptions",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public List<PrintPageSize> getPageSizeOptions (){ try { return new List<PrintPageSize>((NObject)javonetHandle.get("PageSizeOptions"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSelectedScaleIndex (java.lang.Integer value){ try { javonetHandle.set("SelectedScaleIndex",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getSelectedScaleIndex (){ try { return javonetHandle.get("SelectedScaleIndex");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setPrintOrientation (PrintOrientation value){ try { javonetHandle.set("PrintOrientation",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public PrintOrientation getPrintOrientation (){ try { return PrintOrientation.valueOf(((NEnum) javonetHandle.get("PrintOrientation")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public ICommand getPrintCommand (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("PrintCommand"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public ICommand getQuickPrintCommand (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("QuickPrintCommand"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetFiled
	 */
            public static DependencyProperty getSelectedScaleIndexProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("PrintOptionsControl").get("SelectedScaleIndexProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setSelectedScaleIndexProperty (DependencyProperty param){ try { Javonet.getType("PrintOptionsControl").set("SelectedScaleIndexProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getPrintOrientationProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("PrintOptionsControl").get("PrintOrientationProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setPrintOrientationProperty (DependencyProperty param){ try { Javonet.getType("PrintOptionsControl").set("PrintOrientationProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PrintOptionsControl (){  super((NObject) null); try {  javonetHandle = Javonet.New("PrintOptionsControl"); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("PropertyChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (PropertyChangedEventHandler handler : _PropertyChangedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], PropertyChangedEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PrintOptionsControl(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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