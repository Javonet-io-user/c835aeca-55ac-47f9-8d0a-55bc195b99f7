package Syncfusion.Windows.Primitives;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Syncfusion.Windows.Primitives.*;
import jio.System.*;
import jio.System.Collections.Generic.*;
import jio.System.Windows.*;
import jio.System.Windows.Controls.*;public abstract class DataSource implements ILoopingSelectorDataSource {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setSelectedItem (NObject value){ try { javonetHandle.set("SelectedItem",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public NObject getSelectedItem (){ try { return  (NObject) javonetHandle.get("SelectedItem");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetFiled
	 */
            public static RoutedEvent getSelectionChangedEvent (){ try { return new RoutedEvent((NObject)Javonet.getType("DataSource").get("SelectionChangedEvent"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setSelectionChangedEvent (RoutedEvent param){ try { Javonet.getType("DataSource").set("SelectionChangedEvent",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataSource(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Dispose (){ try { javonetHandle.invoke("Dispose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public NObject GetNext (NObject relativeTo){ try { return  (NObject) javonetHandle.invoke("GetNext",relativeTo);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public NObject GetPrevious (NObject relativeTo){ try { return  (NObject) javonetHandle.invoke("GetPrevious",relativeTo);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Integer UpdateMinimumDateTime (java.util.Date relativeDate,java.lang.Integer minuteinterval,java.lang.Integer secondinterval,java.util.Date datetime){ try { return javonetHandle.invoke("UpdateMinimumDateTime",relativeDate,minuteinterval,secondinterval,datetime);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public List<DateTimeWrapper> GetDatePartCollection (java.util.Date relativeDate,java.lang.Integer minuteinterval,java.lang.Integer secondinterval){ try { return new List<DateTimeWrapper>((NObject)javonetHandle.invoke("GetDatePartCollection",relativeDate,minuteinterval,secondinterval));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Event
	 */
            private java.util.ArrayList< EventHandlerTEventArgs<SelectionChangedEventArgs>> _SelectionChangedListeners = new java.util.ArrayList<EventHandlerTEventArgs<SelectionChangedEventArgs>>();

            public void addSelectionChanged(EventHandlerTEventArgs<SelectionChangedEventArgs> toAdd)
            {
                _SelectionChangedListeners.add(toAdd);
            }
            public void removeSelectionChanged(EventHandlerTEventArgs<SelectionChangedEventArgs> toRemove)
            {
                _SelectionChangedListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}