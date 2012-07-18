#define LDR 5
#define LED_1 14
#define LED_2 1
#define LED_3 2  
#define LED_4 4
int luminosidade;

void setup() {
  pinMode(LED_1, OUTPUT);
  pinMode(LED_2, OUTPUT);
  pinMode(LED_3, OUTPUT);
  Serial.begin(9600);
}
void loop() {
  luminosidade = analogRead(LDR);
  Serial.println(luminosidade, DEC);
  digitalWrite(LED_1, HIGH);
  digitalWrite(LED_2, HIGH);
  digitalWrite(LED_3, HIGH);
  delay(500);
  digitalWrite(LED_1, LOW);
  digitalWrite(LED_2, LOW);
  digitalWrite(LED_3, LOW);
  analogWrite(LED_4, map(luminosidade, 140, 600, 0, 255));
  delay(500);
}
