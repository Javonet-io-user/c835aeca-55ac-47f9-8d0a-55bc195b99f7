package jio.System; public enum DayOfWeek{Sunday(0L),Monday(1L),Tuesday(2L),Wednesday(3L),Thursday(4L),Friday(5L),Saturday(6L),; private long numVal;DayOfWeek(long numVal) {
		        this.numVal = numVal;
		    }
		
		    public long getNumVal() {
		        return numVal;
		    }
            }