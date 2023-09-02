package day01;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        String[] pets={"멍멍이", "야옹이","쩝쩝이"};
        
//        배열 복사
        /*String[] petsCopy=new String[pets.length];

        for (int i = 0; i < pets.length; i++) {
            petsCopy[i]=pets[i];
        }*/

        /*petsCopy[0]=pets[0];
        petsCopy[1]=pets[1];
        petsCopy[2]=pets[2];*/

        String[] petsCopy = Arrays.copyOf(pets, pets.length);

        pets[1]="어흥이";

        //배열 주소

        System.out.println("pets = " + pets);
        System.out.println("petsCopy = " + petsCopy);

        //배열 값
        System.out.println("pets = " + Arrays.toString(pets));
        System.out.println("petsCopy = " + Arrays.toString(petsCopy));
    }
}
