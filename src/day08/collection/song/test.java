package day08.collection.song;

public class test {
    public static void main(String[] args) {
        ArtistRepository ar = new ArtistRepository();
        ar.addNewArtist("르세라핌", "Unforgive");
        ar.addNewArtist("AOA", "짧은 치마");
        ar.addNewArtist("비투비", "기도");

        System.out.println(ar.isRegistered("비투비"));
        System.out.println(ar.isRegistered("트와이스"));

        System.out.println(ArtistRepository.getArtistList());
    }
}
