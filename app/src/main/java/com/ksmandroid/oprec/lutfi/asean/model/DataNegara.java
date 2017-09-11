package com.ksmandroid.oprec.lutfi.asean.model;

import com.ksmandroid.oprec.lutfi.asean.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lutfi on 10/09/2017.
 */

public class DataNegara {

    private static final String[] namaNegara = {
            "Indonesia",
            "Malaysia",
            "Singapura",
            "Vietnam",
            "Kamboja"
    };

    private static final int[] bendera = {
            R.drawable.indonesia,
            R.drawable.malaysia,
            R.drawable.singapore,
            R.drawable.vietnam,
            R.drawable.cambodia
    };

    private static final String[] keterangan = {
            "Republik Indonesia (RI), umumnya disebut Indonesia, adalah negara di Asia Tenggara yang dilintasi garis khatulistiwa dan berada di antara benua Asia dan Australia serta antara Samudra Pasifik dan Samudra Hindia. Indonesia adalah negara kepulauan terbesar di dunia yang terdiri dari 17.504 pulau, nama alternatif yang biasa dipakai adalah Nusantara. Dengan populasi lebih dari 263.846.946 juta jiwa pada tahun 2016, Indonesia adalah negara berpenduduk terbesar keempat di dunia dan negara yang berpenduduk Muslim terbesar di dunia, dengan lebih dari 220 juta jiwa. Bentuk pemerintahan Indonesia adalah republik, dengan Dewan Perwakilan Rakyat, Dewan Perwakilan Daerah dan Presiden yang dipilih secara langsung.\n\nIbu kota negara Indonesia ialah Jakarta. Indonesia berbatasan darat dengan Malaysia di Pulau Kalimantan, dengan Papua Nugini di Pulau Papua dan dengan Timor Leste di Pulau Timor. Negara tetangga lainnya adalah Singapura, Filipina, Australia, dan wilayah persatuan Kepulauan Andaman dan Nikobar di India.\n" +
                    "\n" +
                    "Sejarah Indonesia banyak dipengaruhi oleh bangsa lainnya. Kepulauan Indonesia menjadi wilayah perdagangan penting setidaknya sejak abad ke-7, yaitu ketika Kerajaan Sriwijaya di Palembang menjalin hubungan agama dan perdagangan dengan Tiongkok dan India. Kerajaan-kerajaan Hindu dan Buddha telah tumbuh pada awal abad Masehi, diikuti para pedagang yang membawa agama Islam, serta berbagai kekuatan Eropa yang saling bertempur untuk memonopoli perdagangan rempah-rempah Maluku semasa era penjelajahan samudra. Setelah berada di bawah penjajahan Belanda, Indonesia yang saat itu bernama Hindia Belanda menyatakan kemerdekaannya di akhir Perang Dunia II. Selanjutnya Indonesia mendapat berbagai hambatan, ancaman dan tantangan dari bencana alam, korupsi, separatisme, proses demokratisasi dan periode perubahan ekonomi yang pesat.",
            "Divide",
            "Perfect",
            "Suicide Squad The Album",
            "V"
    };

    public static List<ItemModel> getListData() {
        List<ItemModel> data = new ArrayList<>();

        //for (int x=0; x<4; x++){
        //buat listitem dari dummy data yang ada, kemudian tampilkan di list

        for (int i = 0; i < namaNegara.length; i++) {
            ItemModel item = new ItemModel();
            //gunakan setter dan getter yang ada di class list item untuk menampilkan data
            item.setNamaNegara(namaNegara[i]);
            item.setBendera(bendera[i]);
            item.setKeterangan(keterangan[i]);
            data.add(item);
        }
        //}
        return data;
    }
}
