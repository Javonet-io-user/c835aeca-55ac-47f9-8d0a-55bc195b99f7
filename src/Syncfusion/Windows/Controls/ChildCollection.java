package Syncfusion.Windows.Controls;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Syncfusion.Windows.Controls.*;
import jio.System.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;public class ChildCollection implements jio.System.Collections.IEnumerable {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.Integer getCount (){ try { return javonetHandle.get("Count");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getIsReadOnly (){ try { return javonetHandle.get("IsReadOnly");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void set_Item (java.lang.Integer index,NObject value){ try { javonetHandle.invoke("set_Item",index,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public NObject get_Item (java.lang.Integer index){ try { return  (NObject) javonetHandle.invoke("get_Item",index);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public ChildCollection (){ try {  javonetHandle = Javonet.New("ChildCollection");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ChildCollection(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Integer IndexOf (NObject item){ try { return javonetHandle.invoke("IndexOf",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public void Insert (java.lang.Integer index,NObject item){ try { javonetHandle.invoke("Insert",index,item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void RemoveAt (java.lang.Integer index){ try { javonetHandle.invoke("RemoveAt",index);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Add (NObject item){ try { javonetHandle.invoke("Add",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Clear (){ try { javonetHandle.invoke("Clear");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean Contains (NObject item){ try { return javonetHandle.invoke("Contains",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void CopyTo (NObject[] array,java.lang.Integer arrayIndex){ try { javonetHandle.invoke("CopyTo",new Object[] {array},arrayIndex);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean Remove (NObject item){ try { return javonetHandle.invoke("Remove",item);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Object GetEnumerator (){ try { return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetEnumerator"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}