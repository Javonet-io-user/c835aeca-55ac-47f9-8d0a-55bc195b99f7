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
import jio.System.Windows.Media.*;
import jio.System.Windows.*;public class LoopingSelectorItem extends ContentControl implements IDisposable {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setAccentBrush (Brush value){ try { javonetHandle.set("AccentBrush",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Brush getAccentBrush (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("AccentBrush"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSelectedForeground (Brush value){ try { javonetHandle.set("SelectedForeground",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Brush getSelectedForeground (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("SelectedForeground"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setAlternativeBackground (Brush value){ try { javonetHandle.set("AlternativeBackground",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Brush getAlternativeBackground (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("AlternativeBackground"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setAlternativeBorderBrush (Brush value){ try { javonetHandle.set("AlternativeBorderBrush",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Brush getAlternativeBorderBrush (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("AlternativeBorderBrush"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
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
	 * GetFiled
	 */
            public LoopingSelectorItem.State get_state (){ try { return LoopingSelectorItem.State.valueOf(((NEnum) javonetHandle.get("_state")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void set_state (LoopingSelectorItem.State param){ try { javonetHandle.set("_state",NEnum.fromJavaEnum(param));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getAccentBrushProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("LoopingSelectorItem").get("AccentBrushProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setAccentBrushProperty (DependencyProperty param){ try { Javonet.getType("LoopingSelectorItem").set("AccentBrushProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getSelectedForegroundProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("LoopingSelectorItem").get("SelectedForegroundProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setSelectedForegroundProperty (DependencyProperty param){ try { Javonet.getType("LoopingSelectorItem").set("SelectedForegroundProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getAlternativeBackgroundProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("LoopingSelectorItem").get("AlternativeBackgroundProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setAlternativeBackgroundProperty (DependencyProperty param){ try { Javonet.getType("LoopingSelectorItem").set("AlternativeBackgroundProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getAlternativeBorderBrushProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("LoopingSelectorItem").get("AlternativeBorderBrushProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setAlternativeBorderBrushProperty (DependencyProperty param){ try { Javonet.getType("LoopingSelectorItem").set("AlternativeBorderBrushProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getItemTemplateProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("LoopingSelectorItem").get("ItemTemplateProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setItemTemplateProperty (DependencyProperty param){ try { Javonet.getType("LoopingSelectorItem").set("ItemTemplateProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getItemTemplateSelectorProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("LoopingSelectorItem").get("ItemTemplateSelectorProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setItemTemplateSelectorProperty (DependencyProperty param){ try { Javonet.getType("LoopingSelectorItem").set("ItemTemplateSelectorProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LoopingSelectorItem (){  super((NObject) null); try {  javonetHandle = Javonet.New("LoopingSelectorItem"); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("Click", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandlerTEventArgs<EventArgs> handler : _ClickListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], EventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LoopingSelectorItem(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void SetState (LoopingSelectorItem.State newState,java.lang.Boolean useTransitions){ try { javonetHandle.invoke("SetState",NEnum.fromJavaEnum(newState),useTransitions);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Dispose (){ try { javonetHandle.invoke("Dispose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void OnApplyTemplate (){ try { javonetHandle.invoke("OnApplyTemplate");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Event
	 */
            private java.util.ArrayList< EventHandlerTEventArgs<EventArgs>> _ClickListeners = new java.util.ArrayList<EventHandlerTEventArgs<EventArgs>>();

            public void addClick(EventHandlerTEventArgs<EventArgs> toAdd)
            {
                _ClickListeners.add(toAdd);
            }
            public void removeClick(EventHandlerTEventArgs<EventArgs> toRemove)
            {
                _ClickListeners.remove(toRemove);
            } public enum State{Normal(0L),Expanded(1L),Selected(2L),Disabled(3L),; private long numVal;State(long numVal) {
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