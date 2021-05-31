package com.example.apps133_134;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private  MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView=findViewById(R.id.mainRecyclerView_Id);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter=new MyAdapter(this,getList());

        recyclerView.setAdapter(myAdapter);
    }

    private ArrayList<DatasetGet> getList() {

        ArrayList<DatasetGet> getArrayList=new ArrayList<>();


        DatasetGet dataSetGet=new DatasetGet();



        dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Ainul Islam");
        dataSetGet.setDescripiton("Session:11-12");
        dataSetGet.setImg(R.drawable.aynul);
        dataSetGet.setMoblileNumber("01704132344");
        getArrayList.add(dataSetGet);

        dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Mohammad Chan Miah");
        dataSetGet.setDescripiton("Session:11-12");
        dataSetGet.setImg(R.drawable.chan);
        dataSetGet.setMoblileNumber("");
        getArrayList.add(dataSetGet);

        dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Mohoshin khan");
        dataSetGet.setDescripiton("Session:11-12");
        dataSetGet.setImg(R.drawable.mohasin);
        dataSetGet.setMoblileNumber("");
        getArrayList.add(dataSetGet);

        dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Shahinur Rahman Sujon");
        dataSetGet.setDescripiton("Session:11-12");
        dataSetGet.setImg(R.drawable.shaniyer);
        dataSetGet.setMoblileNumber("");
        getArrayList.add(dataSetGet);

        dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Md Forhaj");
        dataSetGet.setDescripiton("Session:12-13");
        dataSetGet.setImg(R.drawable.forhaj);
        dataSetGet.setMoblileNumber("01635130641");
        getArrayList.add(dataSetGet);


        //dataSetGet.setTitile("Mohaiminul Islam Suruj");
     //   dataSetGet.setDescripiton("Session:12-13");
     //   dataSetGet.setImg(R.drawable.maimunulsuruj);
     //   dataSetGet.setMoblileNumber("01776339464");
     //   getArrayList.add(dataSetGet);



        dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Faruk Ahmed Milon");
        dataSetGet.setDescripiton("Session:12-13");
        dataSetGet.setImg(R.drawable.foruk);
        dataSetGet.setMoblileNumber("01740303435");
        getArrayList.add(dataSetGet);

        dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Ainul Islam");
        dataSetGet.setDescripiton("Session:11-12");
        dataSetGet.setImg(R.drawable.aynul);
        dataSetGet.setMoblileNumber("01704132344");
        getArrayList.add(dataSetGet);



        dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Muhammad Rasel");
        dataSetGet.setDescripiton("Session:12-13");
        dataSetGet.setImg(R.drawable.raselvai);
        dataSetGet.setMoblileNumber("01754055727");
        getArrayList.add(dataSetGet);


        dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Abdur Rashid Mia");
        dataSetGet.setDescripiton("Session:12-13");
        dataSetGet.setImg(R.drawable.roshid);
        dataSetGet.setMoblileNumber("01761122009");
        getArrayList.add(dataSetGet);

        dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Moon Layon");
        dataSetGet.setDescripiton("Session:12-13");
        dataSetGet.setImg(R.drawable.layon1);
        dataSetGet.setMoblileNumber("0172270436");
        getArrayList.add(dataSetGet);

       dataSetGet=new DatasetGet();
        dataSetGet.setTitile("MD Mahbub Alam");
        dataSetGet.setDescripiton("Session:13-14");
        dataSetGet.setImg(R.drawable.mahabub);
        dataSetGet.setMoblileNumber("01722431373");
        getArrayList.add(dataSetGet);

       dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Atikur Rahman Atik");
        dataSetGet.setDescripiton("Session:13-14");
        dataSetGet.setImg(R.drawable.atik);
        dataSetGet.setMoblileNumber("01774171326");
        getArrayList.add(dataSetGet);

        dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Samiul Islam Shamim");
        dataSetGet.setDescripiton("Session:13-14");
        dataSetGet.setImg(R.drawable.samiul);
        dataSetGet.setMoblileNumber("01765963011");
        getArrayList.add(dataSetGet);

        dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Md Halim Bàdshàh");
        dataSetGet.setDescripiton("Session:13-14");
        dataSetGet.setImg(R.drawable.halim);
        dataSetGet.setMoblileNumber("01780725933");
        getArrayList.add(dataSetGet);

        dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Md Bellal Hossain");
        dataSetGet.setDescripiton("Session:13-14");
        dataSetGet.setImg(R.drawable.ic_launcher_background);
        dataSetGet.setMoblileNumber("01738785254");
        getArrayList.add(dataSetGet);

        dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Md Mahabul Alam");
        dataSetGet.setDescripiton("Session:14-15");
        dataSetGet.setImg(R.drawable.mahabulislam);
        dataSetGet.setMoblileNumber("01797811295");
        getArrayList.add(dataSetGet);

       dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Md Chand Mia");
        dataSetGet.setDescripiton("Session:15-16");
        dataSetGet.setImg(R.drawable.chad);
        dataSetGet.setMoblileNumber("01765482475");
        getArrayList.add(dataSetGet);

       dataSetGet=new DatasetGet();
        dataSetGet.setTitile("MD. Monjurul Islam(Mim)");
        dataSetGet.setDescripiton("Session:15-16");
        dataSetGet.setImg(R.drawable.mim);
        dataSetGet.setMoblileNumber("01717184898");
        getArrayList.add(dataSetGet);

       dataSetGet=new DatasetGet();
        dataSetGet.setTitile("MD Abdullah Rohon)");
        dataSetGet.setDescripiton("Session:15-16");
        dataSetGet.setImg(R.drawable.abdullah);
        dataSetGet.setMoblileNumber("01797681740");
        getArrayList.add(dataSetGet);

       dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Sykot Ahsan Milon");
        dataSetGet.setDescripiton("Session:15-16");
        dataSetGet.setImg(R.drawable.milon);
        dataSetGet.setMoblileNumber("01776914029");
        getArrayList.add(dataSetGet);

         dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Md Habibur Rahman");
        dataSetGet.setDescripiton("Session:16-17");
        dataSetGet.setImg(R.drawable.habibur);
        dataSetGet.setMoblileNumber("01849417014");
        getArrayList.add(dataSetGet);

        dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Md Abdur Razzak");
        dataSetGet.setDescripiton("Session:16-17");
        dataSetGet.setImg(R.drawable.habibur);
        dataSetGet.setMoblileNumber("01767321718");
        getArrayList.add(dataSetGet);

         dataSetGet=new DatasetGet();
        dataSetGet.setTitile("FD Ferdous Rahman");
        dataSetGet.setDescripiton("Session:17-18");
        dataSetGet.setImg(R.drawable.doyal);
        dataSetGet.setMoblileNumber("01744431962");
        getArrayList.add(dataSetGet);

       dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Md Shadinur Rahamn");
        dataSetGet.setDescripiton("Session:17-18");
        dataSetGet.setImg(R.drawable.shadin);
        dataSetGet.setMoblileNumber("01773653688");
        getArrayList.add(dataSetGet);

       dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Md Ariful Islam");
        dataSetGet.setDescripiton("Session:17-18");
        dataSetGet.setImg(R.drawable.ariful);
        dataSetGet.setMoblileNumber("01318087982");
        getArrayList.add(dataSetGet);

        dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Md Awled Hossain");
        dataSetGet.setDescripiton("Session:17-18");
        dataSetGet.setImg(R.drawable.awlad);
        dataSetGet.setMoblileNumber("01751174012");
        getArrayList.add(dataSetGet);


        dataSetGet=new DatasetGet();
        dataSetGet.setTitile("MD Habibur Rahman Habib");
        dataSetGet.setDescripiton("Session:18-19");
        dataSetGet.setImg(R.drawable.habibursoto);
        dataSetGet.setMoblileNumber("01751174012");
        getArrayList.add(dataSetGet);

        dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Rahadujjaman Riyad");
        dataSetGet.setDescripiton("Session:18-19");
        dataSetGet.setImg(R.drawable.riwaduz);
        dataSetGet.setMoblileNumber("01723279958");
        getArrayList.add(dataSetGet);

        dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Md Ripon Islam");
        dataSetGet.setDescripiton("Session:18-19");
        dataSetGet.setImg(R.drawable.ripon);
        dataSetGet.setMoblileNumber("01737192625");
        getArrayList.add(dataSetGet);


        dataSetGet=new DatasetGet();
        dataSetGet.setTitile("Arif Islam");
        dataSetGet.setDescripiton("Session:18-19");
        dataSetGet.setImg(R.drawable.arifff);
        dataSetGet.setMoblileNumber("01744431962");
        getArrayList.add(dataSetGet);









        return getArrayList;

    }
}
