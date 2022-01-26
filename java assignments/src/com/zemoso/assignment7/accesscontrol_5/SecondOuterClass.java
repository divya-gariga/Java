package com.zemoso.assignment7.accesscontrol_5;

public class SecondOuterClass {
  public class SecondInnerClass extends OuterClass.InnerClass
  {
      public SecondInnerClass(){
          new OuterClass().super();
      }
  }
}
