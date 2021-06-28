package com.example.pdfviewerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //These are different forms and sources you can get
        //instantiate variables
        pdfView = findViewById(R.id.pdfView);

        //Getting PDF files from assets
    }
}