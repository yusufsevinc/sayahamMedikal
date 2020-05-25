package com.yusufsevinc.sayahammedkal;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class urunler extends AppCompatActivity {
    int current_images;
    int [] images;
    String [] text;
    ImageView imageView;
    TextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urunler);

        textView1 = findViewById(R.id.textView13);
        textView2 = findViewById(R.id.textView15);
        imageView = findViewById(R.id.imageView2);
        text = new String[] {"Yapmış olduğumuz tasarımlar kullanıcımızın işlerini daha da kolay hale getirebilmek için tasarlanmıştır.","Sandalyemizde yer alan çanta bölmesi sayesinde kullanıcımız yanında taşımak zorunda olduğu birçok eşyasını rahatlıkla bu göze koyabilmektedir.","Alt kısımda bulunan akü sayesinde istediği her an cep telefonunu rahatlıkla şarj edebilecektir.","Tekerlekli sandalyemizin sol kol kısmında bulunan iki tuş sayesinde dilediği her an masaj özelliğini aktif hale getirebilecektir. Üst tuşa basıldığında sırt kısmını, alt tuşa basıldığında ise oturma bölgesine masaj yapmaktadır.Tabi her ikisi aynı anda çalışma özellikleride bulunmaktadır.","Tekerlekli sandalyemizin sağ kol(sol kol olarakta sipariş verebilirsiniz) kısmında yer alan tuşa bir sefer  basıldığında sandalyemiz ileri-geri ve sağ-sol hareketlerini gerçekleştirir. Aynı tuşa iki kez basıldığında ise kişi dik bir konuma gelir.Koltuğumuzun orta kısmında bulunan parça ile bacaklara destek sağlanıp ve aynı şekilde de üst kısımda da yer alan emniyet kemerleri ile destek sağlanıp düşme riskini ortadan kaldırcaktır.","Kullanıcımız için sağ üst kısımda yer alan askı sayesinde hırkasını, çantasını vb. eşyalarını asabilmesi mümkündür.","Kar veya yağmur yaması durumlarında ise kurtarıcı olarak yagmur sensörleri yardımı ile pistonlar şemsiyenin açılmasını sağlayabilmektedir. Kapatmak istediği zaman ise yine aynı şekilde sensörler kuruduğunda şemsiye kapanmaktadır."};
       images = new int[]{R.drawable.s1, R.drawable.s2, R.drawable.s3, R.drawable.s4, R.drawable.s5, R.drawable.s6, R.drawable.s7};
    }

    public void change(View view){
        current_images++;
        current_images = current_images % images.length;
        imageView.setImageResource(images[current_images]);
        textView1.setText(text[current_images]);

    }
    public void changeBefore(View view){
        if(current_images > 0){
            current_images--;
            current_images = current_images % images.length;
            imageView.setImageResource(images[current_images]);
            textView1.setText(text[current_images]);
        }





    }

    public void siparis(View view){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(urunler.this);
        alertDialog.setTitle("Bilgilendirme");
        alertDialog.setMessage("Sipariş için lütfen web sitemizi ziyaret ediniz.\n" +
                "         wwww.sayahammedikal.com");
        alertDialog.show();
    }

}
