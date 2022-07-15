
//.......................find the maximum element in the array list.............................
public class Main
{
    public static void main(String[] args){
        double[] B = {23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5};
        int i;
        double max =B[0];
        for (i = 0; i < B.length; i++)
            System.out.print(B[i] + " ");
        for (i = 0; i < B.length; i++) {
            if(B[i]>max)
                max=B[i];
        }
        System.out.println("\nMaximum element : "+max);
    }
}

// 	int[] A={12,4,34,45,56,43,11};
//int max=0;
//
//for(int e:A)
//    System.out.println(e+" ");
//for (int e:A){
//    if(e>max)
//        max=e;
//}
//        System.out.println(max);
//}
//    }

//........................find the minimum element in the array list.....................      
// public class Main
// {
//     public static void main(String[] args){
//         double[] B = {23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5};
//         int i;
//         double min =B[0];
//         for (i = 0; i < B.length; i++)
//             System.out.print(B[i] + " ");
//         for (i = 0; i < B.length; i++) {
//             if(B[i]<min)
//                 min=B[i];
//         }
//         System.out.println("\nMinimum element : "+min);
//     }
// }
