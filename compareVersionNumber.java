/*
You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:
0.1 < 1.1 < 1.2 < 1.13 < 1.13.4

If version1 > version2 return 1,
If version1 < version2 return -1,
otherwise return 0

*/

    public int compareVersion(String A, String B) {
        String[] a = A.split("\\.");
        String[] b = B.split("\\.");
        int i,j;
        for(i=0,j=0;i<a.length && j<b.length;i++,j++) {
            BigInteger aBig = new BigInteger(a[i]);
            BigInteger bBig = new BigInteger(b[j]);
            int r = aBig.compareTo(bBig);
            if(r>0) return 1;
            else if(r<0) return -1;
        }
        
        if(i==a.length && j == b.length) return 0;
        else if(i<a.length) {
            while(i<a.length) {
                BigInteger tmp = new BigInteger(a[i++]);
                if(tmp.compareTo(BigInteger.ZERO)!=0) return 1;
            }
            return 0;
        }
        else {
            while(j<b.length) {
                BigInteger tmp = new BigInteger(b[j++]);
                if(tmp.compareTo(BigInteger.ZERO)!=0) return -1;
            }
            return 0;
            }
        
    }
