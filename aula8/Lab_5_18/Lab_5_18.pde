const int NUM_PORTAS = 15;
const int PRIMEIRO_LED = 1;
const int ULTIMO_LED = 9;

int atraso;

void setup() {
  for (int i = 0; i < NUM_PORTAS; i++) {
    pinMode(i, OUTPUT);
  }
}

void loop() {
  int porta;
  for (int led = PRIMEIRO_LED; led <= ULTIMO_LED; led++) {
    switch (led) {
      case 1: porta = 14; break;
      case 7: porta =  8; break;
      case 8: porta =  6; break;
      case 9: porta = 13; break;
      default:
        porta = led - 1;      
    }
    digitalWrite(porta, HIGH);
    delay(ATRASO);
    digitalWrite(porta, LOW);
  }
}
