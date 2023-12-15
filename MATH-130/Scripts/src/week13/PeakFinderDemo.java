package week13;

public class PeakFinderDemo {
	public static void main(String[] args) {
		int[] array = {1, 1, 2, 1, 1, 10, 10, 10};
		printPeaks(array);
		}
	public static void printPeaks(int[] x) {
		// We start at _idx_ = 1 because _idx_ = 0 cannot be a peak.
		int idx = 1;
		// We stop right before _idx_ = x.length - 1 because the last point
		// cannot be a peak. Notice we use a strict inequality in line 30.
		// LIFE LESSON:
			// YOU CANNOT ACCESS INDEX x.length
			// x[x.length] DOES NOT MAKE SENSE
			// The valid indices are x[0], x[1], x[2], ..., x[x.length - 1]
		int idxMax = x.length - 1;
		// We declare a variable that will count ahead of whatever _idx_ is
		// to determine when we have finished traveling through a flat region
		// in the array.
		int idxAhead;
		// The variable _ocurrence_ will hold the position
		// for a detected peak.
		// If we want the value of the peak
		// we just have to call x[ocurrence].
		int ocurrence;
		// We establish a _while_ loop instead of a _for_ loop
		// because we do not know ahead of time how many indices 
		// we will skip ahead after dealing with flat regions.
		while (idx < idxMax) {
			// If the previous value is less than the current value
			// then we start searching for a peak.
			if (x[idx - 1] < x[idx]) {
				// Initialize _idxAhead_ to be 1 position to the right of the current index.
				idxAhead = idx + 1;
				// While _idxAhead_ is within the length of the array AND we are in a flat region
				// then keep moving _idxAhead_ to the right by one unit.
				while (idxAhead < idxMax && x[idxAhead] == x[idx]) {
					idxAhead += 1;
					}
				// If the value at _idxAhead_ has decreased,
				// that means a peak must exist somewhere between
				// the _idx_ and _idxAhead_.
				// In other words, it must be the case that
				// x[idx - 1] < x[idx] is TRUE
				// AND
				// x[idxAhead] < x[idx] is TRUE
				// so this implies that there is a peak between _idx_ and _idxAhead_.
				if (x[idxAhead] < x[idx]) {
					// Take _ocurrence_ to be the mid point between _idx_ and _idxAhead_.
					// This is so we assign only one peak to flat regions,
					// instead of several points in the flat region.
					ocurrence = (idx + idxAhead) / 2;
					// If we are in this section of the code, a peak must have been found
					// so we print the location of the peak and the value of the peak.
					System.out.print("Found extrema at index: ");
					System.out.println(ocurrence);
					System.out.print("The value of the extrema is: ");
					System.out.println(x[ocurrence]);
					// We update _idx_ to be _idxAhead_ because there can be no more peaks
					// other than the one we just printed.
					idx = idxAhead;
					}
				}
			// Move _idx_ to the right by one, and start the algorithm all over again.
			idx += 1;
			}
		}
	}
