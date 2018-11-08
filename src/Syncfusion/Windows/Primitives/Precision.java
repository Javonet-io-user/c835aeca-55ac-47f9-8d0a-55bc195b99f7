package Syncfusion.Windows.Primitives; public enum Precision{Standard(0L),Half(1L),Exact(2L),; private long numVal;Precision(long numVal) {
		        this.numVal = numVal;
		    }
		
		    public long getNumVal() {
		        return numVal;
		    }
            }