
public class Sort {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[10];

        for(int i = 0; i <= arr.length - 1; i++) {
            arr[i] = (int) (Math.random() * 50);
        }

        System.out.println("Массив до сортировки: ");

        for(int i = 0; i <= arr.length - 1; i++) {
            System.out.print("arr[" + i + "] = " + arr[i] + "; ");
        }

        System.out.println();
        //Сортировка пузырьком
        for(int i = 0; i <= arr.length - 1; i++) {
            for(int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }

        System.out.println("Массив после сортировки: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            System.out.print("arr[" + i + "] = " + arr[i] + "; ");
        }
    }
}
