package Syncfusion.Windows.Controls.Printing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Syncfusion.Windows.Controls.Printing.*;
import jio.System.Windows.*;
import jio.System.ComponentModel.*;
import jio.System.*;public class PrintSettingsBase implements INotifyPropertyChanged {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setOrientation (PrintOrientation value){ try { javonetHandle.set("Orientation",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public PrintOrientation getOrientation (){ try { return PrintOrientation.valueOf(((NEnum) javonetHandle.get("Orientation")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setPrintPreviewWindowStyle (Style value){ try { javonetHandle.set("PrintPreviewWindowStyle",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Style getPrintPreviewWindowStyle (){ try { return new Style((NObject)javonetHandle.get("PrintPreviewWindowStyle"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
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
            public java.lang.Double getPageWidth (){ try { return javonetHandle.get("PageWidth");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * SetProperty
	 */
            public void setPageHeaderHeight (java.lang.Double value){ try { javonetHandle.set("PageHeaderHeight",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Double getPageHeaderHeight (){ try { return javonetHandle.get("PageHeaderHeight");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * SetProperty
	 */
            public void setPageFooterHeight (java.lang.Double value){ try { javonetHandle.set("PageFooterHeight",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Double getPageFooterHeight (){ try { return javonetHandle.get("PageFooterHeight");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * SetProperty
	 */
            public void setPageMargin (Thickness value){ try { javonetHandle.set("PageMargin",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Thickness getPageMargin (){ try { return javonetHandle.get("PageMargin");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setPageHeaderTemplate (DataTemplate value){ try { javonetHandle.set("PageHeaderTemplate",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DataTemplate getPageHeaderTemplate (){ try { return new DataTemplate((NObject)javonetHandle.get("PageHeaderTemplate"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setPageFooterTemplate (DataTemplate value){ try { javonetHandle.set("PageFooterTemplate",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DataTemplate getPageFooterTemplate (){ try { return new DataTemplate((NObject)javonetHandle.get("PageFooterTemplate"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PrintSettingsBase (){ try {  javonetHandle = Javonet.New("PrintSettingsBase");javonetHandle.addEventListener("PropertyChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (PropertyChangedEventHandler handler : _PropertyChangedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], PropertyChangedEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PrintSettingsBase(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
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