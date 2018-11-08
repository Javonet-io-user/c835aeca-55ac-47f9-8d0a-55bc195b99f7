package Syncfusion.Windows.Controls;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Windows.Controls.*;
import Syncfusion.Windows.Controls.*;
import jio.System.*;
import jio.System.Windows.*;public class SfNavigator extends Control {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setActiveItem (NObject value){ try { javonetHandle.set("ActiveItem",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public NObject getActiveItem (){ try { return  (NObject) javonetHandle.get("ActiveItem");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setActiveIndex (java.lang.Integer value){ try { javonetHandle.set("ActiveIndex",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getActiveIndex (){ try { return javonetHandle.get("ActiveIndex");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public ChildCollection getItems (){ try { return new ChildCollection((NObject)javonetHandle.get("Items"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setHost (NObject value){ try { javonetHandle.set("Host",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public NObject getHost (){ try { return  (NObject) javonetHandle.get("Host");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetFiled
	 */
            public static DependencyProperty getActiveItemProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("SfNavigator").get("ActiveItemProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setActiveItemProperty (DependencyProperty param){ try { Javonet.getType("SfNavigator").set("ActiveItemProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getActiveIndexProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("SfNavigator").get("ActiveIndexProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setActiveIndexProperty (DependencyProperty param){ try { Javonet.getType("SfNavigator").set("ActiveIndexProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getHostProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("SfNavigator").get("HostProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setHostProperty (DependencyProperty param){ try { Javonet.getType("SfNavigator").set("HostProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SfNavigator (){  super((NObject) null); try {  javonetHandle = Javonet.New("SfNavigator"); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("Navigated", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (RoutedEventHandler handler : _NavigatedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], RoutedEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SfNavigator(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void Navigate (NObject child){ try { javonetHandle.invoke("Navigate",child);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void UpdateTransform (){ try { javonetHandle.invoke("UpdateTransform");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void OnApplyTemplate (){ try { javonetHandle.invoke("OnApplyTemplate");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Event
	 */
            private java.util.ArrayList< RoutedEventHandler> _NavigatedListeners = new java.util.ArrayList<RoutedEventHandler>();

            public void addNavigated(RoutedEventHandler toAdd)
            {
                _NavigatedListeners.add(toAdd);
            }
            public void removeNavigated(RoutedEventHandler toRemove)
            {
                _NavigatedListeners.remove(toRemove);
            } public enum Direction{Next(0L),Previous(1L),; private long numVal;Direction(long numVal) {
		        this.numVal = numVal;
		    }
		
		    public long getNumVal() {
		        return numVal;
		    }
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}