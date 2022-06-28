import java.util.*;

public class Main {


    private static int size;

    public static int arraySize(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizi boyutunu giriniz ");
        size = scanner.nextInt();
        return size;
    }

    public static int[] getArray(){
        int[] arr = new int[size];
        Random random= new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10);
        }
        return arr;
    }

    public static int[] arrClone(int[] x){
        int[] arrC = x.clone();
        Arrays.sort(arrC);
        return arrC;
    }

    public static void print(int[] x){
        int[] arr = x;

        int min = arr[0];
        for (int i : arr){
            if (min>i)
                min = i;

        }
        int max = arr[0];
        for (int i : arr){
            if (max<i)
                max = i;

        }
        System.out.println("Min : " + min+ "\n" +
                "Max : " + max + "\n" +
                "Toplam : " + Arrays.stream(arr).sum() + "\n" +
                "Ortalama : " + Arrays.stream(arr).sum()/arr.length);


        System.out.println("Tek sayilar  : " + Arrays.stream(arr).filter(value -> value%2==1).count());
        System.out.println("Tek sayilar toplami : " + Arrays.stream(arr).filter(value -> value%2==1).sum());
        System.out.print("Tek sayı listesi : " );
        for (int i:arr){
            if (i%2 ==1)
                System.out.print(i+ " ");
        }

        System.out.println("\nCift sayilar  : " + Arrays.stream(arr).filter(value -> value%2==0).count());
        System.out.println("Cift sayilar toplami : " + Arrays.stream(arr).filter(value -> value%2==0).sum());
        System.out.print("Cift sayı listesi : ");
        for (int i:arr){
            if (i%2 ==0)
                System.out.print(i+ " ");
        }
        System.out.println();

    }




    public static void main(String[] args) {

        arraySize();
        int[] arr = getArray();
        for (int i: arr)
            System.out.print(i + " ");
        System.out.println();
        int[] cArr = arrClone(arr);
        System.out.println("Clone array");
        for (int i : cArr)
            System.out.print(i + " ");
        System.out.println();

        print(cArr);

        System.out.println(5 + " sayısı  " + Arrays.binarySearch(cArr, 5)+". indexte.");

        Set<Integer> integers = new HashSet<>();
        for (int i : cArr)
            integers.add(i);

        System.out.println("Tekrarsız : " + integers);

    }
}
