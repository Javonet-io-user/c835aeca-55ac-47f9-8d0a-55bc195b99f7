package Syncfusion.Windows.Controls.Printing; public enum PrintOrientation{Portrait(0L),Landscape(1L),; private long numVal;PrintOrientation(long numVal) {
		        this.numVal = numVal;
		    }
		
		    public long getNumVal() {
		        return numVal;
		    }
            }