package gr.aueb.cf.ch6;

public class FindMissing {

    int getMissing(int[] arr)
    {
        int missing;
        boolean found;
        for(int i = 0; i<arr.length+1; i++) {
            found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) found = true;
                break;
            }
            if(!found) return i;
        }
        return -1;
    }
}
