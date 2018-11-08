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
import Syncfusion.Windows.Primitives.*;
import jio.System.Windows.Media.*;
import jio.System.Windows.*;public class LoopingSelector extends Control implements IDisposable {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public State getState (){ try { return State.valueOf(((NEnum) javonetHandle.get("State")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setDataSource (ILoopingSelectorDataSource value){ try { javonetHandle.set("DataSource",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public ILoopingSelectorDataSource getDataSource (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("DataSource"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSelectedForeground (Brush value){ try { javonetHandle.set("SelectedForeground",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Brush getSelectedForeground (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("SelectedForeground"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setItemTemplate (DataTemplate value){ try { javonetHandle.set("ItemTemplate",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DataTemplate getItemTemplate (){ try { return new DataTemplate((NObject)javonetHandle.get("ItemTemplate"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setItemTemplateSelector (DataTemplateSelector value){ try { javonetHandle.set("ItemTemplateSelector",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DataTemplateSelector getItemTemplateSelector (){ try { return new DataTemplateSelector((NObject)javonetHandle.get("ItemTemplateSelector"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setItemHeight (java.lang.Double value){ try { javonetHandle.set("ItemHeight",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Double getItemHeight (){ try { return javonetHandle.get("ItemHeight");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * SetProperty
	 */
            public void setItemWidth (java.lang.Double value){ try { javonetHandle.set("ItemWidth",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Double getItemWidth (){ try { return javonetHandle.get("ItemWidth");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * SetProperty
	 */
            public void setItemMargin (Thickness value){ try { javonetHandle.set("ItemMargin",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Thickness getItemMargin (){ try { return javonetHandle.get("ItemMargin");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setItemContainerStyle (Style value){ try { javonetHandle.set("ItemContainerStyle",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Style getItemContainerStyle (){ try { return new Style((NObject)javonetHandle.get("ItemContainerStyle"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setAccentBrush (Brush value){ try { javonetHandle.set("AccentBrush",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Brush getAccentBrush (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("AccentBrush"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setIsExpanded (java.lang.Boolean value){ try { javonetHandle.set("IsExpanded",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsExpanded (){ try { return javonetHandle.get("IsExpanded");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetFiled
	 */
            public State get_state (){ try { return State.valueOf(((NEnum) javonetHandle.get("_state")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void set_state (State param){ try { javonetHandle.set("_state",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getDataSourceProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("LoopingSelector").get("DataSourceProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setDataSourceProperty (DependencyProperty param){ try { Javonet.getType("LoopingSelector").set("DataSourceProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getSelectedForegroundProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("LoopingSelector").get("SelectedForegroundProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setSelectedForegroundProperty (DependencyProperty param){ try { Javonet.getType("LoopingSelector").set("SelectedForegroundProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getItemTemplateProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("LoopingSelector").get("ItemTemplateProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setItemTemplateProperty (DependencyProperty param){ try { Javonet.getType("LoopingSelector").set("ItemTemplateProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getItemTemplateSelectorProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("LoopingSelector").get("ItemTemplateSelectorProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setItemTemplateSelectorProperty (DependencyProperty param){ try { Javonet.getType("LoopingSelector").set("ItemTemplateSelectorProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getItemHeightProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("LoopingSelector").get("ItemHeightProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setItemHeightProperty (DependencyProperty param){ try { Javonet.getType("LoopingSelector").set("ItemHeightProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getItemWidthProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("LoopingSelector").get("ItemWidthProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setItemWidthProperty (DependencyProperty param){ try { Javonet.getType("LoopingSelector").set("ItemWidthProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getItemMarginProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("LoopingSelector").get("ItemMarginProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setItemMarginProperty (DependencyProperty param){ try { Javonet.getType("LoopingSelector").set("ItemMarginProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getItemContainerStyleProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("LoopingSelector").get("ItemContainerStyleProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setItemContainerStyleProperty (DependencyProperty param){ try { Javonet.getType("LoopingSelector").set("ItemContainerStyleProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getAccentBrushProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("LoopingSelector").get("AccentBrushProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setAccentBrushProperty (DependencyProperty param){ try { Javonet.getType("LoopingSelector").set("AccentBrushProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getIsExpandedProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("LoopingSelector").get("IsExpandedProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setIsExpandedProperty (DependencyProperty param){ try { Javonet.getType("LoopingSelector").set("IsExpandedProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LoopingSelector (){  super((NObject) null); try {  javonetHandle = Javonet.New("LoopingSelector"); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("IsExpandedChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (DependencyPropertyChangedEventHandler handler : _IsExpandedChangedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], DependencyPropertyChangedEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LoopingSelector(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void UpdateItemTemplate (){ try { javonetHandle.invoke("UpdateItemTemplate");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void OnApplyTemplate (){ try { javonetHandle.invoke("OnApplyTemplate");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Dispose (){ try { javonetHandle.invoke("Dispose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Event
	 */
            private java.util.ArrayList< DependencyPropertyChangedEventHandler> _IsExpandedChangedListeners = new java.util.ArrayList<DependencyPropertyChangedEventHandler>();

            public void addIsExpandedChanged(DependencyPropertyChangedEventHandler toAdd)
            {
                _IsExpandedChangedListeners.add(toAdd);
            }
            public void removeIsExpandedChanged(DependencyPropertyChangedEventHandler toRemove)
            {
                _IsExpandedChangedListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}