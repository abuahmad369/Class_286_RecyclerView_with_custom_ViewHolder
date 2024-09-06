package com.example.class_286_recyclerview_with_custom_viewholder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    HashMap <String, String> hashMap;
    ArrayList <HashMap<String,String>> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("itemType", "BOOK");
        hashMap.put("bookName", "হাউ টু এনালাইজ পিপল লাইক শালর্ক");
        hashMap.put("writerName", "by প্যাট্রিক লাইটম্যান ");
        hashMap.put("bookLink", "https://www.rokomari.com/book/262822/the-four-agreements");
        hashMap.put("bookImage", "https://s3-ap-southeast-1.amazonaws.com/rokomari110/ProductNew20190903/130X186/How_To_Analyze_People_Like_Sherlock-Patrick_Lightman-ee989-423584.png");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemType", "VIDEO");
        hashMap.put("videoTtile", "সূরা কাহফ");
        hashMap.put("videoId", "lW7rrG8oGL8");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemType", "BOOK");
        hashMap.put("bookName", "হাউ টু এনালাইজ পিপল লাইক শালর্ক");
        hashMap.put("writerName", "by প্যাট্রিক লাইটম্যান ");
        hashMap.put("bookLink", "https://www.rokomari.com/book/262822/the-four-agreements");
        hashMap.put("bookImage", "https://s3-ap-southeast-1.amazonaws.com/rokomari110/ProductNew20190903/130X186/How_To_Analyze_People_Like_Sherlock-Patrick_Lightman-ee989-423584.png");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemType", "BOOK");
        hashMap.put("bookName", "হাউ টু এনালাইজ পিপল লাইক শালর্ক");
        hashMap.put("writerName", "by প্যাট্রিক লাইটম্যান ");
        hashMap.put("bookLink", "https://www.rokomari.com/book/262822/the-four-agreements");
        hashMap.put("bookImage", "https://s3-ap-southeast-1.amazonaws.com/rokomari110/ProductNew20190903/130X186/How_To_Analyze_People_Like_Sherlock-Patrick_Lightman-ee989-423584.png");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemType", "VIDEO");
        hashMap.put("videoTtile", "সূরা কাহফ");
        hashMap.put("videoId", "lW7rrG8oGL8");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("itemType", "BOOK");
        hashMap.put("bookName", "হাউ টু এনালাইজ পিপল লাইক শালর্ক");
        hashMap.put("writerName", "by প্যাট্রিক লাইটম্যান ");
        hashMap.put("bookLink", "https://www.rokomari.com/book/262822/the-four-agreements");
        hashMap.put("bookImage", "https://s3-ap-southeast-1.amazonaws.com/rokomari110/ProductNew20190903/130X186/How_To_Analyze_People_Like_Sherlock-Patrick_Lightman-ee989-423584.png");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemType", "VIDEO");
        hashMap.put("videoTtile", "সূরা কাহফ");
        hashMap.put("videoId", "lW7rrG8oGL8");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemType", "BOOK");
        hashMap.put("bookName", "হাউ টু এনালাইজ পিপল লাইক শালর্ক");
        hashMap.put("writerName", "by প্যাট্রিক লাইটম্যান ");
        hashMap.put("bookLink", "https://www.rokomari.com/book/262822/the-four-agreements");
        hashMap.put("bookImage", "https://s3-ap-southeast-1.amazonaws.com/rokomari110/ProductNew20190903/130X186/How_To_Analyze_People_Like_Sherlock-Patrick_Lightman-ee989-423584.png");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemType", "BOOK");
        hashMap.put("bookName", "হাউ টু এনালাইজ পিপল লাইক শালর্ক");
        hashMap.put("writerName", "by প্যাট্রিক লাইটম্যান ");
        hashMap.put("bookLink", "https://www.rokomari.com/book/262822/the-four-agreements");
        hashMap.put("bookImage", "https://s3-ap-southeast-1.amazonaws.com/rokomari110/ProductNew20190903/130X186/How_To_Analyze_People_Like_Sherlock-Patrick_Lightman-ee989-423584.png");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("itemType", "VIDEO");
        hashMap.put("videoTtile", "সূরা কাহফ");
        hashMap.put("videoId", "lW7rrG8oGL8");
        arrayList.add(hashMap);

        XAdapter adapter = new XAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));


    }

//    -------------------------------------------

    private class XAdapter extends RecyclerView.Adapter{

        int BOOK_ITEM = 0;
        int VIDEO_ITEM = 1;
        private class bookViewHolder extends RecyclerView.ViewHolder{

            ImageView imgBook;
            TextView tvBookName,tvWriterName;
            MaterialButton buttonGetBook;

            public bookViewHolder(@NonNull View itemView) {
                super(itemView);

                imgBook = itemView.findViewById(R.id.imgBook);
                tvBookName = itemView.findViewById(R.id.tvBookName);
                tvWriterName = itemView.findViewById(R.id.tvWriterName);
                buttonGetBook = itemView.findViewById(R.id.buttonGetBook);
            }
        }

        private class videoViewHolder extends RecyclerView.ViewHolder{

            TextView tvVideoTitle;
            ImageView imgThumnail;

            public videoViewHolder(@NonNull View itemView) {
                super(itemView);

                tvVideoTitle = itemView.findViewById(R.id.tvVideoTitle);
                imgThumnail = itemView.findViewById(R.id.imgThumnail);
            }
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            LayoutInflater inflater = getLayoutInflater();

            if(viewType == BOOK_ITEM){
                View myView = inflater.inflate(R.layout.item_book, parent, false);
                return new bookViewHolder(myView);

            } else {
                View myView = inflater.inflate(R.layout.item_video,parent,false);
                return new videoViewHolder(myView);
            }

        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

            if(getItemViewType(position)==BOOK_ITEM){
                bookViewHolder myHolder = (bookViewHolder) holder;

                hashMap = arrayList.get(position);

                String bookName = hashMap.get("bookName");
                String writerName = hashMap.get("writerName");
                String bookLink = hashMap.get("bookLink");
                String bookImage = hashMap.get("bookImage");

                myHolder.tvBookName.setText(bookName);
                myHolder.tvWriterName.setText(writerName);

                myHolder.buttonGetBook.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(), bookLink, Toast.LENGTH_SHORT).show();
                    }
                });
                Picasso.get().load(bookImage).into(myHolder.imgBook);
                
            } else if (getItemViewType(position)==VIDEO_ITEM) {
                videoViewHolder myHolder = (videoViewHolder) holder;

                hashMap = arrayList.get(position);

                String videoTtile = hashMap.get("videoTtile");
                String videoId = hashMap.get("videoId");

                String imgUrl = "https://img.youtube.com/vi/"+videoId+"/0.jpg";

                myHolder.tvVideoTitle.setText(videoTtile);
                Picasso.get().load(imgUrl).into(myHolder.imgThumnail);


            }

        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }


        @Override
        public int getItemViewType(int position) {

            hashMap = arrayList.get(position);
            String itemType = hashMap.get("itemType");

            if(itemType.contains("BOOK")){
                return BOOK_ITEM;
            }
            else return VIDEO_ITEM;

        }
    }


}