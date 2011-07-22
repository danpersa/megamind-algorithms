package ro.dix.algorithms.number;

/**
 *
 * @author dix
 */
public class MaximumSubarray {

    static class MaximumSubarrayResult {

        int maxStartIndex;
        int maxEndIndex;
        int maxSum;

        public MaximumSubarrayResult() {
            maxSum = Integer.MIN_VALUE;
        }

        public MaximumSubarrayResult(int maxStartIndex, int maxEndIndex, int maxSum) {
            this.maxStartIndex = maxStartIndex;
            this.maxEndIndex = maxEndIndex;
            this.maxSum = maxSum;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final MaximumSubarrayResult other = (MaximumSubarrayResult) obj;
            if (this.maxStartIndex != other.maxStartIndex) {
                return false;
            }
            if (this.maxEndIndex != other.maxEndIndex) {
                return false;
            }
            if (this.maxSum != other.maxSum) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 41 * hash + this.maxStartIndex;
            hash = 41 * hash + this.maxEndIndex;
            hash = 41 * hash + this.maxSum;
            return hash;
        }

        @Override
        public String toString() {
            return "MaximumSubarrayResult{" + "maxStartIndex=" + maxStartIndex + ", maxEndIndex=" + maxEndIndex + ", maxSum=" + maxSum + "}";
        }
    }

    MaximumSubarrayResult getMaximumSubarray(int[] v) {
        MaximumSubarrayResult result = new MaximumSubarrayResult();
        int currentMaxSum = 0;
        int currentStartIndex = 0;

        for (int currentEndIndex = 0; currentEndIndex < v.length; ++currentEndIndex) {
            currentMaxSum += v[currentEndIndex];
            if (currentMaxSum > result.maxSum) {
                result.maxSum = currentMaxSum;
                result.maxStartIndex = currentStartIndex;
                result.maxEndIndex = currentEndIndex;
            }
            if (currentMaxSum < 0) {
                currentMaxSum = 0;
                currentStartIndex = currentEndIndex + 1;
            }
        }
        return result;
    }
}
