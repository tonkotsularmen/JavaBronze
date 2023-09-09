class SuperA { // スーパークラスA
}

final class SuperB { // スーパークラスB
}

class SuperC { // スーパークラスC
  void print() {
  }
}

class SuperD { // スーパークラスD
  final void print() {
  }
}

class SubA extends SuperA {
}

// class SubB extends SuperB {
// } // SuperBにfinalがついているため継承不可

class SubC extends SuperC {
  void print() {
  }
}

class SubD extends SuperD {
  // void print(){} // SuperDのvoid print()メソッドにfinalが付いてるのでオーバーライド不可
}

class Sample7_3 {
}
