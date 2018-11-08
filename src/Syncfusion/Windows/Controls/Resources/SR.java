package Syncfusion.Windows.Controls.Resources;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Syncfusion.Windows.Controls.Resources.*;
import jio.System.Reflection.*;
import jio.System.Globalization.*;
import jio.System.*;public class SR {protected NObject javonetHandle; public SR(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static void SetResources (Assembly assembly,java.lang.String _namespace){ try { Javonet.getType("SR").invoke("SetResources",assembly,_namespace);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static void ReleaseResources (){ try { Javonet.getType("SR").invoke("ReleaseResources");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static java.lang.String GetString (CultureInfo culture,java.lang.String name,NObject[] args){ try { return  (java.lang.String) Javonet.getType("SR").invoke("GetString",culture,name,new Object[] {args});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public static java.lang.String GetString (java.lang.String name){ try { return  (java.lang.String) Javonet.getType("SR").invoke("GetString",name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public static java.lang.String GetString (java.lang.String name,NObject[] args){ try { return  (java.lang.String) Javonet.getType("SR").invoke("GetString",name,new Object[] {args});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public static java.lang.String GetString (CultureInfo culture,java.lang.String name){ try { return  (java.lang.String) Javonet.getType("SR").invoke("GetString",culture,name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public static NObject GetObject (CultureInfo culture,java.lang.String name){ try { return  (NObject) Javonet.getType("SR").invoke("GetObject",culture,name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static NObject GetObject (java.lang.String name){ try { return  (NObject) Javonet.getType("SR").invoke("GetObject",name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static java.lang.Boolean GetBoolean (CultureInfo culture,java.lang.String name){ try { return Javonet.getType("SR").invoke("GetBoolean",culture,name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public static java.lang.Boolean GetBoolean (java.lang.String name){ try { return Javonet.getType("SR").invoke("GetBoolean",name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public static java.lang.Byte GetByte (CultureInfo culture,java.lang.String name){ try { return Javonet.getType("SR").invoke("GetByte",culture,name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public static java.lang.Byte GetByte (java.lang.String name){ try { return Javonet.getType("SR").invoke("GetByte",name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public static java.lang.Character GetChar (CultureInfo culture,java.lang.String name){ try { return Javonet.getType("SR").invoke("GetChar",culture,name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static java.lang.Character GetChar (java.lang.String name){ try { return Javonet.getType("SR").invoke("GetChar",name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static java.lang.Double GetDouble (CultureInfo culture,java.lang.String name){ try { return Javonet.getType("SR").invoke("GetDouble",culture,name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * Method
	 */
            public static java.lang.Double GetDouble (java.lang.String name){ try { return Javonet.getType("SR").invoke("GetDouble",name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * Method
	 */
            public static java.lang.Float GetFloat (CultureInfo culture,java.lang.String name){ try { return Javonet.getType("SR").invoke("GetFloat",culture,name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static java.lang.Float GetFloat (java.lang.String name){ try { return Javonet.getType("SR").invoke("GetFloat",name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static java.lang.Integer GetInt (java.lang.String name){ try { return Javonet.getType("SR").invoke("GetInt",name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public static java.lang.Integer GetInt (CultureInfo culture,java.lang.String name){ try { return Javonet.getType("SR").invoke("GetInt",culture,name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public static java.lang.Long GetLong (java.lang.String name){ try { return Javonet.getType("SR").invoke("GetLong",name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static java.lang.Long GetLong (CultureInfo culture,java.lang.String name){ try { return Javonet.getType("SR").invoke("GetLong",culture,name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static java.lang.Short GetShort (CultureInfo culture,java.lang.String name){ try { return Javonet.getType("SR").invoke("GetShort",culture,name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public static java.lang.Short GetShort (java.lang.String name){ try { return Javonet.getType("SR").invoke("GetShort",name);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public static void SetDefaultNamespace (java.lang.String nameSpace){ try { Javonet.getType("SR").invoke("SetDefaultNamespace",nameSpace);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}