package Syncfusion.Windows.Controls; public enum Position{Bottom(0L),Center(1L),Top(2L),Left(3L),Right(4L),; private long numVal;Position(long numVal) {
		        this.numVal = numVal;
		    }
		
		    public long getNumVal() {
		        return numVal;
		    }
            }