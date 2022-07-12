package com.example.application;

import java.util.ArrayList;

public class MemberServiceImple implements MemberService {

  
  @Override
  public String greet(int i) {
    String[] greeting = {"Good Morning", "Hello", "Good evening"};
    return greeting[i];
  }

  @Override
  public ArrayList<Member> getAll() {
    ArrayList<Member> list = new ArrayList<>();
    Member mem1 = new Member(1, "Linda", "linda@example.com");
    Member mem2 = new Member(2,  "james", "james@example.com");

    list.add(mem1);
    list.add(mem2);

    return list;
  }
}
