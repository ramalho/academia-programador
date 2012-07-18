#define LDR 5
#define LED_1 8
#define LED_2 6
#define LED_3 13
#define LED_5 5
int luminosidade;
void setup() {
  pinMode(LED_1, OUTPUT);
  pinMode(LED_2, OUTPUT);
  pinMode(LED_3, OUTPUT);  
}
void loop() {
  luminosidade = analogRead(LDR);
  if (luminosidade < 340) {
    digitalWrite(LED_1, HIGH);
  }
  else if (luminosidade >= 340 && luminosidade < 680) {
    digitalWrite(LED_1, HIGH);
    digitalWrite(LED_2, HIGH);
  }
  else if (luminosidade >= 680) {
    digitalWrite(LED_1, HIGH);
    digitalWrite(LED_2, HIGH);
    digitalWrite(LED_3, HIGH);
  }
  delay(20);
  digitalWrite(LED_1, LOW);
  digitalWrite(LED_2, LOW);
  digitalWrite(LED_3, LOW);
  analogWrite(LED_5, luminosidade/4);
}
