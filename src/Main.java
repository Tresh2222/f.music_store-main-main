public class Main {

    public static void main(String[] args) {

        Genre classical = new Genre("CLASSICAL");

        Author ElvisPresley = new Author("Elvis", "Presley");

        Music SymphonyNo5 = new Music("Symphony No. 5", ElvisPresley, classical,
                "https://youtu.be/vGJTaP6anOU?si=f0NqVtoWpJJq1iHo", 246, 40);
        Music BlueDanube = new Music("Blue Danube", ElvisPresley, classical,
                "https://youtu.be/gj0Rz-uP4Mk?si=84smzzGA4pZiKDFe", 208, 20);
        Music MoonlightSonata = new Music("Moonlight Sonata", ElvisPresley, classical,
                "https://youtu.be/F5eEvfOyb7k?si=ueyoYe4C8P0kvWJO", 256, 55);
        Music FurElise = new Music("Für Elise", ElvisPresley, classical,
                "https://youtu.be/ixbcvKCl4Jc?si=ikFNKLfeIv-z6uVD", 267, 60);
        Music ClairDeLune = new Music("Clair de Lune", ElvisPresley, classical,
                "https://youtu.be/aNYWl13IWhY?si=UYKRbdmyMpz6-jwP", 256, 40);
        Music Requiem = new Music("Requiem", ElvisPresley, classical,
                "https://youtu.be/1jFklrR1-YA?si=OOyqwwtaBuY-oshZ", 138, 50);

        User Elmirbek = new User("Elmirbek Orozobekov", "Classical", 9999);
        User GustavMahler = new User("Гастав Малер", "Classical", 120);

        GustavMahler.buyMusic(MoonlightSonata, 3);

        Elmirbek.getBalance();
        Elmirbek.buyMusic(SymphonyNo5, 5);
        Elmirbek.buyMusic(BlueDanube, 4);
        Elmirbek.buyMusic(MoonlightSonata, 4);
        Elmirbek.buyMusic(FurElise, 5);
        Elmirbek.buyMusic(ClairDeLune, 5);
        Elmirbek.buyMusic(Requiem, 5);
        Elmirbek.getBalance();
        Elmirbek.getPlaylist();

        GustavMahler.getBalance();
        GustavMahler.buyMusic(SymphonyNo5, 5);
        GustavMahler.buyMusic(BlueDanube, 4);
        GustavMahler.buyMusic(MoonlightSonata, 4);
        GustavMahler.buyMusic(FurElise, 5);
        GustavMahler.buyMusic(ClairDeLune, 5);
        GustavMahler.cashIn(700);
        GustavMahler.buyMusic(SymphonyNo5, 0);
        GustavMahler.buyMusic(SymphonyNo5, -1);
        GustavMahler.buyMusic(SymphonyNo5, 3);
        GustavMahler.buyMusic(Requiem, 9);
        GustavMahler.buyMusic(MoonlightSonata, 0);
        GustavMahler.getBalance();
        GustavMahler.getPlaylist();

        Elmirbek.listenMusic(MoonlightSonata);
        Elmirbek.listenMusic(BlueDanube);
        Elmirbek.listenMusic(FurElise);
        Elmirbek.listenMusic(FurElise);
        Elmirbek.listenMusic(FurElise);
        Elmirbek.listenMusic(FurElise);

        GustavMahler.listenMusic(Requiem);
        GustavMahler.listenMusic(Requiem);
        GustavMahler.listenMusic(Requiem);

        SymphonyNo5.getDownloads();
        SymphonyNo5.getViews();
        SymphonyNo5.getRate();

        SymphonyNo5.openVideo();
    }
}
