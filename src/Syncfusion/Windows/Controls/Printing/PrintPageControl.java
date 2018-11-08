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
import jio.System.ComponentModel.*;public class PrintPageControl extends ContentControl implements IDisposable,INotifyPropertyChanged {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setPageIndex (java.lang.Integer value){ try { javonetHandle.set("PageIndex",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getPageIndex (){ try { return javonetHandle.get("PageIndex");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }public PrintPageControl (PrintManager printManager){  super((NObject) null); try {  javonetHandle = Javonet.New("PrintPageControl",printManager); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("PropertyChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (PropertyChangedEventHandler handler : _PropertyChangedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], PropertyChangedEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PrintPageControl(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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