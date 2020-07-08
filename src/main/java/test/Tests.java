package test;

public class Tests {

    public int[] massAfterFour(int[] arr){

        int j = 0;
        boolean isFour = false;
        int lengthNewAr = 0;

        for (int i = arr.length-1; i >=0 ; i--) {
            if (arr[i] == 4){
                isFour = true;
                lengthNewAr = arr.length - i-1;
                break;
            }
        }
        if (!isFour){
            throw new RuntimeException();
        }

        int[] newArray = new int[lengthNewAr];
        for (int i = arr.length - lengthNewAr; i <= arr.length-1 ; i++) {
            newArray[j] = arr[i];
            j++;
        }
        return newArray;
    }

    public boolean fourAndOne(int[] arr){
        boolean isFour = false;
        boolean isOne = false;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 4){
                isFour = true;
            }
            if (arr[i] == 1){
                isOne = true;
            }
            if (arr[i] != 1 && arr[i] != 4 ) {
                isOne = false;
            }
        }

        if (isFour && isOne) {
            return true;
        } else {
            return false;
        }
    }

}
