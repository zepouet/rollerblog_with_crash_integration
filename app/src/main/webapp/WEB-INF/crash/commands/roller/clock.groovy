package crash.commands.base
context.takeAlternateBuffer();
for (int i = 0;i < 10;i++) {
  out.cls();
  out << "Le temps est " + i + "\n";
  out.flush();
  Thread.sleep(1000);
}
