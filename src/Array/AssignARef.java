package Array;

public class AssignARef {
    public static void main(String[] args) {
        int nums1[] = new int[10];
        int[] nums2 = new int[10];

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = i;
        }

        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = -i;
        }
        System.out.println("Массив №1: ");
        for (int i = 0; i <nums1.length ; i++) {
            System.out.print(nums1[i] +" ");
        }

        System.out.println("\nМассив №2: ");
        for (Integer integer :nums2) {
            System.out.print(integer + " ");
        }
        //присвоили 2 массиву, ссылку на первый
        nums2 = nums1;

        for (Integer integer :nums2) {
            System.out.println(integer);
        }

    }

}
