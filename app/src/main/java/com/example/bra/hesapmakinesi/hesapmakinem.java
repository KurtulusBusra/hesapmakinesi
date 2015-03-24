package com.example.bra.hesapmakinesi;

import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;                  // görüntü için yazdık
import android.view.View.OnClickListener;
import android.widget.TextView;           //textView görüntülenmesi için yazdık
import android.widget.Button;            // butonların gözükmesi için


public class hesapmakinem extends ActionBarActivity implements OnClickListener {

    private float ilkDeger=0;
    private double sonuc=0;        //sonuç ondalıklı olursa diye double
    private String islem;          //işlem türü için string tanımladık

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hesapmakinem);

        //kodlarımızı buraya yazıyoruz...

        final TextView txtView = (TextView) findViewById(R.id.textView);
        // textView de final nesnesi tanımladık
        Button btn1 = (Button) findViewById(R.id.btn1);
        //btn1 i kütüphaneye dahil etmiş olduk nesne tanımladık
        Button btn0 = (Button) findViewById(R.id.btn0);
        Button btn2= (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);
        Button btnTop = (Button) findViewById(R.id.btnTop);
        Button btnCik = (Button) findViewById(R.id.btnCik);
        Button btnCarp = (Button) findViewById(R.id.btnCarp);
        Button btnBöl = (Button) findViewById(R.id.btnBöl);
        final Button btnSil = (Button) findViewById(R.id.btnSil);
        Button btnSonuc = (Button) findViewById(R.id.btnSonuc);

        //şimdi tek tek butonların clicklerini yapalım...
        btn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) { //btn1 e tıklayınca 1 değerini get ile al ve set ile yazdır demek
                txtView.setText(txtView.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                txtView.setText(txtView.getText()+"2"); //eğer view de bir değer varsa onu yaz ve üzerine +2 ekle onu yazdır demek
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                txtView.setText(txtView.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                txtView.setText(txtView.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                txtView.setText(txtView.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                txtView.setText(txtView.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                txtView.setText(txtView.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                txtView.setText(txtView.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                txtView.setText(txtView.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                txtView.setText(txtView.getText()+"0"); //eğer view de bir değer varsa onu yaz ve üzerine +2 ekle onu yazdır demek
            }
        });

        //programda hata yoksa aşağıdaki yer çalışsın der kontrol etmek amacıyla yapılır.
        try{
            btnSil.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    ilkDeger=0;
                    sonuc=0;
                    txtView.setText("");


                }
            });
        }
        catch (Exception c){

        }
        //nesne olarak adı ne yazıldıysa onu yazıyoruz btnTop diye
        try{
            btnTop.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {  //textde eğer bir değer varsa toplar ama eğer bir değer yoksa hata vermemesi için if else yapıyoruz.
                    if(!txtView.getText().toString().equals("")){ //txtde değeri al eğer boş değilse aşağıdakini yap(equals kontrol eder.)
                        //ilk değeri yani stringi al onu floata çevir çünkü; yukarıda nesne olarak ilk değer float tanımlanmıştı. Tür dönüşümü oldu.
                        ilkDeger=Float.parseFloat(txtView.getText().toString());
                        txtView.setText(""); //ilk değeri aldıktan sonra boşalt
                        islem="Toplama";

                    }

                }
            });
        }
        catch (Exception c){

        }
        try{
            btnCik.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!txtView.getText().toString().equals("")){

                        ilkDeger=Float.parseFloat(txtView.getText().toString());
                        txtView.setText("");
                        islem="Cikarma";

                    }

                }
            });
        }
        catch (Exception c){

        }
        try{
            btnCarp.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!txtView.getText().toString().equals("")){

                        ilkDeger=Float.parseFloat(txtView.getText().toString());
                        txtView.setText("");
                        islem="Carpma";

                    }

                }
            });
        }
        catch (Exception c){

        }
        try{
            btnBöl.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(!txtView.getText().toString().equals("")){

                        ilkDeger=Float.parseFloat(txtView.getText().toString());
                        txtView.setText("");
                        islem="Bolme";

                    }

                }
            });
        }
        catch (Exception c){

        }

        btnSonuc.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //texde bişi yokken  btona basılırsa hata vermemesi için ilk değerin olup olmadığını kontrol edelim
                if(!txtView.getText().toString().equals("") && ! String.valueOf(ilkDeger).equals("0")){ //başlangıc değeri 0 oldu içn 0a eşit değilse dedk yani ilk değer varsa
                 if(islem.equals("Toplama")){
                     sonuc=ilkDeger + Float.parseFloat(txtView.getText().toString());

                 }
                    else if(islem.equals("Cikarma")) {
                     sonuc = ilkDeger - Float.parseFloat(txtView.getText().toString());
                 }
                 else if(islem.equals("Carpma")) {
                     sonuc = ilkDeger * Float.parseFloat(txtView.getText().toString());
                 }
                 else if(islem.equals("Bolme")) {
                     sonuc = ilkDeger / Float.parseFloat(txtView.getText().toString());
                 }

                    //artık yazdıralım
                    txtView.setText(String.valueOf(sonuc));
                    ilkDeger=0;
                    sonuc=0;

                }

                else {
                    txtView.setText("Değer Giriniz!!!");
                }

                if(R.id.btnSil==v.getId()){  //click olaylarındaki v ler

                    ilkDeger=0;
                    sonuc=0;
                    txtView.setText("");
                }

            }
        });

    }

    @Override
    public void onClick(View v) {

    }
}
