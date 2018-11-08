package Syncfusion.Windows.Controls.Printing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Syncfusion.Windows.Controls.Printing.*;
import jio.System.Windows.Shapes.*;
import jio.System.Windows.*;
import jio.System.ComponentModel.*;
import jio.System.*;public class PrintPageSize implements INotifyPropertyChanged {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setPageSizeName (java.lang.String value){ try { javonetHandle.set("PageSizeName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getPageSizeName (){ try { return  (java.lang.String) javonetHandle.get("PageSizeName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setImagePath (Path value){ try { javonetHandle.set("ImagePath",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Path getImagePath (){ try { return new Path((NObject)javonetHandle.get("ImagePath"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSize (Size value){ try { javonetHandle.set("Size",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Size getSize (){ try { return javonetHandle.get("Size");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public PrintPageSize (){ try {  javonetHandle = Javonet.New("PrintPageSize");javonetHandle.addEventListener("PropertyChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (PropertyChangedEventHandler handler : _PropertyChangedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], PropertyChangedEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PrintPageSize(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
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