
#include <ESP8266WiFi.h>
#include <FirebaseArduino.h>

// Set these to run example.
#define FIREBASE_HOST "easy-park-fcb7f-default-rtdb.firebaseio.com" 
#define FIREBASE_AUTH "2GiOvBgqCHQL4CJkpJNvwIqHBc64jVXmJRv5whcx"
#define WIFI_SSID "Ishara"
#define WIFI_PASSWORD "Ish@16326"

int value_A,value_B,value_C,value_D,value_E,value_F,value_G,value_H;

void setup() {
  Serial.begin(9600);
  
  pinMode(D0,INPUT);
  pinMode(D1,INPUT);
  pinMode(D2,INPUT);
  pinMode(D3,INPUT);
  pinMode(D4,INPUT);
  pinMode(D5,INPUT);
  pinMode(D6,INPUT);
  pinMode(D7,INPUT);
 

  // connect to wifi.
  WiFi.begin(WIFI_SSID, WIFI_PASSWORD);
  Serial.print("connecting");
  while (WiFi.status() != WL_CONNECTED) {
    Serial.print(".");
    delay(500);
  }
  Serial.println();
  Serial.print("connected: ");
  Serial.println(WiFi.localIP());
  
  Firebase.begin(FIREBASE_HOST, FIREBASE_AUTH);
}

void loop() {
  value_A = digitalRead(D0);
  value_B = digitalRead(D1);
  value_C = digitalRead(D2);
  value_D = digitalRead(D3);
  value_E = digitalRead(D4);
  value_F = digitalRead(D5);
  value_G = digitalRead(D6);
  value_H = digitalRead(D7);
  
  if(value_A == 0){
    Firebase.setInt("parkA",1);
    Serial.println("park full");
  }else{
    Firebase.setInt("parkA",0);
    Serial.println("park none");
  }


  if(value_B == 0){
    Firebase.setInt("parkB",1);
    Serial.println("park full"); 
  }else{
    Firebase.setInt("parkB",0);
    Serial.println("park none");
  }
  

   if(value_C == 0){
    Firebase.setInt("parkC",1);
    Serial.println("park full");
  }else{
    Firebase.setInt("parkC",0);
    Serial.println("park none");
  }
  

   if(value_D == 0){
    Firebase.setInt("parkD",1);
    Serial.println("park full");
  }else{
    Firebase.setInt("parkD",0);
    Serial.println("park none");
  }
  

   if(value_E == 0){
    Firebase.setInt("parkE",1);
    Serial.println("park full");
  }else{
    Firebase.setInt("parkE",0);
    Serial.println("park none");
  }


   if(value_F == 0){
    Firebase.setInt("parkF",1);
    Serial.println("park full");
  }else{
    Firebase.setInt("parkF",0);
    Serial.println("park none");
  }


   if(value_G == 0){
    Firebase.setInt("parkG",1);
    Serial.println("park full");
  }else{
    Firebase.setInt("parkG",0);
    Serial.println("park none");
  }


   if(value_H == 0){
    Firebase.setInt("parkH",1);
    Serial.println("park full");
  }else{
    Firebase.setInt("parkH",0);
    Serial.println("park none");
  }
}
