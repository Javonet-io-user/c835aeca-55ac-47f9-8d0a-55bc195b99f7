package Syncfusion.Windows.Primitives; public enum ExpandDirection{Down(0L),Up(1L),Left(2L),Right(3L),; private long numVal;ExpandDirection(long numVal) {
		        this.numVal = numVal;
		    }
		
		    public long getNumVal() {
		        return numVal;
		    }
            }