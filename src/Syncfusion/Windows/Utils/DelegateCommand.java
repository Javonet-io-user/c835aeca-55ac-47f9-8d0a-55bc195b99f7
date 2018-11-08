package Syncfusion.Windows.Utils;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Syncfusion.Windows.Utils.*;
import jio.System.*;
import jio.System.Windows.Input.*;public class DelegateCommand implements ICommand {protected NObject javonetHandle; public DelegateCommand (Action<NObject> executeAction,Predicate<NObject> canExecute){ try {  javonetHandle = Javonet.New("DelegateCommand",executeAction,canExecute);javonetHandle.addEventListener("CanExecuteChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler handler : _CanExecuteChangedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], EventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DelegateCommand (Action<NObject> executeAction){ try {  javonetHandle = Javonet.New("DelegateCommand",executeAction);javonetHandle.addEventListener("CanExecuteChanged", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler handler : _CanExecuteChangedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], EventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DelegateCommand(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void UpdateCanExecute (){ try { javonetHandle.invoke("UpdateCanExecute");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean CanExecute (NObject parameter){ try { return javonetHandle.invoke("CanExecute",parameter);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void Execute (NObject parameter){ try { javonetHandle.invoke("Execute",parameter);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Event
	 */
            private java.util.ArrayList< EventHandler> _CanExecuteChangedListeners = new java.util.ArrayList<EventHandler>();

            public void addCanExecuteChanged(EventHandler toAdd)
            {
                _CanExecuteChangedListeners.add(toAdd);
            }
            public void removeCanExecuteChanged(EventHandler toRemove)
            {
                _CanExecuteChangedListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}