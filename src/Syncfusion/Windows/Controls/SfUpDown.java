package Syncfusion.Windows.Controls;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Windows.Controls.*;
import Syncfusion.Windows.Controls.*;
import jio.System.Windows.*;
import jio.System.Windows.Input.*;
import jio.System.*;
import jio.System.Windows.Media.*;public class SfUpDown extends Control {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setUpCommand (ICommand value){ try { javonetHandle.set("UpCommand",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public ICommand getUpCommand (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("UpCommand"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setDownCommand (ICommand value){ try { javonetHandle.set("DownCommand",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public ICommand getDownCommand (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("DownCommand"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setUpCommandParameter (NObject value){ try { javonetHandle.set("UpCommandParameter",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public NObject getUpCommandParameter (){ try { return  (NObject) javonetHandle.get("UpCommandParameter");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setDownCommandParameter (NObject value){ try { javonetHandle.set("DownCommandParameter",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public NObject getDownCommandParameter (){ try { return  (NObject) javonetHandle.get("DownCommandParameter");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setUpButtonStyle (Style value){ try { javonetHandle.set("UpButtonStyle",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Style getUpButtonStyle (){ try { return new Style((NObject)javonetHandle.get("UpButtonStyle"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setDownButtonStyle (Style value){ try { javonetHandle.set("DownButtonStyle",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Style getDownButtonStyle (){ try { return new Style((NObject)javonetHandle.get("DownButtonStyle"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSpinButtonsAlignment (SpinButtonsAlignment value){ try { javonetHandle.set("SpinButtonsAlignment",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public SpinButtonsAlignment getSpinButtonsAlignment (){ try { return SpinButtonsAlignment.valueOf(((NEnum) javonetHandle.get("SpinButtonsAlignment")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setUpDownContent (NObject value){ try { javonetHandle.set("UpDownContent",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public NObject getUpDownContent (){ try { return  (NObject) javonetHandle.get("UpDownContent");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setAccentBrush (Brush value){ try { javonetHandle.set("AccentBrush",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Brush getAccentBrush (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.get("AccentBrush"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetFiled
	 */
            public static DependencyProperty getUpCommandProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("SfUpDown").get("UpCommandProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setUpCommandProperty (DependencyProperty param){ try { Javonet.getType("SfUpDown").set("UpCommandProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getDownCommandProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("SfUpDown").get("DownCommandProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setDownCommandProperty (DependencyProperty param){ try { Javonet.getType("SfUpDown").set("DownCommandProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getUpCommandParameterProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("SfUpDown").get("UpCommandParameterProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setUpCommandParameterProperty (DependencyProperty param){ try { Javonet.getType("SfUpDown").set("UpCommandParameterProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getDownCommandParameterProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("SfUpDown").get("DownCommandParameterProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setDownCommandParameterProperty (DependencyProperty param){ try { Javonet.getType("SfUpDown").set("DownCommandParameterProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getUpButtonStyleProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("SfUpDown").get("UpButtonStyleProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setUpButtonStyleProperty (DependencyProperty param){ try { Javonet.getType("SfUpDown").set("UpButtonStyleProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getDownButtonStyleProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("SfUpDown").get("DownButtonStyleProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setDownButtonStyleProperty (DependencyProperty param){ try { Javonet.getType("SfUpDown").set("DownButtonStyleProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getSpinButtonsAlignmentProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("SfUpDown").get("SpinButtonsAlignmentProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setSpinButtonsAlignmentProperty (DependencyProperty param){ try { Javonet.getType("SfUpDown").set("SpinButtonsAlignmentProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getUpDownContentProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("SfUpDown").get("UpDownContentProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setUpDownContentProperty (DependencyProperty param){ try { Javonet.getType("SfUpDown").set("UpDownContentProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public static DependencyProperty getAccentBrushProperty (){ try { return new DependencyProperty((NObject)Javonet.getType("SfUpDown").get("AccentBrushProperty"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public static void setAccentBrushProperty (DependencyProperty param){ try { Javonet.getType("SfUpDown").set("AccentBrushProperty",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SfUpDown (){  super((NObject) null); try {  javonetHandle = Javonet.New("SfUpDown"); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("UpButtonClick", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (RoutedEventHandler handler : _UpButtonClickListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], RoutedEventArgs.class));}}});javonetHandle.addEventListener("DownButtonClick", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (RoutedEventHandler handler : _DownButtonClickListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], RoutedEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SfUpDown(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static void OnSpinButtonsAlignmentChanged (DependencyObject obj,DependencyPropertyChangedEventArgs args){ try { Javonet.getType("SfUpDown").invoke("OnSpinButtonsAlignmentChanged",obj,args);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void OnApplyTemplate (){ try { javonetHandle.invoke("OnApplyTemplate");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Event
	 */
            private java.util.ArrayList< RoutedEventHandler> _UpButtonClickListeners = new java.util.ArrayList<RoutedEventHandler>();

            public void addUpButtonClick(RoutedEventHandler toAdd)
            {
                _UpButtonClickListeners.add(toAdd);
            }
            public void removeUpButtonClick(RoutedEventHandler toRemove)
            {
                _UpButtonClickListeners.remove(toRemove);
            }/**
	 * Event
	 */
            private java.util.ArrayList< RoutedEventHandler> _DownButtonClickListeners = new java.util.ArrayList<RoutedEventHandler>();

            public void addDownButtonClick(RoutedEventHandler toAdd)
            {
                _DownButtonClickListeners.add(toAdd);
            }
            public void removeDownButtonClick(RoutedEventHandler toRemove)
            {
                _DownButtonClickListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}