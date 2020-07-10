package src.HomeWork3.SortMerge;

public class Merge {

        // Функция для слияния массивов
        public static int[] merge ( int a[], int b[]){
            int[] res = new int[a.length + b.length];
            int i = 0, x = 0, y = 0;
            while (i < a.length && x < b.length) {
                if (a[i] <= b[x]) {
                    res[y] = a[i];
                    i++;
                } else {
                    res[y] = b[x];
                    x++;
                }
                y++;
            }
            while (i < a.length) {
                res[y] = a[i];
                i++;
                y++;
            }
            while (x < b.length) {
                res[y] = b[x];
                x++;
                y++;
            }
            return res;
        }
    }