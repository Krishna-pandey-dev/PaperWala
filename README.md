# PaperWala
PaperWala is an android application which gets you all the news from around the Globe.
The news API is consumed here and submitted in the never ending Recycler View to get the endless parade of all types of news from around the world in your fingertips.

### System Requirement:
Android Version 7 or below in the debug device
Active internet Connection.

### How to Guide

Add all the dependencies in the gradle file

    implementation 'androidx.appcompat:appcompat:1.2.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.0.1'
    testImplementation 'junit:junit:4.13'
    androidTestImplementation 'androidx.test.ext:junit:1.1.2'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.3.0'
    implementation 'androidx.recyclerview:recyclerview:1.1.0'
    implementation 'androidx.cardview:cardview:1.0.0'
    implementation 'com.google.android.material:material:1.2.1'
    //images
    implementation 'com.github.bumptech.glide:glide:4.11.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.11.0'
    implementation 'de.hdodenhof:circleimageview:3.1.0'
    //network
    implementation 'com.google.code.gson:gson:2.8.6'
    implementation 'com.squareup.retrofit2:retrofit:2.4.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.4.0'
    //Time formatter
    implementation 'org.ocpsoft.prettytime:prettytime:4.0.4.Final'
    implementation 'androidx.legacy:legacy-support-v4:1.0.0'
    
    
Download all the codes
Copy all the all the “res” and “Java” codes form the src folder
Build the app successfully and debug.

### About News API:
News API is a simple HTTP REST API for searching and retrieving live articles from all over the web.
It can help you answer questions like:

•	What top stories is TechCrunch running right now?

•	What new articles were published about the next iPhone today?

•	Has my company or product been mentioned or reviewed by any blogs recently?

You can search for articles with any combination of the following criteria:


•	Keyword or phrase. Eg: find all articles containing the word 'Microsoft'.

•	Date published. Eg: find all articles published yesterday.

•	Source name. Eg: find all articles by 'TechCrunch'.

•	Source domain name. Eg: find all articles published on thenextweb.com.

•	Language. Eg: find all articles written in English.


#### Source : https://newsapi.org/docs


<img src = pictures/ss1.png width = "320" height = "480">
