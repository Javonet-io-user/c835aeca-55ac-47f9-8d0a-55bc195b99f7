package Syncfusion.Windows.Primitives;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Windows.Controls.*;
import Syncfusion.Windows.Primitives.*;
import jio.System.*;
import jio.System.Windows.*;public class Selector extends ItemsControl {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setSelectedIndex (java.lang.Integer value){ try { javonetHandle.set("SelectedIndex",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getSelectedIndex (){ try { return javonetHandle.get("SelectedIndex");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setSelectedItem (NObject value){ try { javonetHandle.set("SelectedItem",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public NObject getSelectedItem (){ try { return  (NObject) javonetHandle.get("SelectedItem");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetFiled
	 */
            public static DependencyProperty getSelectedItemProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("Selector").get("SelectedItemProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setSelectedItemProperty (DependencyProperty param){ try { Javonet.getType("Selector").set("SelectedItemProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getSelectedIndexProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("Selector").get("SelectedIndexProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setSelectedIndexProperty (DependencyProperty param){ try { Javonet.getType("Selector").set("SelectedIndexProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static RoutedEvent getSelectionChangedEvent (){ try { return new RoutedEvent((NObject)Javonet.getType("Selector").get("SelectionChangedEvent"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setSelectionChangedEvent (RoutedEvent param){ try { Javonet.getType("Selector").set("SelectionChangedEvent",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Selector (){  super((NObject) null); try {  javonetHandle = Javonet.New("Selector"); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("SelectionChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (SelectionChangedEventHandler handler : _SelectionChangedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], SelectionChangedEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Selector(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void OnApplyTemplate (){ try { javonetHandle.invoke("OnApplyTemplate");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Event
	 */
            private java.util.ArrayList< SelectionChangedEventHandler> _SelectionChangedListeners = new java.util.ArrayList<SelectionChangedEventHandler>();

            public void addSelectionChanged(SelectionChangedEventHandler toAdd)
            {
                _SelectionChangedListeners.add(toAdd);
            }
            public void removeSelectionChanged(SelectionChangedEventHandler toRemove)
            {
                _SelectionChangedListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}