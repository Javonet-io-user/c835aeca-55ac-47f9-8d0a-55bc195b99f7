package Syncfusion.Windows.Controls.Printing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Syncfusion.Windows.Controls.Printing.*;
import jio.System.Windows.Controls.*;
import jio.System.Windows.Documents.*;
import jio.System.*;
import jio.System.Windows.*;
import jio.System.ComponentModel.*;public class PrintManager implements INotifyPropertyChanged,IDisposable {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setSelectedScaleIndex (java.lang.Integer value){ try { javonetHandle.set("SelectedScaleIndex",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getSelectedScaleIndex (){ try { return javonetHandle.get("SelectedScaleIndex");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getPageCount (){ try { return javonetHandle.get("PageCount");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setPageMargin (Thickness value){ try { javonetHandle.set("PageMargin",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Thickness getPageMargin (){ try { return javonetHandle.get("PageMargin");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
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
            public void setPageHeaderTemplate (DataTemplate value){ try { javonetHandle.set("PageHeaderTemplate",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DataTemplate getPageHeaderTemplate (){ try { return new DataTemplate((NObject)javonetHandle.get("PageHeaderTemplate"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setPageFooterTemplate (DataTemplate value){ try { javonetHandle.set("PageFooterTemplate",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DataTemplate getPageFooterTemplate (){ try { return new DataTemplate((NObject)javonetHandle.get("PageFooterTemplate"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setPageOrientation (PrintOrientation value){ try { javonetHandle.set("PageOrientation",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public PrintOrientation getPageOrientation (){ try { return PrintOrientation.valueOf(((NEnum) javonetHandle.get("PageOrientation")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PrintManager (PrintSettingsBase settings){ try {  javonetHandle = Javonet.New("PrintManager",settings);javonetHandle.addEventListener("PropertyChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (PropertyChangedEventHandler handler : _PropertyChangedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], PropertyChangedEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PrintManager(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Print (){ try { javonetHandle.invoke("Print");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Print (PrintDialog printDialog,java.lang.Boolean showPrintDialog){ try { javonetHandle.invoke("Print",printDialog,showPrintDialog);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public FixedDocument GetPrintDocument (){ try { return new FixedDocument((NObject)javonetHandle.invoke("GetPrintDocument"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public FixedDocument GetPrintDocument (java.lang.Integer start,java.lang.Integer end){ try { return new FixedDocument((NObject)javonetHandle.invoke("GetPrintDocument",start,end));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
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