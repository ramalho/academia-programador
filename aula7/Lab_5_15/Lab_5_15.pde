#define LDR 5
#define LED_1 14
#define LED_2 1
#define LED_3 3
#define LED_4 4
int luminosidade;
void setup() {
  pinMode(LED_1, OUTPUT);
  pinMode(LED_2, OUTPUT);
  pinMode(LED_3, OUTPUT);  
}
void loop() {
  luminosidade = analogRead(LDR);
  digitalWrite(LED_1, HIGH);
  digitalWrite(LED_2, HIGH);
  digitalWrite(LED_3, HIGH);
  delay(500);
  digitalWrite(LED_1, LOW);
  digitalWrite(LED_2, LOW);
  digitalWrite(LED_3, LOW);
  analogWrite(LED_4, luminosidade/4);
  delay(500);
}
