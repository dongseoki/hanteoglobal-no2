package com.example;

public class TestCase {
  private int sum;
  private int[] coins;
  private int expected;

  public int getSum() {
    return sum;
  }

  public int[] getCoins() {
    return coins;
  }

  public int getExpected() {
    return expected;
  }

  public TestCase(int sum, int[] coins, int expected) {
    this.sum = sum;
    this.coins = coins;
    this.expected = expected;
  }
}
