package Syncfusion.Windows.Controls; public enum State{Normal(0L),Expanded(1L),Dragging(2L),Snapping(3L),Flicking(4L),; private long numVal;State(long numVal) {
		        this.numVal = numVal;
		    }
		
		    public long getNumVal() {
		        return numVal;
		    }
            }