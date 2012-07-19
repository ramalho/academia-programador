const int atraso = 3000;

void setup() {
  for (int i = 0; i < 14; i++) {
    pinMode(i, OUTPUT);
  }
  Serial.begin(9600);
}

void loop() {
  for (int i = 0; i < 14; i++) {
    Serial.println(i, DEC);
    digitalWrite(i, HIGH);
    delay(atraso);
    digitalWrite(i, LOW);
  }
}
