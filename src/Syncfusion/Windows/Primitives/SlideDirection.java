package Syncfusion.Windows.Primitives; public enum SlideDirection{Up(0L),Down(1L),Left(2L),Right(3L),Default(4L),; private long numVal;SlideDirection(long numVal) {
		        this.numVal = numVal;
		    }
		
		    public long getNumVal() {
		        return numVal;
		    }
            }