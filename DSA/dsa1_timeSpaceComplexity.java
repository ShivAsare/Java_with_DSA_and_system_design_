// public class dsa1_timeSpaceComplexity {
//     public static void main(String[] args) {
//         int[] arr={1,2,3,2,1};
//         int n=arr.length;
//         int flag=0;
//         for (int i = 0; i < n/2; i++) {
//             if(arr[i]!=arr[n-i-1]){
//                 flag =1;
//                 System.out.println("Not Palindrome");
//                 break;
//             }
//         }
//         if(flag ==0){
//             System.out.println("Palindrome");
//         }
//     }
// }

//reverse Array
// public class dsa1_timeSpaceComplexity{
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5};
//         int n=arr.length;

//         for (int i = 0; i < n/2; i++) {
//             int temp=arr[i];
//             arr[i]=arr[n-i-1];
//             arr[n-i-1]=temp;
//            //System.out.println(arr[i]);
//         }
//         //revelsar Array
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
// }
//Dublicate Array
// class dsa1_timeSpaceComplexity{
//     public static void main(String[] args) {
//         int arr[]={1,2,2,3,3,4,5};
//         int n=arr.length;
//         for (int i = 0; i < n; i++) {
//             for (int j= i+1; j < n; j++) {
//                 if(arr[i]==arr[j]){
//                     System.out.println(arr[i]);
//                 }
//             }
//         }
//     }
// }
//Palindrome
// class dsa1_timeSpaceComplexity{
//     public static void main(String[] args) {
//         int[] arr={1,2,3,2,1};
//         int n=arr.length;
//         int flag=0;
//         for (int i = 0; i < n/2; i++) {
//             if(arr[i]!=arr[n-i-1]){
//                 flag=1;
//                 System.out.println("not Palindrome");
//                 break;
//             }
//         }if(flag==0){
//             System.out.println("Palindrome");
//         }
//     }
// }/
class dsa1_timeSpaceComplexity{
    public static void main(String[] args) {
        int array[] ={1,1,1};

        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.println(sum);
    }
}