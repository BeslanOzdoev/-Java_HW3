package Homework3;

public class Homework3_1 {
    public static void main(String[] args) {
        int[] a = {5, 1, 6, 2, 3, 4, 10, 15, 16, 18, 250, 158};
        mergeSort(a, a.length);
        for (int j : a) System.out.print(j+" ");
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2)
            return;
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        if (n - mid >= 0) System.arraycopy(a, mid, r, 0, n - mid);
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {

            if (l[i] <= r[j])
                a[k++] = l[i++];
            else
                a[k++] = r[j++];

        }
        while (i < left)
            a[k++] = l[i++];
        while (j < right)
            a[k++] = r[j++];
    }
}