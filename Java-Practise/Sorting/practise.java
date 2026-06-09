public class practise {
public static void main(String[] args) {
    int a[] = {1,2,3};
    int b[] = {2,5,6};
    int c[] = new int[a.length+b.length];
    int i = 0; // Pointer for array a 
    int j = 0; // pointer for array b
    for(int k = 0;k<c.length;k++) {
        if(i < a.length && j< b.length) {
            if(a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
        }
         // case-2 agar array array b ke sare element khatam ho gayhe aur array a ke bache hua hain 
       else if (i < a.length) {
          c[k] = a[i];
          i++;
        }
        else if (j < b.length) {
            c[k] = b[j];
            j++;
        }
    }
     for(int p = 0;p<c.length;p++) {
        System.out.print(c[p]);
     }
}
}