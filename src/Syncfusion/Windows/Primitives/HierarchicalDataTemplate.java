package Syncfusion.Windows.Primitives;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Windows.*;
import Syncfusion.Windows.Primitives.*;
import jio.System.Windows.Data.*;public class HierarchicalDataTemplate extends DataTemplate {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setItemsSource (Binding value){ try { javonetHandle.set("ItemsSource",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Binding getItemsSource (){ try { return new Binding((NObject)javonetHandle.get("ItemsSource"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setItemTemplate (DataTemplate value){ try { javonetHandle.set("ItemTemplate",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DataTemplate getItemTemplate (){ try { return new DataTemplate((NObject)javonetHandle.get("ItemTemplate"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setTemplate (DataTemplate value){ try { javonetHandle.set("Template",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DataTemplate getTemplate (){ try { return new DataTemplate((NObject)javonetHandle.get("Template"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setItemContainerStyle (Style value){ try { javonetHandle.set("ItemContainerStyle",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Style getItemContainerStyle (){ try { return new Style((NObject)javonetHandle.get("ItemContainerStyle"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public HierarchicalDataTemplate (){  super((NObject) null); try {  javonetHandle = Javonet.New("HierarchicalDataTemplate"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public HierarchicalDataTemplate(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}