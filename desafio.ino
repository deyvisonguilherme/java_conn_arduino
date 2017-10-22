String dado;

void setup() {
  Serial.begin(9600);
  pinMode(LED_BUILTIN, OUTPUT);
}

void loop() {
  if (Serial.available() > 0) {
    dado = Serial.readString();

    if (dado == "0001\n")
      digitalWrite(LED_BUILTIN, HIGH);

    if (dado == "0010\n")
      digitalWrite(LED_BUILTIN, LOW);

  }
}
