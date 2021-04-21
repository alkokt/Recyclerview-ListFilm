package com.example.list;

import java.util.ArrayList;

public class FilmDataSource {
        private static String[] filmNames = {
                "Game of Thrones S1",
                "Game of Thrones S2",
                "Game of Thrones S3",
                "Game of Thrones S4",
                "Game of Thrones S5",
                "Game of Thrones S6",
                "Game of Thrones S7",
                "Game of Thrones S8",
                "The Maze Runner",
                "The Maze Runner: Scroch Trials",
                "The Maze Runner: The Death Cure"
        };

        private static String[] filmDetails = {
                "Ceritanya terjadi di dunia fantasi, terutama di benua Westeros, dengan satu alur cerita terjadi di benua lain di timur, Essos. Seperti novel, season awalnya berfokus pada keluarga bangsawan Eddard \"Ned\" Stark, Warden of the North, yang diminta untuk menjadi King's Hand (penasihat utama) untuk teman lamanya, Raja Robert Baratheon. Apakah yang terjadi dengan Ned?",
                "Di sebuah negeri di mana musim panas berjalan selama beberapa dekade dan musim dingin bisa berlangsung seumur hidup, perjuangan untuk meraih Iron Throne dimulai. Muncul dan membesar dari wilayah selatan, di mana cuaca panas melahirkan rencana-rencana licik, nafsu dan intrik; bergerak menuju daratan timur yang luas dan liar; hingga ke wilayah utara yang membeku, di mana dinding es setinggi 800 kaki melindungi kerajaan dari kegelapan di luar sana. Seluruh raja dan ratu, para ksatria dan pembangkang, kaum pendusta, kalangan bangsawan dan orang-orang jujur semuanya akan ikut dalam persaingan tahta, 'Game of Thrones'.",
                "Rombongan Robb Stark melanjutkan perjalananan ke Harrenhal berharap mereka menemukan pasukan Lannister yang dipimpin The Mountain tapi ternyata kastil itu sudah ditinggalkan oleh The Lannisters dan hanya bersisa mayat tawanan mereka. Padahal Arya baru aja melarikan diri dari situ. Errrrr….. Robb menyelamatkan seorang maester yang terdapat luka terbuka di lehernya dan diobati oleh Talisa Maegyr yang sudah resmi menjadi istrinya.",
                "Tywin memberikan salah satu pedang (aslinya Cuma satu pedang dan besarnya bukan main tapi dibikin jadi dua pedang sama pandai besinya) kepada anak kesayangannya, Jaime. Pedang yang lainnya diberikan kepada Joffrey di pernikahannya nanti. Sementara itu Tyrion menyambut kedatangan Prince Oberyn dari Dorne yang akan menjadi tamu di pernikahan Joffrey. Prince Oberyn ini benci banget sama The Lannisters karena menurutnya kematian Elia, adiknya yang juga istri Rhaegar Targaryen, akibat ulah dari The Mountain yang mana anak buahnya Tywin.",
                "Perang lima raja, pernah berpikir untuk menggambar berakhir, malah memasuki fase baru dan lebih kacau. Westeros di ambang kehancuran dan banyak menangkap apa yang bisa mereka sementara wilayah implodes, seperti mayat membuat sebuah pesta untuk gagak Tywin Lannister sudah mati, ditembak di penasihat oleh putranya kurcaci disalahgunakan panjang Tyrion.",
                "Ramsay mengetahui keberadaan Sansa di Castle Black, dia mengirim pesan pada Jon Snow berisi ancaman menghabisi Rickon yang disanderanya bila tidak membawa Sansa padanya. Sansa membujuk Jon untuk memerangi Ramsay dan merebut kembali Winterfell dan dia akhirnya mengiyakan.",
                "Bersama sekutunya, Daenery mulai menyusun strategi untuk menyerang King’s Landing. Sayangnya armada Euron berhasil menyerang Yara, yang mengakibatkan Yara, Ellaria, and Tyene tertangkap, sedangkan Obara dan Nymeria terbunuh. Theon memilih kabur dan melompat ke lautan. Setelah undangan Tyrion Lannister mengajak Jon Snow bergabung untuk menaklukkan Iron Throne dan juga surat Samwell yang menunjukkan batu dragonglass ada di Dragonstoen dimana wilayah tersebut adalah kekuasaan Daenerys Targaryen, Jon Snow memutuskan untuk berangkat dengan tujuan meminta dukungan Daenerys meghadapi White Walkers.",
                "Akhirnya, Jon Snow bersama pasukannya menangkat satu White Walker untuk menunjukkan pada Cersei Lannister, bahwa makhluk tersebut masih ada dan bisa menghancurkan peradapan manusia. Setelah melihat buktinya, Jon Snow dan pihak Lanniester bekerja sama memerangi makhluk raksasa tersebut. Pertarungan terakhir pun dimulai.",
                "The Maze Runner berkisah tentang sekelompok remaja yang berupaya memecahkan jalan keluar dari perangkap labirin raksasa. Kisahnya bermula ketika seorang remaja laki-laki terbangun dan mendapati dirinya berada di sebuah lapangan berdinding batu tinggi. Pemuda ini terbangun tanpa ingatan apapun kecuali namanya, yaitu Thomas (Dylan O'Brien).",
                "Demi bisa keluar dari kamp, Thomas dan Glader lain bekerja sama memecahkan teka-teki labirin yang dijaga makhluk buas. Setelah berhasil keluar dari labirin, mereka disambut seorang pria bernama Janson (Aiden Gillen), yang membawa mereka ke sebuah fasilitas gedung. Menurut penjelasan Janson, fasilitas tersebut berfungsi menjaga mereka semua dari WCKD, virus Flare, dan serangan makhluk serupa zombie bernama Cranks.",
                "Pada bagian terakhir ini, cerita dibuka dengan usaha Thomas dkk untuk menyelamatkan Minho (Ki Hong Lee). Strateginya, Thomas dkk mencegat rombongan Minho yang sedang dalam perjalanan menuju Last City. Terletak di balik tembok, Last City merupakan kota yang dihuni orang-orang terpilih. Di kota itu, terdapat organisasi WCKD, organisasi yang sedang mencari obat kekebalan virus dengan cara menyiksa orang-orang seperti Minho."
                };

        private static int[] filmImages = {
                R.drawable.s1,
                R.drawable.s2,
                R.drawable.s3,
                R.drawable.s4,
                R.drawable.s5,
                R.drawable.s6,
                R.drawable.s7,
                R.drawable.s8,
                R.drawable.s9,
                R.drawable.s10,
                R.drawable.s11
        };

        static ArrayList<Film> getListData() {
            ArrayList<Film> list = new ArrayList<>();
            for (int position = 0; position < filmNames.length; position++) {
                Film film = new Film();
                film.setName(filmNames[position]);
                film.setDetail(filmDetails[position]);
                film.setPhoto(filmImages[position]);
                list.add(film);
            }
            return list;
        }
}
