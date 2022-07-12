package com.example.application;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    MemberServiceImple service = new MemberServiceImple();
    System.out.println(service.greet(2));
    System.out.println(service.getAll());
    ArrayList<Member> list = service.getAll();
    for(Member mem : list) {
      System.out.println(mem.getId() + mem.getName() + "," + mem.getEmail());
    }
  }
}
