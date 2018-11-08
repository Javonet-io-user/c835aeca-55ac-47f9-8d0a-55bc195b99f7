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
import jio.System.Windows.*;public class HeaderedItemsControl extends ItemsControl {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setHeaderStyle (Style value){ try { javonetHandle.set("HeaderStyle",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Style getHeaderStyle (){ try { return new Style((NObject)javonetHandle.get("HeaderStyle"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setHeader (NObject value){ try { javonetHandle.set("Header",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public NObject getHeader (){ try { return  (NObject) javonetHandle.get("Header");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setHeaderTemplate (DataTemplate value){ try { javonetHandle.set("HeaderTemplate",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DataTemplate getHeaderTemplate (){ try { return new DataTemplate((NObject)javonetHandle.get("HeaderTemplate"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setHeaderTemplateSelector (DataTemplateSelector value){ try { javonetHandle.set("HeaderTemplateSelector",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DataTemplateSelector getHeaderTemplateSelector (){ try { return new DataTemplateSelector((NObject)javonetHandle.get("HeaderTemplateSelector"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetFiled
	 */
            public static DependencyProperty getHeaderStyleProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("HeaderedItemsControl").get("HeaderStyleProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setHeaderStyleProperty (DependencyProperty param){ try { Javonet.getType("HeaderedItemsControl").set("HeaderStyleProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getHeaderProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("HeaderedItemsControl").get("HeaderProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setHeaderProperty (DependencyProperty param){ try { Javonet.getType("HeaderedItemsControl").set("HeaderProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getHeaderTemplateSelectorProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("HeaderedItemsControl").get("HeaderTemplateSelectorProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setHeaderTemplateSelectorProperty (DependencyProperty param){ try { Javonet.getType("HeaderedItemsControl").set("HeaderTemplateSelectorProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getHeaderTemplateProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("HeaderedItemsControl").get("HeaderTemplateProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setHeaderTemplateProperty (DependencyProperty param){ try { Javonet.getType("HeaderedItemsControl").set("HeaderTemplateProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public HeaderedItemsControl (){  super((NObject) null); try {  javonetHandle = Javonet.New("HeaderedItemsControl"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public HeaderedItemsControl(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void PrepareHeaderedItemsControlContainer (NObject item,ItemsControl parentItemsControl){ try { javonetHandle.invoke("PrepareHeaderedItemsControlContainer",item,parentItemsControl);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}